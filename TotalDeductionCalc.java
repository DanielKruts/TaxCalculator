/**
 * TotalDeductionCalc
 * This file simply runs the needed calculations 
 */
public class TotalDeductionCalc{
    public static double calculateDedConst(TaxProfile prof){//Calculate the deduction constant
        double personal = (prof.personalExemptions * 1000.0) / prof.payPeriod.periodsPerYear;
        double dependent = (prof.dependentExemptions * 1500.0) / prof.payPeriod.periodsPerYear;
        double firstTime = (prof.firstTimeDependentExemptions * 1500.0) / prof.payPeriod.periodsPerYear;
        double adopted = (prof.adoptedChildExemptions * 3000.0) / prof.payPeriod.periodsPerYear;
        return personal + dependent + firstTime + adopted;
    }

    /**
     * Taxable income cannot be less than 0, so returns 0 if lower
     * 
     * @param prof The profile passed through the method
     * @param deductionConst The total deduction to gross pay per period
     * @return The taxable amount of money per pay period, is 0.0 if less than 0
     */
    public static double calcTaxableInc(TaxProfile prof, double deductionConst){
        double taxable = prof.grossPayPerPeriod - deductionConst;
        return Math.max(taxable, 0.0);
    }
}