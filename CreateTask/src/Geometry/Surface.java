package Geometry;

import java.util.Locale;
import java.util.Scanner;


public class Surface {
    public void surfaceMethod() {
        System.out.println("What object are you trying to find the surface area for?");
        System.out.println("- Rectangular Prism\n- Sphere\n- Cylinder\n- Triangular Prism\n- Pyramid");
        Scanner typeInput = new Scanner(System.in);
        String takeInput = typeInput.nextLine().toUpperCase(Locale.ROOT);
        if (takeInput.contains(("RECT"))) {
            while (true) {
                Scanner numberInput = new Scanner(System.in);
                System.out.println("What is the length of the rectangular prism?");
                double length = Double.parseDouble(numberInput.nextLine());
                System.out.println("What is the width of the rectangular prism?");
                double width = Double.parseDouble(numberInput.nextLine());
                System.out.println("What is the height of the rectangular prism?");
                double height = Double.parseDouble(numberInput.nextLine());
                System.out.println("Your selected values were \nHeight: " + height + "\nLength: " + length + "\nWidth: " + width + "\nIs that correct? (Y/N)");
                Scanner checkInput = new Scanner(System.in);
                String correctString = checkInput.nextLine().toUpperCase(Locale.ROOT);
                if (correctString.contains("Y")) {
                    System.out.println("The area of the rectangular prism is: " + 2 * length * height * width);
                    break;
                } else if (correctString.contains("N")) {
                    System.out.println("Ok, let's try again.");
                } else {
                    System.out.println("Invalid input, please try again.");
                }
            }
        }
        else if (takeInput.contains("SPH")) {
            while (true) {
                Scanner numberInput = new Scanner(System.in);
                System.out.println("What is the radius of the base of your object?");
                double radius = Double.parseDouble(numberInput.nextLine());
                System.out.println("Your selected values were \nRadius: " + radius + "\nIs that correct? (Y/N)");
                Scanner checkInput = new Scanner(System.in);
                String correctString = checkInput.nextLine().toUpperCase(Locale.ROOT);
                if (correctString.contains("Y")) {
                    System.out.println("The volume of the sphere is: " + 4 * Math.PI * Math.pow(radius, 3));
                    break;
                } else if (correctString.contains("N")) {
                    System.out.println("Ok, let's try again.");
                } else {
                    System.out.println("Invalid input, please try again.");
                }
            }
        }
        else if (takeInput.contains("CYL")) {
            while (true) {
                Scanner numberInput = new Scanner(System.in);
                System.out.println("What is the radius of the base of your object?");
                double radius = Double.parseDouble(numberInput.nextLine());
                System.out.println("Your selected values were \nRadius: " + radius + "\nIs that correct? (Y/N)");
                Scanner checkInput = new Scanner(System.in);
                String correctString = checkInput.nextLine().toUpperCase(Locale.ROOT);
                if (correctString.contains("Y")) {
                    System.out.println("The volume of the cylinder is: " + 4 * Math.PI * Math.pow(radius, 2));
                    break;
                } else if (correctString.contains("N")) {
                    System.out.println("Ok, let's try again.");
                } else {
                    System.out.println("Invalid input, please try again.");
                }

            }
        }
        else if (takeInput.contains("TRI")) {
            while(true) {
                Scanner numberInput = new Scanner(System.in);
                System.out.println("What is the length of the triangular prism?");
                double length = Double.parseDouble(numberInput.nextLine());
                System.out.println("What is the base of the triangular prism?");
                double base = Double.parseDouble(numberInput.nextLine());
                System.out.println("What is the height of the triangular prism?");
                double height = Double.parseDouble(numberInput.nextLine());
                System.out.println("What is the side of the triangular prism?");
                double side = Double.parseDouble(numberInput.nextLine());
                System.out.println("Your selected values were \nLength: " + length + "\nHeight: " + height + "\nBase: " + base + "\nSide: " + side + "\nIs that correct? (Y/N)");
                Scanner checkInput = new Scanner(System.in);
                String correctString = checkInput.nextLine().toUpperCase(Locale.ROOT);
                if (correctString.contains("Y")) {
                    System.out.println("The area of the triangular prism is: " + (base * height) + (2 * length * side) + (length * base));
                    break;
                } else if (correctString.contains("N")) {
                    System.out.println("Ok, let's try again.");
                } else {
                    System.out.println("Invalid input, please try again.");
                }

            }
        }
        else if (takeInput.contains("PYR")) {
            while (true) {
                Scanner numberInput = new Scanner(System.in);
                System.out.println("What is the base of the pyramid??");
                double base = Double.parseDouble(numberInput.nextLine());
                System.out.println("What us the side length of the pyramid?");
                double side = Double.parseDouble(numberInput.nextLine());
                System.out.println("Your selected values were \nBase: " + base + "\nSide: " + side + "\nIs that correct? (Y/N)");
                Scanner checkInput = new Scanner(System.in);
                String correctString = checkInput.nextLine().toUpperCase(Locale.ROOT);
                if (correctString.contains("Y")) {
                    System.out.println("The volume of the Pyramid is: " + Math.pow(base, 2) + (2 * base) * side);
                    break;
                } else if (correctString.contains("N")) {
                    System.out.println("Ok, let's try again.");
                } else {
                    System.out.println("Invalid input, please try again.");
                }
            }
        }
        else {
            System.out.println("Invalid Input, please try again.");
        }
    }
}