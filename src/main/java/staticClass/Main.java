package staticClass;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {


        User user1 = new User("x", "x");
        System.out.println(user1.getLogin());

        //Owołanien o skłąowej stataycznej
        // 1. Nie wymaga utworzeni obiektu
        // 2. Odwołujemy się poprzedzając skladowa nazwa klasy
        // 3. Jest tylkok jen okpi askladowej statycznej w rmach klasy
        System.out.println(User.globalId);
        User user2 = new User("y","y");
        User.incrementGlobalId();
        System.out.println(User.globalId);
    }
}
