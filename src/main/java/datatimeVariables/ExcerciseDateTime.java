package datatimeVariables;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExcerciseDateTime {

    // znajdź dzień tygodnia w którym się urodziłeś

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1992, 4, 19);
        System.out.println(birthDate.getDayOfWeek().getValue());
        int myDayOfWeek = birthDate.getDayOfWeek().getValue();
        // znajdź ile razy do dziś twoje urodziny przypadały w ten sam dzień tygodniaw którym się urodziłeś
        LocalDate actual = LocalDate.now();
        int counter = 0;
        // 1992 ; 1992 < 2019 ; 1977 + 1
        for (int i = birthDate.getYear(); birthDate.getYear() <= actual.getYear(); birthDate = birthDate.plusYears(1)) {
            if (myDayOfWeek == birthDate.getDayOfWeek().getValue()) {
                System.out.println(birthDate);
                counter++;
            }
        }
        System.out.println("powtórzenie dni tygodnia " + counter);
    }
}
