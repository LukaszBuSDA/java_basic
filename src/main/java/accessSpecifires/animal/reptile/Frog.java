package accessSpecifires.animal.reptile;
// sprawdza czy Frog ma dostęp do składowych klasy reptile

public class Frog {
    public static void main(String[] args) {
        Reptail reptail = new Reptail();
        reptail.name = "Crazy"; // protected widoczny w pakiecie reptail
        System.out.println(reptail.getName());
    }
}
