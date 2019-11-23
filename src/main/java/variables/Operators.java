package variables;

public class Operators {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;
// post inkrementacja
        System.out.println(i++);
        // po wypisaniu zmienna jest inkrementowana
        System.out.println(i);
        // pre deikrementacja
        System.out.println(--j);
        // po wypisaniu
        System.out.println(j);
        // jaki wynik?? i = 6 j = 3
        System.out.println("wynik: " + ((j++) * (--i + j--) + (++i)));
        // 3 * (5 + 4) + (6) = 33

        // sprawdz czy użytkownik jest pełnoletni
        // jeżeli jego wiek jest >= 18 to wypisz jesteś pełnoletni
        // jeśli nie to wypisz nie jesteś pełnoletni
        int age = 44;
        String isMature = age >= 18 ? " jesteś dorosły" : " nie jesteś dorosły";
        System.out.println("Twój wiek to: " +age + " - " + isMature);
        // inna metoda
        System.out.println( age >= 18 ? "Jesteś dorosły" : " Nie jesteś dorosły ");

        //inna metoda
        System.out.printf("Twój wiek to: %d - %s\n", age, isMature);


//        int age1;
//        //utworzenie obiektu scanner pozwalającego na wporwoadzanie wartości d konsoli == system.in
//        Scanner scanner = new Scanner(System.in);
//        // użytykownik wprowadza wartość do zmiennej age typu int metodą nextInt()
//        System.out.println("Wprowadźswój wiek: ");
//        age1 = scanner.nextInt();
//        System.out.println("Twój wiek to: " + age1);


        // pierwsza wersja

//        int age2;
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Wprowadź swój wiek: ");
//        age2 = scanner1.nextInt();
//        System.out.println( age2 >= 0 && age2 <= 120  ? "Jesteś człowiekiem" : " Nie jesteś człowiekiem ");

        // zadanie u michała --- >  poniższe do poprawienia
//        int age3;
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Wprowadź swój wiek: ");
//        age3 = scanner1.nextInt();
//        boolean isHuman = age3 >= 0 && age3 <= 120 ? true : false;
//        String isMature = age3 >= 18 ?  "jesteś dorosły" : "nie jesteś dorosły";
//        System.out.println((isHuman) ? isMature : "ROBOT");



    }
}
