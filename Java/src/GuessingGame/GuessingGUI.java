package GuessingGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessingGUI {
    private JTextField guessOne;
    private JTextField guessTwo;
    private JTextField guessThree;
    private JTextField guessFour;
    private JPanel masterPanel;
    private JButton Guess;
    private JTextArea guesses0TextArea;
    private JTextArea pastAttemptsTextArea;
    private JTextArea textCorrect;
    private JTextArea textWrongSpot;
    private JTextArea rulesNumbersRangeFromTextArea;
    private JTextArea past2;
    private JButton restartButton;
    public static int ab = 0;

    public GuessingGUI() {
        Guess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Guessing.userGuesses.set(0, Integer.parseInt(guessOne.getText()));
                Guessing.userGuesses.set(1, Integer.parseInt(guessTwo.getText()));
                Guessing.userGuesses.set(2, Integer.parseInt(guessThree.getText()));
                Guessing.userGuesses.set(3, Integer.parseInt(guessFour.getText()));
                Guessing.userGuess();
                guesses0TextArea.setText("Guesses: " + Guessing.guessAmount);
                pastAttemptsTextArea.setText(String.valueOf(Guessing.pastGuesses));
                past2.setText(String.valueOf(Guessing.pastGuessesTwo));
                textCorrect.setText("Numbers Correct: " + Guessing.correctSpot);
                textWrongSpot.setText("Numbers in Wrong Spot: " + Guessing.wrongSpot);
            }
        });
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Guessing.guessAmount = 0;
                Guessing.pastGuesses.clear();
                Guessing.pastGuessesTwo.clear();
                Guessing.computerNumbers.clear();
                Guessing.userGuesses.clear();
                past2.setText("");
                pastAttemptsTextArea.setText("");
                guesses0TextArea.setText("Guesses:  " + Guessing.guessAmount);
                textCorrect.setText("Numbers Correct: 0");
                textWrongSpot.setText("Numbers in Wrong Spot: 0");
                Guessing.initialSet();
                for (ab = 0; ab < 4; ab++) {
                    Guessing.computerGen();
                }

            }
        });
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        GuessingGUI g =new GuessingGUI();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(g.masterPanel);
        frame.setSize(850, 700);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        SwingUtilities.updateComponentTreeUI(frame);
        frame.pack();
        frame.setVisible(true);
        Guessing.initialSet();
        for (ab = 0; ab < 4; ab++) {
            Guessing.computerGen();
        }


    }

}


