/**
 * RegressionTests
 * @author Daniel Krutsick
 * My suite of regression tests to confirm working performance of the small application
 * @see TaxProfile Class that provides the format of what is in each tax profile
 * @see PayPeriod Class that defines how many number of times an employee is paid each year
 */
public class RegressionTests{
    static int passed = 0;
    static int failed = 0;
    
    /**
     * Initiates the test suite and prints out neatly how many tests passed and how many failed
     */
    public static void main(){
        //Test Suite
        workedExample();
        //correctlyCreatesProfiles();
        testZeroExemptions();
        testExceededExemptions();

        System.out.println("\nPerformance of Regression Tests");
        System.out.println("------------------------------------");
        System.out.format("%-15s%13s\n", "Passed", "Failed");
        System.out.format("%3d%22d\n", passed, failed);
        System.out.println("------------------------------------");
    }

    /**
     * Checks the condition of whether the test passed or failed, then prints out whether it did or not and it's test name, and the failure detail if applicable
     * @param testName The name of the test
     * @param condition The condition that had to be met to pass or fail
     * @param failureDetail The detail about what was expected, but what happened instead
     */
    static void check(String testName, boolean condition, String failureDetail){
        if(condition){
            System.out.println("Pass: " + testName);
            passed++;
        }else{
            System.out.println("Fail: " + testName + " - " + failureDetail);
            failed++;
        }
    }

    /**
     * Comes from the example in How to Compute Withholding for State and County Income Tax Document in resources
     * Checks the calculations get close to correct values 
     */
    static void workedExample(){
        TaxProfile profile = new TaxProfile(800, PayPeriod.WEEKLY, 5, 3, 1, 2, "Kosciusko");
        double deductionConstant = TotalDeductionCalc.calculateDedConst(profile);
        double taxableIncome = TotalDeductionCalc.calcTaxableInc(profile, deductionConstant);

        check("DOR Example - Deduction Constant", Math.abs(deductionConstant - 326.92) < 0.01, "Expected 326.92, got " + deductionConstant);
        check("DOR Example - taxableIncome", Math.abs(taxableIncome - 473.08) < 0.01, "Expected 473.08, got " + taxableIncome);
    }

    //Failed regression test suite, wasn't getting the test to work doing this, probably because dumb
    // static void correctlyCreatesProfiles(){
    //     try{
    //         TaxProfile profile1 = new TaxProfile(800, PayPeriod.BIWEEKLY, 5, -1, 3, 5, "Marion");
    //         passed++;
    //     }catch (IllegalArgumentException e){
    //         System.out.println(e);
    //         failed++;
    //     }
    //     TaxProfile profile2 = new TaxProfile(800, PayPeriod.WEEKLY, -3, 0, 3, 5, "Marion");
    //     TaxProfile profile3 = new TaxProfile(800, PayPeriod.BIWEEKLY, 5, 3, -1, 5, "Marion");
    //     TaxProfile profile4 = new TaxProfile(800, PayPeriod.BIWEEKLY, 5, 2, 3, -77, "Marion");
    //     TaxProfile profile5 = new TaxProfile(-700, PayPeriod.input(8) , 5, 6, 3, 5, "Marion");
    //     TaxProfile profile6 = new TaxProfile(800, PayPeriod.SEMI_MONTHLY, 5, 0, 3, 5, "Marion");
    //     TaxProfile profile7 = new TaxProfile(800, PayPeriod.MONTHLY, 5, 23, 3, 5, "poland");
    //     TaxProfile profile8 = new TaxProfile(800, PayPeriod.WEEKLY, 5, 3, 1, 2, "Hamilton");

    //     try{
    //         //check("Profile 1 - Invalid Dependent Exemptions", profile1 == null, "Expected false, got ");
    //     }catch (IllegalArgumentException e){//Will include a pass for when it correctly catches these errors
    //         System.out.println(e);
    //     }
    // }
    /**
     * Checks to make sure all 0 exemptions claimed results in 0 deductions
     */
    static void testZeroExemptions(){
        TaxProfile profile = new TaxProfile(800.00, PayPeriod.WEEKLY, 0, 0, 0, 0, "Marion");
        double deductionConstant = TotalDeductionCalc.calculateDedConst(profile);

        check("Zero exemptions", deductionConstant == 0, "Expected 0, got " + deductionConstant);
    }
    /**
     * More exempt money then income should result in 0 taxable income, nothing higher, nothing lower
     */
    static void testExceededExemptions(){
        TaxProfile profile = new TaxProfile(800, PayPeriod.BIWEEKLY, 10, 10, 10, 10, "Hamilton");
        double deductionConstant = TotalDeductionCalc.calculateDedConst(profile);
        double taxableIncome = TotalDeductionCalc.calcTaxableInc(profile, deductionConstant);

        check("No Taxable Income", taxableIncome == 0, "Expected 0, got " + taxableIncome);
    }
}