package Geometry;

import java.util.Locale;
import java.util.Scanner;

public class Volume {
    public static boolean repeat = true;
    public void volumeMethod() {
        System.out.println("What shape would you like to find the area for?");
        System.out.println("- Cube \n- Cylinder \n- Triangular Prism");
        Scanner takeInput = new Scanner(System.in);
        String volumeInput = takeInput.nextLine().toUpperCase(Locale.ROOT);
        while (repeat) {
            if (volumeInput.contains("CUBE")) {
                while (true) {
                    Scanner numberInput = new Scanner(System.in);
                    System.out.println("What is the length of your object?");
                    String length = numberInput.nextLine();
                    System.out.println("What is the width of your object?");
                    String width = numberInput.nextLine();
                    System.out.println("What is the height of your object?");
                    String height = numberInput.nextLine();
                    System.out.println("Your selected values were \nHeight: " + height + "\nLength: " + length + "\nWidth: " + width + "\nIs that correct? (Y/N)");
                    Scanner checkInput = new Scanner(System.in);
                    String correctString = checkInput.nextLine().toUpperCase(Locale.ROOT);
                    if (correctString.contains("Y")) {
                        System.out.println("The area of the cube/rectangle is: " + Integer.parseInt(length) * Integer.parseInt(width) * Integer.parseInt(height));
                        repeat = false;
                        break;
                    } else if (correctString.contains("N")) {
                        System.out.println("Ok, let's try again.");
                    } else {
                        System.out.println("Invalid input, please try again.");
                    }
                }
            } else if (volumeInput.contains("CYL")) {
                while (true) {
                    Scanner numberInput = new Scanner(System.in);
                    System.out.println("What is the radius of the base of your object?");
                    String radius = numberInput.nextLine();
                    System.out.println("What us the height of your object?");
                    String height = numberInput.nextLine();
                    System.out.println("Your selected values were \nRadius: " + radius + "\nHeight: " + height + "\nIs that correct? (Y/N)");
                    Scanner checkInput = new Scanner(System.in);
                    String correctString = checkInput.nextLine().toUpperCase(Locale.ROOT);
                    if (correctString.contains("Y")) {
                        System.out.println("The volume of the cylinder is: " + Math.pow(Integer.parseInt(radius), 2) * Integer.parseInt(height) * Math.PI);
                        repeat = false;
                        break;
                    } else if (correctString.contains("N")) {
                        System.out.println("Ok, let's try again.");
                    } else {
                        System.out.println("Invalid input, please try again.");
                    }

                }
            } else if (volumeInput.contains("TRI")) {
                while (true) {
                    Scanner numberInput = new Scanner(System.in);
                    System.out.println("What is the length of your object?");
                    String length = numberInput.nextLine();
                    System.out.println("What is the width of your object?");
                    String width = numberInput.nextLine();
                    System.out.println("What is the height of your object?");
                    String height = numberInput.nextLine();
                    System.out.println("Your selected values were \nHeight: " + height + "\nLength: " + length + "\nWidth: " + width + "\nIs that correct? (Y/N)");
                    Scanner checkInput = new Scanner(System.in);
                    String correctString = checkInput.nextLine().toUpperCase(Locale.ROOT);
                    if (correctString.contains("Y")) {
                        System.out.println("The area of the triangular prism is: " + 0.5 * Integer.parseInt(length) * Integer.parseInt(height) * Integer.parseInt(width));
                        repeat = false;
                        break;
                    } else if (correctString.contains("N")) {
                        System.out.println("Ok, let's try again.");
                    } else {
                        System.out.println("Invalid input, please try again.");
                    }
                }
            }
            else {
                System.out.println("Invalid Input. Please try again. ");
                repeat = false;
            }
        }
    }
}