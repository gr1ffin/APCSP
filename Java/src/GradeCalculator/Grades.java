package GradeCalculator;

import java.util.ArrayList;

public class Grades {
    public static ArrayList<Double> grades = new ArrayList<>();

    public static void gradeMethod() {
        /*Scanner howMany = new Scanner(System.in);
        System.out.println("How many classes do you have?");
        int classCount = Integer.parseInt(howMany.nextLine());
        Scanner gpaCheck = new Scanner(System.in);
        for (int a = 0; a < classCount; a++) {
            System.out.println("What is your GPA for class " + (a + 1));
            grades.add(Double.parseDouble(gpaCheck.nextLine()));
        }
        System.out.println(grades);
        double value = 0;
        for (Double grade : grades) {
            value += grade;
        }
        System.out.println(value / classCount);*/

        GradesGUI gui = new GradesGUI();
        int classCount = GradesGUI.classAmount;
        double value = 0;
        for (Double grade : grades) {
            value += grade;
        }
        double avg = value / classCount;
        System.out.println(avg);
    }
}
