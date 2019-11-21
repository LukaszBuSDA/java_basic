package datatimeVariables;

import java.time.*;

public class DateTimeVariables {
    public static void getTimeMethods() {
        // czas aktualny
        LocalTime actual = LocalTime.now();
        // czas dowolny
        LocalTime custom = LocalTime.of(10,10,10);
        System.out.println(actual);
        System.out.println(custom);
        LocalTime parsed = LocalTime.parse("12:33:12");
        System.out.println(parsed);
        System.out.println(parsed.getHour() + ":" + parsed.getMinute());
        System.out.println(actual.plusHours(1));
        if (actual.isAfter(custom)){
            System.out.println("czas: " + actual + "jest później");
        }
        else {
            System.out.println("czas: " + custom + " jest później");
        }
        Duration duration = Duration.between(actual,custom);
        System.out.println(duration);
    }
    public static void getDateMethods(){
        LocalDate actualDate = LocalDate.now();
        LocalDate customDate = LocalDate.of(2000,5,22);
        System.out.println(actualDate);
        System.out.println(customDate);

        // porównanie dat
        Period period = Period.between(customDate,actualDate); // różnica arg2 - arg1
        System.out.println(period);
        System.out.println(period.getYears()+ " lat");
        System.out.println(period.getMonths()+ " miesięcy");
        System.out.println(period.getDays()+ " dni");

    }
    public static void getDateTimeMethods(){
        LocalDateTime actual = LocalDateTime.now();
        LocalDateTime custom = LocalDateTime.of(2000,3,2,10,10,10);
        System.out.println(actual);
        System.out.println(custom);
    }

    public static void main(String[] args) {
//        getTimeMethods();
//        getDateMethods();
        getDateTimeMethods();

    }
}
