import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Grades {
    public static ArrayList<Double> grades = new ArrayList<>();
    public static void main(String[] args) {
        Scanner howMany = new Scanner(System.in);
        System.out.println("How many classes do you have?");
        int classCount = Integer.parseInt(howMany.nextLine());
        Scanner gpaCheck = new Scanner(System.in);
        for (int a = 0; a < classCount; a++) {
            grades.add(Double.parseDouble(gpaCheck.nextLine()));
        }
        System.out.println(grades);
        double value = 0;
        for (Double grade : grades) {
            value += grade;
        }
        System.out.println(value / classCount);
    }
}
