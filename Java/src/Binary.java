import java.util.Scanner;
import javax.swing.*;

public class Binary {

    public static Scanner myObj = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(Integer.parseInt(args[0]));
        System.out.println("Would you like to convert from Decimal to Binary (A) or Binary to Decimal (B)? \n");

        String choice = myObj.nextLine();

        if(choice.equals("A")){
            decimalIn();
        }
        if(choice.equals("B")){
            binaryIn();
        }
    }
    public static void decimalIn(){
        System.out.println("What number would you like to convert? \n");

        int decimalInput = myObj.nextInt();
        System.out.print(Integer.toBinaryString(decimalInput));
    }
    public static void binaryIn(){
        System.out.println("What number would you like to convert? \n");

        int binaryInput = myObj.nextInt();
        System.out.println(Integer.parseInt(String.valueOf(binaryInput),2));
    }
}