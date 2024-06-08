package app;

public class Main {

    public static void main(String[] args) {
        GivingAdvice advise = new Advise();
          advise.advise(Day.MONDAY);
        advise.advise(Day.THURSDAY);
        advise.advise(Day.WEDNESDAY);
        advise.advise(Day.TUESDAY);
        advise.advise(Day.FRIDAY);
        advise.advise(Day.SATURDAY);
        advise.advise(Day.SUNDAY);

        }
    }

