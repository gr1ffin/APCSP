package ProjectStem.Unit4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class E4_6B {
    public static ArrayList<Integer> randomNumbers = new ArrayList<>();
    private static int guessAmount = 0;
    public static void main(String[] args) {
        Random rand = new Random();
        for (int a = 0; a < 4; a++) {
            randomNumbers.add(rand.nextInt(9));
        }
        System.out.println("What do you think the four numbers are?");
        Scanner guessInput = new Scanner(System.in);
        while (true) {
            int z = 0;
            for (int b = 0; b < 4; b++) {
                int guessNumber = Integer.parseInt(guessInput.nextLine());
                if (guessNumber == randomNumbers.get(b)) {
                    z += 1;
                }
            }
            guessAmount += 1;
            if (z == 4) {
                System.out.println("Hooray! You got all 4 numbers correct! \nThe computer's numbers were " + randomNumbers + "\nIt took you " + guessAmount + " guesses.");
                break;
            }
            else{
                System.out.println("Out of all your guesses, you got " + z + " correct.");
            }

            System.out.println("Try Again!");
        }
    }
}
