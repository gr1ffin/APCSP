package ProjectStem.Unit4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class E4_6B {
    public static ArrayList<Integer> randomNumbers = new ArrayList<>();
    private static int guessAmount = 0;
    public static void main(String[] args) {
        for (int a = 0; a < 4; a++) {
            randomGen();
        }

        System.out.println("What do you think the four numbers are? (0-9)");
        System.out.println("Note - there are no repeating numbers!");
        Scanner guessInput = new Scanner(System.in);
        while (true) {
            int wrongSpot = 0;
            int correctSpot = 0;
            for (int b = 0; b < 4; b++) {
                int guessNumber = Integer.parseInt(guessInput.nextLine());
                for (int c = 0; c < 4; c++) {
                    if (guessNumber == randomNumbers.get(c)) {
                        wrongSpot += 1;
                    }
                }
                if (guessNumber == randomNumbers.get(b)) {
                    correctSpot += 1;
                }
            }
            if (wrongSpot > 4) {
                System.out.println("Error");
            }
            guessAmount += 1;
            if (correctSpot == 4) {
                System.out.println("Hooray! You got all 4 numbers correct! \nThe computer's numbers were " + randomNumbers + "\nIt took you " + guessAmount + " guesses.");
                break;
            }
            else{
                System.out.println("You had " + correctSpot + " numbers in the correct spot. \nYou had " + wrongSpot + " correct numbers but in the wrong spot. ");
            }

            System.out.println("Try Again!");
        }
    }

    public static void randomGen() {
        Random rand = new Random();
        int newRandom = rand.nextInt(9);
        if (randomNumbers.contains(newRandom)) {
            randomGen();
        }
        else {
            randomNumbers.add(newRandom);
        }
    }
}
