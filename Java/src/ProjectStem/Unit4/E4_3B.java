package ProjectStem.Unit4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class E4_3B {
    public static void main(String[] args) {
        Scanner userInputInitial = new Scanner(System.in);
        String takeInput = userInputInitial.nextLine()
        if (takeInput.contains("int")) {
            integerDivision();
        }
        else if (takeInput.contains("geo")) {
            geometryMethod();
        }
        else {
            quizMethod();
        }

    }

    public static void integerDivision() {
        System.out.println("What is your name?");
        Scanner userInput = new Scanner(System.in);
        String name = userInput.nextLine();
        System.out.println(name + ", please enter an integer: ");
        System.out.println(name + ", please enter another integer: ");
        int int1 = Integer.parseInt(userInput.nextLine());
        int int2 = Integer.parseInt(userInput.nextLine());
        if (int1 % int2 == 0) {
            System.out.println(int1 + "Is cleanly divisible by" + int2);
        }
        else {
            System.out.println(int1 + "Is NOT cleanly divisible by" + int2);
        }
    }

    public static void geometryMethod() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter in a small decimal number: ");
        double int1 = Double.parseDouble(userInput.nextLine());
        System.out.println("Enter in a large decimal number: ");
        double int2 = Double.parseDouble(userInput.nextLine());
        double randomNum = ThreadLocalRandom.current().nextDouble(int1, int2 + 1);
        double volume = 1.33333333 * Math.PI * Math.pow(randomNum, 3);
    }

    public static void quizMethod() {
        System.out.println("Is the sky blue?");
        String userInput = (new Scanner(System.in).nextLine());
        if (userInput.contains("T")) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect");
        }
    }
}
