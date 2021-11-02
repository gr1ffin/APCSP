package GradeCalculator;

import javax.swing.*;

public class GradesGUI {
    private JTextField gradeField;
    private JPanel panel1;
    private JButton gradeButton;
    private JButton classButton;
    private JTextField classCountField;


    public static int classAmount = 0;
    public static double gradePoint = 0;
    public static int i = 0;

    public GradesGUI() {
        classButton.addActionListener(e -> {
            classAmount = Integer.parseInt(classCountField.getText());
            System.out.println(classAmount);
                });
        gradeButton.addActionListener(e -> {
            gradePoint = Double.parseDouble(gradeField.getText());
            Grades.grades.add(gradePoint);
            System.out.println(gradePoint);
            gradeField.setText("");
            i += 1;
            if (i >= classAmount) {
                System.out.println(Grades.grades);
                Grades.gradeMethod();
            }
        });
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        GradesGUI gui = new GradesGUI();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(gui.panel1);
        frame.setSize(850, 450);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        SwingUtilities.updateComponentTreeUI(frame);
        frame.pack();
        frame.setVisible(true);
        frame.getRootPane().setDefaultButton(gui.gradeButton);


    }
}


