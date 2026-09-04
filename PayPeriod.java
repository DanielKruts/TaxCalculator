/**
 * PayPeriod
 * An enum for default values of each PayPeriod type that an employer would offer
 */
public enum PayPeriod{
    DAILY(365),
    WEEKLY(52),
    BIWEEKLY(26),
    SEMI_MONTHLY(24),
    MONTHLY(12);
    
    final int periodsPerYear;
    /**
     * Replaces the PayPeriods periodsPerYear variable with the integer number of how many paychecks the employee will receive in a year
     * @param ppy The integer value if pay period is not a default defined value, not completely implemented yet to allow for input amount of pay periods per year
     */
    PayPeriod(int ppy){
        this.periodsPerYear = ppy;
    }

    /**
     * @param choice The integer choice given by the prompted user, 1-5, defined by each case value
     * @return A PayPeriod enum that holds the chosen number of payments per year for said employee
     */
    public static PayPeriod input(int choice){
        switch(choice){
            case 1:
                return PayPeriod.DAILY;
            case 2:
                return PayPeriod.WEEKLY;
            case 3:
                return PayPeriod.BIWEEKLY;
            case 4:
                return PayPeriod.SEMI_MONTHLY;
            case 5:
                return PayPeriod.MONTHLY;
            default:
                throw new IllegalArgumentException("Invalid pay period selection.");
        }
    }
}