package Algebra;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public void calcMethod() {
        boolean repeat = true;
        while(repeat) {
            System.out.println("Here is how the calculator works. \nPut your first input, hit Enter. Then the sign (+,-,*,/,^, sq (square root)) cube (cube root), hit Enter. Finally, the second input, hit Enter. \nExample: \n1\n+\n1\nIf you would like to quit at any time, type QUIT.\nInput:\n");
            Scanner userInput = new Scanner(System.in);
            double inputOne = Double.parseDouble(userInput.nextLine());
            String toDo = userInput.nextLine();
            double inputTwo = Double.parseDouble(userInput.nextLine());
            double answer = switch (toDo) {
                case "+" -> inputOne + inputTwo;
                case "-" -> inputOne - inputTwo;
                case "*" -> inputOne * inputTwo;
                case "/" -> inputOne / inputTwo;
                case "^" -> Math.pow(inputOne, inputTwo);
                case "sq" -> Math.sqrt(inputOne);
                case "cube" -> Math.cbrt(inputOne);
                default -> 0;
            };
            System.out.println(answer);
            while(true) {
                Scanner newInput = new Scanner(System.in);
                String continuedOp = newInput.nextLine().toUpperCase(Locale.ROOT);
                if (continuedOp.contains("QUIT")) {repeat = false; break;}
                String continuedInput = newInput.nextLine().toUpperCase(Locale.ROOT);
                if (continuedInput.contains("QUIT")) {repeat = false; break;}
                else {
                    double inputThree = Double.parseDouble(continuedInput);
                    answer = switch (continuedOp) {
                        case "+" -> answer + inputThree;
                        case "-" -> answer - inputThree;
                        case "*" -> answer * inputThree;
                        case "/" -> answer / inputThree;
                        case "^" -> Math.pow(answer, inputThree);
                        case "sq" -> Math.sqrt(answer);
                        case "cube" -> Math.cbrt(answer);
                        default -> answer;
                    };
                    System.out.print(answer);
                }
            }
        }
    }
}