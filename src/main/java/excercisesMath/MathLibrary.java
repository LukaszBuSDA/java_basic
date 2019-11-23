package excercisesMath;

public class MathLibrary {
    // 1. zaimplementuj metodę zwracającą średnią wartości
    // typu double podanych w argumencie metody jak tablica

    public static double avg(double[] args) {
        double sum = 0;
        for (double a : args) {
            sum += a; // sum = sum + a;
        }
        return sum / args.length;
    }


    // 2. zaimplementuj metoę potęgującądwie liczby całkowite
    // metoda zwraca wynik działania a przyjmujje jako argumenty kolejno
    // postawę i wykładnik potęgi
    public static int power(int x, int y) {
        int power = 1;
        for (int i = 0; i < y; i++) {
            power *= x;
        }

        return power;
    }

    // 3. n!
    public static long factorial(int n) {
        long factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    // 4. n! - rekurencyjnie
//    public static long factorialR(int n) {
//        if (n > 1) {
//            return n * factorial(1);
//        }
        public static long factorialR(int n) {
            return (n > 1) ? n * factorialR(n - 1) : 1;
        }
            // 5. ciąg fibonacciego
            // suma n elementów ciągu fibonaciego
            // 0 1 1 2 3 5 8
        public static long fiboSum(int n){
        int [] fibo = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;
        int fiboSum = 1;
        for ( int i = 2; i < fibo.length; i++ ){
            fibo[i] = fibo[i-1] + fibo[i-2];
            System.out.println(fibo[i] + " ");
            fiboSum += fibo[i];
        }
        return fiboSum;
        }

//    public static long fiboSum(int n) {
//        if (n == 0 || n == 1) {
//            return 0;
////        }
//        long [] fibo = new long[n];
//        fibo[0] = 0;
//        fibo[1] = 1;
//        System.out.println(fibo[0] + " ");
//        System.out.println(fibo[1] + " ");
//        long fiboSum = 1;
//        for (int i = 2 ; i<)
//        }
        }


