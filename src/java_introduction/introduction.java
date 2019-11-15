package java_introduction;
// ctrl + /                 ---> daje komentarz jednowierszowy
// ctrl + shift + /        --- > kilkuliniowy  / blokowy
// psvm                     -> generuje   public static void main(String[] args) { }
// musi być znaczek play     > zawiera metode uruchomieniową
// sout                     -> generuje nam   System.out.println(); }
// ctrl + shift + f10       -> run program
// ctrl + D                 - > duplikowanie linii
public class introduction {
   // metoda uruchomieniowa - > automatycznie wygnenerowana jako pierwsza w trakcie projektu

    public static void main(String[] args) {
        // polecenie wypisujące wartość podane w argumencie  na standardowe wyjście

        System.out.println("HALLO WORLD!");
        // pobranie numeru werjsji JRE
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.version"));

// typy danych

        //  byte mySmallNumber = 553233342;    -> błąd zbyt mała precyzja typu danych

        int myFirstNumber = 50040;
        System.out.println("myFirstNumber = "+ myFirstNumber);
        System.out.println("dodawanie liczb: =" + (100 + myFirstNumber));

        double salaryNet = 9150.99;
        int vatTax = 23;
        System.out.println("Kwota netto:" + salaryNet + "zl");
        System.out.println("Kwota brutto:" + ( salaryNet + (1 + (vatTax/100.0))) + "zl");
        // formatowanie wyjścia
        // ln -> newline
        System.out.printf("Kwota brutto: %.2f zł\n", salaryNet * (1 + (vatTax/100.0)));
        System.out.printf("%.2fzł netto to %.2fzł brutto\n", salaryNet, salaryNet * (1 + (vatTax / 100.0)));
        System.out.printf("Liczba: %20.2f\n", salaryNet);


        char smallLetter = 'a';
        char bigLetter = 'A';
        char dotChar = '-';
        System.out.println(smallLetter);
        System.out.println((char) (bigLetter + 10 ));
        System.out.printf("Wypisz ten znak z formatowaniem: %c", dotChar);
        System.out.printf("Znak: %c ma %d numer ASCII\n", dotChar, (int)dotChar);

        boolean isActivated = true;
        System.out.println(isActivated);
        System.out.println(!isActivated);






    }



}
