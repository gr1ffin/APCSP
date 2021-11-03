package Geometry;

import java.util.Locale;
import java.util.Scanner;

public class Geometry {
    public void geometryMethod() {
        System.out.println("What are you trying to find?");
        System.out.println("- Volume \n- Surface Area");
        Scanner geoInput = new Scanner(System.in);
        String answerInput = geoInput.nextLine().toUpperCase(Locale.ROOT);
        if (answerInput.contains("VOL")) {
            Volume v  = new Volume();
            v.volumeMethod();
        }
        else if (answerInput.contains("SUR")) {
            Surface s = new Surface();
            s.surfaceMethod();
        }
        else {
            System.out.println("Fail");
        }
    }
}