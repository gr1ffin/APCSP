package Algebra;

import java.util.Locale;
import java.util.Scanner;

public class Algebra {
    public void algebraMethod() {
        System.out.println("Would you like to use a Calculator or Evaluate an expression at a specific value?\n- Calculator\n- Evaluate\n");
        Scanner userInput = new Scanner(System.in);
        String takeInput = userInput.nextLine().toUpperCase(Locale.ROOT);
        if (takeInput.contains("EVAL")) {
            LinearEquations linearEquation = new LinearEquations();
            linearEquation.linearMethod();

        }
        else if (takeInput.contains("CALC")) {
            Calculator ca = new Calculator();
            ca.calcMethod();
        }
        else {
            System.out.println("fail");
        }
    }
}
