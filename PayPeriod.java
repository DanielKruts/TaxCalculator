/*
    Defines the employee's pay period in terms of how many paychecks would be given throughout the year
 */
public enum PayPeriod{
    DAILY(365),
    WEEKLY(52),
    BIWEEKLY(26),
    SEMI_MONTHLY(24),
    MONTHLY(12);

    final int periodsPerYear;

    PayPeriod(int ppy){
        this.periodsPerYear = ppy;
    }

    //Makes it easier for me to prompt them to enter a pay period
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