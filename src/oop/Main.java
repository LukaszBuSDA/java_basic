package oop;

import java.util.Scanner;

public class Main {
    //klasa głóna uruchomieniow
    public static void main(String[] args) {
        // utworzenieobiektu
        User userOne = new User();
        // odwołanie do pola klasowego
        userOne.name = "Michał";
        userOne.lastName = "Abcde";
        userOne.gender = 'M';
        userOne.activated = false;
        userOne.salary_net = 2000;

        // wywołanie do metody
        userOne.printUser();

        User userTwo = new User("Adam","Kowalski", 'M', false, 4000);
        userTwo.printUser();
        User userThree = new User("Anna", "Nowak", 'K', true, 8000);
        userThree.printUser();
        // ===============================
        // USER THEREEE na gicie

        double salaryGross = userOne.calculateSalaryGross();
        System.out.println("salaryGross = " + salaryGross);
        System.out.println("Calculated salary gross: " + userTwo.calculateSalaryGross());
        System.out.println(userThree.modifyUserParameters(15000,false));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź imię: ");
        String name = scanner.nextLine();
        System.out.println("Wprowadź nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Wprowadź pleć: ");
        char gender = scanner.nextLine().charAt(0);
        System.out.println("Wprowadź pensję: ");
        double salary_net = scanner.nextDouble();
        User userFour = new User(name, lastName, gender, true, salary_net);
        userFour.printUser();
    }
}
