import java.util.Scanner;
/**
 * Calculator that prompts for the raw values of exemptions, gross pay, pay periods in a year, and county to compute the amount of withholding per paycheck.
 * 
 * @author Daniel Krutsick
 */
public class TaxableIncomeCalc{
    /**
     * Prints out the table of important values calculated for withholding money from paychecks
     * @param prof
     */
    private static void printSummaryTable(TaxProfile prof){
        double dedConstant = TotalDeductionCalc.calculateDedConst(prof);
        double taxIncome = TotalDeductionCalc.calcTaxableInc(prof, dedConstant);
        //Applied rates
        double stateTax = taxIncome * CountyTaxRates.STATE_RATE;
        double countyTax = taxIncome * CountyTaxRates.RATES.get(prof.county);
        
        System.out.format("---------------------------------------------------------\n");
        System.out.format("%-27s%23s\n", "Description", "Amount");
        System.out.format("---------------------------------------------------------\n");
        System.out.format("%-27s%23.2f\n", "Gross Pay", prof.grossPayPerPeriod);
        System.out.format("%-27s%23.2f\n", "Deduction Constant", dedConstant);
        System.out.format("%-27s%23.2f\n", "Taxable Income", taxIncome);
        System.out.format("%-27s%23.2f\n", "State Tax Withheld", stateTax);
        System.out.format("%-27s%23.2f\n", "County Tax Withheld", countyTax);
        System.out.format("---------------------------------------------------------\n");
    }
    /**
     * Main method, runs everything in order and formatted semi-nicely to help the employer to fill out prompts correctly
     */
    public static void main(){
        //Definitions
        Scanner in = new Scanner(System.in);//User Input
        boolean done = false;
        TaxProfile profile = null;

        System.out.println("|-----------------------------------------------------------------------------------------------|");//Program Header
        System.out.println("|                               Indiana State Payroll Calc 2026                                 |");
        System.out.println("|-----------------------------------------------------------------------------------------------|");
        //Run till successful profile creation
        while(!done){
            try{
                System.out.print("What is the employee's pay per period?(To two decimal places) ");
                    double tempPay = in.nextDouble();
                System.out.println("Select your pay period:");
                System.out.println("1) Daily(365)");
                System.out.println("2) Weekly(52)");
                System.out.println("3) Biweekly(26)");
                System.out.println("4) Semi-Monthly(24)");
                System.out.println("5) Monthly(12)");
                System.out.print("Enter choice: ");
                    PayPeriod pay = PayPeriod.input(in.nextInt());
                System.out.print("How many personal exemptions have they claimed?(Single Integer) ");
                    int tempPers = in.nextInt();
                System.out.print("How many dependent exemptions have they claimed?(Single Integer) ");
                    int tempDep = in.nextInt();
                System.out.print("How many first time dependent exemptions have they claimed?(Single Integer) ");
                    int tempFirst = in.nextInt();
                System.out.print("How many adopted child exemptions have they claimed?(Single Integer) ");
                    int tempAdopt = in.nextInt();
                System.out.print("In what county do they reside?(Correct spelling matters) ");
                    String tempCounty = in.next();
                    String county = tempCounty.substring(0,1).toUpperCase() + tempCounty.substring(1);
                profile = new TaxProfile(tempPay, pay, tempPers, tempDep, tempFirst, tempAdopt, county);
                done = true;
            } catch (IllegalArgumentException e){
                System.out.println("Invalid Input." + e.getMessage());
            }
        }

        printSummaryTable(profile);
        in.close();//Close scanner connection
    }
}
