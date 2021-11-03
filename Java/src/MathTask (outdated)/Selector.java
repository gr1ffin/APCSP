import Algebra.Algebra;
import Geometry.Geometry;

import java.util.Locale;
import java.util.Scanner;

public class Selector {
    public void selectorMethod() {
        System.out.println("What would you like to do? \n- Geometry \n- Algebra\n");
        Scanner userInput = new Scanner(System.in);
        String takeInput = userInput.nextLine().toUpperCase(Locale.ROOT);
        if (takeInput.contains("GEO")) {
            Geometry g = new Geometry();
            g.geometryMethod();
        }
        else if (takeInput.contains("ALG")) {
            Algebra a = new Algebra();
            a.algebraMethod();
        }
        else {
            System.out.println("Invalid Input. Please try again.");

        }
    }
}