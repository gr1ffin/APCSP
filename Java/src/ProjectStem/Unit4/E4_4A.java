package ProjectStem.Unit4;

import java.util.Scanner;

public class E4_4A {
    public static void main(String[] args) {
        Scanner userInputInitial = new Scanner(System.in);
        String takeInput = userInputInitial.nextLine();
        if (takeInput.contains("while")) {
            whileLoop();

        }
        else if (takeInput.contains("color")) {
            favoriteColor();
        }
        else {
            calculateSum();
        }
    }

    public static void whileLoop() {
        while (true) {
            System.out.println("Pick an integer 1-100");
            Scanner userInput = new Scanner(System.in);
            int takeInput = Integer.parseInt(userInput.nextLine());
            if (takeInput < 1 || takeInput > 100) {
                System.out.println("Invalid Number");
            }
            else {
                System.out.println("Thank you, valid input.");
                break;
            }
        }
    }

    public static void favoriteColor() {
        int x = 1;
        String favColor = "BLACK";
        System.out.println("Can you guess my favorite color?");
        Scanner userInputInitial = new Scanner(System.in);
        while (true) {
            String colorGuess = userInputInitial.nextLine();
            if (colorGuess.toUpperCase().contains(favColor)) {
                System.out.println("Correct! " + colorGuess + " is my favorite color!");
                break;
            } else {
                System.out.println(colorGuess + " is not my favorite color! Try again. ");
            }
        }
    }

    public static void calculateSum() {
        double x = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many numbers do you have to add?");
        int takeInput = Integer.parseInt(userInput.nextLine());
        int i = 0;
        while (takeInput > i) {
            Scanner NumberInput = new Scanner(System.in);
            System.out.println("Number " + (i + 1));
            double numberInput = Double.parseDouble(userInput.nextLine());
            x += numberInput;
            System.out.println("Current value: " + x);
            i++;
        }
        System.out.println("Final Value: " + x);

    }
}
