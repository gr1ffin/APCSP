package GradeCalculator;

import javax.swing.*;

public class GradesGUI {
    private JTextField gradeField;
    public JPanel mainpanel;
    private JButton gradeButton;
    private JButton classButton;
    private JTextField classCountField;
    private JTextArea answerSpace;
    private JLabel label1;
    private JLabel label2;


    public static int classAmount = 0;
    public static double gradePoint = 0;
    public static int i = 0;
    public static double roundedGrade = 0;

    public GradesGUI() {
        classButton.addActionListener(e -> {
            classAmount = Integer.parseInt(classCountField.getText());
            System.out.println(classAmount);
                });
        gradeButton.addActionListener(e -> {
            gradePoint = Double.parseDouble(gradeField.getText());
            if (gradePoint >= 0 && gradePoint < 0.50) {
                roundedGrade = 0;
            }
            else if (gradePoint >= 0.50 && gradePoint < 1.50) {
                roundedGrade = 1;
            }
            else if (gradePoint >= 1.50 && gradePoint < 2.50) {
                roundedGrade = 2;
            }
            else if (gradePoint >= 2.50 && gradePoint < 3.50) {
                roundedGrade = 3;
            }
            else if (gradePoint >= 3.50 && gradePoint < 4) {
                roundedGrade = 4;
            }
            else {
                roundedGrade = gradePoint;
            }
            Grades.grades.add(roundedGrade);
            System.out.println("Initial Grade: " + gradePoint + "\nRounded Grade: " + roundedGrade);
            gradeField.setText("");
            i += 1;
            if (i >= classAmount) {
                System.out.println(Grades.grades);
                Grades.gradeMethod();
                gradeField.setVisible(false);
                gradeButton.setVisible(false);
                classButton.setVisible(false);
                classCountField.setVisible(false);
                answerSpace.setVisible(true);
                label1.setVisible(false);
                label2.setVisible(false);
                mainpanel.invalidate();
                answerSpace.setText("Your cumulative GPA is " + Grades.avg);

            }
        });
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        GradesGUI gui = new GradesGUI();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(gui.mainpanel);
        frame.setSize(850, 450);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        SwingUtilities.updateComponentTreeUI(frame);
        frame.pack();
        frame.setVisible(true);
        frame.getRootPane().setDefaultButton(gui.gradeButton);
        gui.answerSpace.setVisible(false);

    }

}