package javaBeans;

public class Main {
    public static void main(String[] args) {
        Rgb colour1 = new Rgb(0,0,1);
    //    colour1.r = 100; -> brak dostępu
        colour1.setR(100);
        colour1.setG(100);
        colour1.setB(100);
        System.out.println(colour1.getR());
        System.out.println(colour1.getG());
        System.out.println(colour1.getB());
        System.out.println(colour1);
        System.out.println(colour1.getClass());

    }
}
