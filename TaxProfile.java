public class TaxProfile{
    double grossPayPerPeriod;//The total amount of money paid to the employee per paycheck
    PayPeriod payPeriod;
    int personalExemptions;//Range from military to disabilties for what is claimed in this section
    int dependentExemptions;//Claiming any dependents/children under your name
    int firstTimeDependentExemptions;//For the first year of claiming a dependent, another field with claims that is 1500 per
    int adoptedChildExemptions;
    String county;

    //Constructor
    public TaxProfile(double gpp, PayPeriod pp, int persEx, int depEx, int firstEx, int adoptEx, String cty){
        if(gpp < 0){
            throw new IllegalArgumentException("Gross pay cannot be negative " + gpp);
        }

        if(persEx < 0 || depEx < 0 || firstEx < 0 || adoptEx < 0){
            throw new IllegalArgumentException("Exemptions cannot be negative");
        }

        if(pp == null){
            throw new IllegalArgumentException("Pay period must be specified");
        }

        if(cty == null || !CountyTaxRates.RATES.containsKey(cty)){
            throw new IllegalArgumentException("Unknown county: " + cty);
        }

        this.grossPayPerPeriod = gpp;
        this.payPeriod = pp;
        this.personalExemptions = persEx;
        this.dependentExemptions = depEx;
        this.firstTimeDependentExemptions = firstEx;
        this.adoptedChildExemptions = adoptEx;
        this.county = cty;
    }
}