package excercises;

import javax.imageio.ImageTranscoder;

public class MainEx1 {
    public static void main(String[] args) {
        double [] array = {2.5, 1, 5.5, 2};
        System.out.println(MathLibrary.avg(array));

        System.out.println(MathLibrary.power(2,4));

        System.out.println(MathLibrary.factorial(5));

        System.out.println(MathLibrary.factorialR(5));

        System.out.println(MathLibrary.fiboSum(3));
    }

}
