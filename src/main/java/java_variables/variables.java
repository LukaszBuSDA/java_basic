package java_variables;

public class variables {
    public static void main(String[] args) {
        // deklaracja                  ---> rezerwacja miejsca w pamięci wewnętrznej
        // typ nazwaZmiennej;

        int age;
        // inicjalizacja              ---> pierwsze przypisanie wartości

        age = 14;
        System.out.println("Wiek:" + age);
        // deklaracja  i inicjalizacja
        double result = 0.01;
        System.out.println("Wynik:" + result);

        // modyfikacja wartości w zmiennej
        age = age + 5;
        age *=  5;

        // *=   ---->   age * 5
        System.out.println("Wiek:" + age);

        final byte HOURS_IN_DAY = 24;
        final boolean DECISION;
        // HOURS_IN_DAY = 23;      ---> błąd
        DECISION = true;
        // DECISION = false;      ----> błąd




    }
}