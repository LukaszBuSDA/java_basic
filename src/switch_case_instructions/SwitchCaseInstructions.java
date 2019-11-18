package switch_case_instructions;

import java.util.Scanner;

public class SwitchCaseInstructions {
    public static void main(String[] args) {
        // CLI -> command line interface

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Witaj w naszej aplikacji");
//        System.out.println("(L) - logowanie");
//        System.out.println("(R) - rejestracja");
//        System.out.println("(Q) - wyjście");
//
//        char decision = scanner.nextLine().toUpperCase().charAt(0);
//        switch (decision) {
//            case 'L':
////            case 'l':
//                System.out.println("logowanie");
//                break;
//            case 'R':
////            case 'r':
//                System.out.println("rejestracja");
//                break;
//            case 'Q':
////            case 'q':
//
//                System.out.println("wyjście");
//                break;
//            default:
//
//                System.out.println("zły wybór");
//                break;
//        }
//
        Grade grade = Grade.dopuszczający;
        switch (grade) {
            case celujący:
                System.out.println("Świetnie jeśteś najlepszy");
                break;
            case bardzo_dobry:
                System.out.println("Jest dobrze!");
                break;
            case dostateczny:
            case dopuszczający:
                System.out.println("Mogło być lepiej");
                break;
            case niedostateczny:
                System.out.println("Tragedia");
                break;


        }

    }
}
