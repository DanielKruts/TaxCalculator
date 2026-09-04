/**
 * TaxProfile
 * Class that holds tax profile information. In a real implementation of this, the class would be used to make numerous profiles with id's indicating who's profile is who's
 */
public class TaxProfile{
    double grossPayPerPeriod;
    PayPeriod payPeriod;
    int personalExemptions;
    int dependentExemptions;
    int firstTimeDependentExemptions;
    int adoptedChildExemptions;
    String county;

    /**
     * Constructs a validated taxpayer profile
     * 
     * @param gpp The gross pay for a single pay period; non-negative
     * @param pp Employee's frequency of pay
     * @param persEx # of personal exemptions claimed
     * @param depEx # of dependent exemptions claimed
     * @param firstEx # of first-time dependent exemptions claimed
     * @param adoptEx # of adopted child exemtpions claimed
     * @param cty Employee's county of residence, must be valid Indiana County
     * @throws IllegalArgumentException If grossPayPerPeriod is negative, any exemption count is negative, or county is not a recognized Indiana County
     */
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