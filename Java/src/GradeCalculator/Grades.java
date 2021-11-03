package GradeCalculator;

import java.util.ArrayList;

public class Grades {
    public static ArrayList<Double> grades = new ArrayList<>();
    public static double avg;

    public static void gradeMethod() {
        GradesGUI gui = new GradesGUI();
        int classCount = GradesGUI.classAmount;
        double value = 0;
        for (Double grade : grades) {
            value += grade;
        }
        avg = value / classCount;
        System.out.println(avg);
    }
}
