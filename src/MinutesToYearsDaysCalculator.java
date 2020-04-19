public class MinutesToYearsDaysCalculator {

    private static final String IS_NOT_VALID = "Invalid Value";

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println(IS_NOT_VALID);
        } else {

            int minutesToDays = (int) (minutes / 1440);
            int year = minutesToDays / 365;
            int remainingDays = minutesToDays % 365;

            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }
    }
}
