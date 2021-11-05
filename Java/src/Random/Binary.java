package Random;

import java.util.Scanner;

public class Binary {
    public static Scanner myObj = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Would you like to convert from Decimal to Binary (A) or Binary to Decimal (B)? \n");

        String choice = myObj.nextLine().toUpperCase();
        if(choice.contains("A")) {
            decimalIn();
        }
        if(choice.contains("B")) {
            binaryIn();
        }
    }
    private static void decimalIn() {
        System.out.println("What number would you like to convert? \n");

        int decimalInput = myObj.nextInt();
        System.out.print(Integer.toBinaryString(decimalInput));
    }

    private static void binaryIn() {
        System.out.println("What number would you like to convert? \n");

        int binaryInput = myObj.nextInt();
        System.out.println(Integer.parseInt(String.valueOf(binaryInput),2));
    }
}