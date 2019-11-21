package accessSpecifires;

import accessSpecifires.animal.Animal;
import accessSpecifires.animal.mammal.Mammal;
import accessSpecifires.animal.reptile.Reptail;

public class Main {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.setAge(10);
        System.out.println(mammal);

        Reptail reptail = new Reptail();
//        System.out.println(reptail.name);  // nie jest widoczny poza pakietem reptail
//        System.out.println(reptile.getName()); // j/w
        Animal animal = new Animal();
     //   animal.speed; // private nie jest dostępny poza pakietem animal
     //   animal.getSpeed();
    }
}
