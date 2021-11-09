package ProjectStem.Unit4;

import java.util.*;

public class E4_6A {
    public static int a = 0;
    public static int b = 0;
    public static ArrayList<Integer> intArray = new ArrayList<>();
    public static ArrayList<String> nameArray = new ArrayList<>();
    public static void main(String[] args) {
        Scanner userScan = new Scanner(System.in);
        int userInt = Integer.parseInt(userScan.nextLine());
        if (userInt == 1) {
            compareLoop();
        } else {
            nameLoop();
        }
    }


    public static void compareLoop() {
        for (a = 0; a < 3; a++) {
            Scanner stringScan = new Scanner(System.in);
            System.out.println("Integer 1");
            intArray.add(Integer.parseInt(stringScan.nextLine()));
            System.out.println("Integer 2");
            intArray.add(Integer.parseInt(stringScan.nextLine()));
            compareFunction();
        }
    }
    public static void compareFunction() {
        if (intArray.get(a) > intArray.get(a + 1)) {
            System.out.println(intArray.get(a) + " is greater than " + intArray.get(a+1));
        }
        else if (intArray.get(a).equals(intArray.get(a+1))) {
            System.out.println("The two values are the same.");
        }
        else if (intArray.get(a + 1) > intArray.get(a)) {
            System.out.println(intArray.get(a) + " is less than " + intArray.get(a+1));
        }
        else {
            System.out.println("You did something wrong.");
        }
    }

    public static void nameLoop() {
        Scanner nameInput = new Scanner(System.in);
        for (b = 0; b < 6; b++) {
            nameArray.add(nameInput.nextLine());
        }
        eliminateFunction();
        System.out.println(nameArray);
    }
    public static void eliminateFunction() {
        Collections.shuffle(nameArray);
        while (b > 0) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(b);
            nameArray.remove(randomNumber);
            b--;
        }
    }
}
