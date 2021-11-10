package ProjectStem.Unit4;

import java.util.Scanner;

public class E4_2B {
    public static void main(String[] args) {
        // Variables and User Input
        // Griffin
        Scanner newScanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = newScanner.nextLine();
        System.out.println("Welcome " + name + ".");
        System.out.println("How old are you?");
        int age = Integer.parseInt(newScanner.nextLine());
        age += 10;
        System.out.println("In 10 years you will be " + age + " years old.");

    }
}
