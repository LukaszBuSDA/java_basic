package java_variables;

import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
//       // utworzenie obiektu Scanner
//        Scanner scanner = new Scanner(System.in);
//
//        // woriwadzan kuczbe
//        System.out.println("Wprowadź liczbę całkowitą");
//        int number = scanner.nextInt();  // enter czyli \n
//        // aby skonsumować ENTER wykonujemy metodę nextLine
//        scanner.nextLine();
//
//        // wprowadzam napis
//        System.out.println("Wprowadź napis: ");
//        String text  = scanner.nextLine();
//        // zamknięcie połączenia
//
//        System.out.printf("Wprowadziłeś: %d i %s", number, text);
//        scanner.close();

        // utworzenie obiektu Scanner
        Scanner scanner = new Scanner(System.in);

        // woriwadzan kuczbe
        System.out.printf("Wprowadź liczbę zmiennoprzecinkową");
        double number = scanner.nextDouble();  // enter czyli \n
        // aby skonsumować ENTER wykonujemy metodę nextLine
        scanner.nextLine();

        // wprowadzam napis
        System.out.printf("Wprowadź napis: ");
        String text  = scanner.nextLine();


        // zamknięcie połączenia

        System.out.printf("Wprowadziłeś: %d i %s", number, text);
        scanner.close();


        // u michała
    }
}
