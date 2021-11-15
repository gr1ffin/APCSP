package GuessingGame;

import java.util.ArrayList;
import java.util.Random;



public class Guessing {
    public static ArrayList<Integer> computerNumbers = new ArrayList<>();
    public static ArrayList<Integer> userGuesses = new ArrayList<>();
    public static ArrayList<String> pastGuesses = new ArrayList<>();
    public static int wrongSpot = 0;
    public static int correctSpot = 0;
    public static int guessAmount = 0;

    public static void computerGen() {
        Random rand = new Random();
        int newRandom = rand.nextInt(9);
        if (computerNumbers.contains(newRandom)) {
            computerGen();
        }
        else {
            computerNumbers.add(newRandom);
        }
    }

    public static void userGuess() {
        System.out.println(computerNumbers);
        wrongSpot = 0;
        correctSpot = 0;
        for (int b = 0; b < 4; b++) {
            int guessNumber = userGuesses.get(b);
            for (int c = 0; c < 4; c++) {
                if (guessNumber == computerNumbers.get(c)) {
                    wrongSpot += 1;
                }
            }
            if (guessNumber == computerNumbers.get(b)) {
                correctSpot += 1;
            }
        }
        System.out.println(userGuesses);
        if (wrongSpot > 4) {
            System.out.println("Error");
        }
        guessAmount +=1;
        if (correctSpot == 4) {
            System.out.println("Correct");
        }
        else {
            System.out.println(correctSpot + " Correct");
            System.out.println(wrongSpot + " Wrong yet correct");
            pastGuesses.add("\n");
            for (int i = 0; i < 4; i++) {
                pastGuesses.add(String.valueOf(userGuesses.get(i)));
            }
            for (int d = 0; d < 4; d++) {
                userGuesses.set(d, 0);
            }
        }

    }

    public static void initialSet() {
        for (int z = 0; z < 4; z++) {
            userGuesses.add(0);
        }
    }
}
