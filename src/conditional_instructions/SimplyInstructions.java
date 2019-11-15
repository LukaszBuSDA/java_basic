package conditional_instructions;

import java.util.Scanner;

public class SimplyInstructions {
    public static void main(String[] args) {
//        int age = 7555;
//        if (age >= 0 && age <= 120){
//            System.out.println("Człowiek - sorawdzam dalej");
//            if (age > 18) {
//                System.out.println("człowiek dorosły");
//            }else if (age == 18) {
//                System.out.println("człowiek 18lat ");
//            }
//            } else {
//            System.out.println("ROBOT");

        // sorawdz czy liczba podana przez uzytkownika jest parzysta
        // jeśli tak wypisz parzyszta
        // jesli nie wypisz niepatrzysta
        // jesli zero wypisz zero


        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dowolną liczbę: ");
     int liczba = scanner.nextInt();

        if (liczba == 0) {
            System.out.println("ZERO");
        }
         else if (liczba % 2 == 0) {
            System.out.println("Podana liczba jest parzysta.");
        } else{
            System.out.println("Podana liczba nie jest parzysta.");


        }

    }
}
