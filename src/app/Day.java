package app;



public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}
    class DayOfType {

        static String getDayType(Day day) {
            if (day == Day.MONDAY || day == Day.TUESDAY || day == Day.WEDNESDAY || day == Day.THURSDAY) {
                return "WorkingDay";
            } else if (day == Day.FRIDAY) {
                return "Preweekend";
            } else if (day == Day.SATURDAY || day == Day.SUNDAY) {
                return "Weekend";
            }
             return "Error by day!";
        }
    }
        class Advise implements GivingAdvice{
        @Override
      public void advise(Day day) {
            String dayType = DayOfType.getDayType(day);
            switch (dayType) {
                case "WorkingDay":
                    System.out.println("Turn on!");
                    break;
                case "Preweekend":
                    System.out.println("Happy Friday!");
                    break;
                case "Weekend":
                    System.out.println("Exhale. Can go to the park and breathe");
                    break;

            }
        }
    }

