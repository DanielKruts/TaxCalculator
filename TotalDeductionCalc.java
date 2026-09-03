public class TotalDeductionCalc{
    public static double calculateDedConst(TaxProfile prof){//Calculate the deduction constant
        double personal = (prof.personalExemptions * 1000) / prof.payPeriod.periodsPerYear;
        System.out.println("Personal reduction: " + personal);
        double dependent = (prof.dependentExemptions * 1500) / prof.payPeriod.periodsPerYear;
        System.out.println("Dependent reduction: " + dependent);
        double firstTime = (prof.firstTimeDependentExemptions * 1500) / prof.payPeriod.periodsPerYear;
        System.out.println("First time reduction: " + firstTime);
        double adopted = (prof.adoptedChildExemptions * 3000) / prof.payPeriod.periodsPerYear;
        System.out.println("Adopted reduction: " + adopted);
        return personal + dependent + firstTime + adopted;
    }

    //Taxable income cannot be less than 0, so returns 0 if lower
    public static double calcTaxableInc(TaxProfile prof, double deductionConst){
        double taxable = prof.grossPayPerPeriod - deductionConst;
        return Math.max(taxable, 0.0);
    }
}