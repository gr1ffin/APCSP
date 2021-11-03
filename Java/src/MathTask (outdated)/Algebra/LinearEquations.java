package Algebra;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearEquations {
    public void linearMethod() {
        ArrayList<Double> coefficients = new ArrayList<>();
        ArrayList<String> equation = new ArrayList<>();
        System.out.println("How many Coefficients are there in the equation? Include the constant value.");
        int i = Integer.parseInt(new Scanner(System.in).nextLine()) - 1;
        Scanner addCo = new Scanner(System.in);
        System.out.println("List all of the coefficients in order. Put each one at a new line, hitting enter ONCE after each value. Include the constant. ");
        for (int a = 0; a <= i; a++) {
            coefficients.add(Double.parseDouble(addCo.nextLine()));
        }
        System.out.println("What value of x is the function being evaluated at?");
        double x = Double.parseDouble(new Scanner(System.in).nextLine());
        double value = 0;
        int c = i;
        for(int b = 0; b <= i; b++) {
            value += coefficients.get(b) * Math.pow(x, coefficients.size() -1 - b);
            String toAdd;
            if ( c == 0) {
                toAdd = String.valueOf(coefficients.get(b));
            }
            else {
                toAdd = coefficients.get(b) + "x^" + (coefficients.size() - 1 - b);
            }
            c = c-1;
            equation.add(toAdd);

        }
        System.out.println("Equation: " + equation);
        System.out.println("Value of equation when x equals " + x + " = " + value);

    }
}
