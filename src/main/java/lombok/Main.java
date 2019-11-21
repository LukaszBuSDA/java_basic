package lombok;

import javaBeans.Rgb;

public class Main {
    public static void main(String[] args) {
        AnnotationsLombok annotationsLombok = new AnnotationsLombok("lukasz","123","LB");
        // jest getter
        System.out.println(annotationsLombok.getLogin());
        // jest setter
        annotationsLombok.setLogin("XXX");
        // jest toString
        System.out.println(annotationsLombok);

        Rgb rgb = new Rgb(1,2,3);
        System.out.println(rgb);

    }
}
