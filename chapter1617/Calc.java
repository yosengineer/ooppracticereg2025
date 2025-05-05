package chapter1617;

import java.awt.*;
import javax.swing.*;

public class Calc extends JFrame {
    private final JPanel orangePanel, yellowPanel;
    private final JComboBox<String> operation;
    private final JLabel letLabel, answerLabel;
    private final JTextField num1, num2;
    private final JButton calculate, quit;

    public static final String ADD_OP = "ADDITION";
    public static final String SUB_OP = "SUBTRACTION";
    public static final String MUL_OP = "MULTIPLICATION";
    public static final String DIV_OP = "DIVISION";

    public Calc() {
        setTitle("My Funky Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 700);

        // content pane
        Container cp = getContentPane();
        //cp.setLayout(new FlowLayout());
        cp.setBackground(Color.WHITE);

        // panels
        orangePanel = new JPanel();
        yellowPanel = new JPanel();
        orangePanel.setBackground(Color.ORANGE);
        yellowPanel.setBackground(Color.YELLOW);

        // combo box
        operation = new JComboBox<>();
        operation.addItem(ADD_OP);
        operation.addItem(SUB_OP);
        operation.addItem(MUL_OP);
        operation.addItem(DIV_OP);
        operation.setBackground(Color.BLUE);

        // labels
        letLabel = new JLabel("Let's Calculate!");
        letLabel.setForeground(Color.GREEN);
        answerLabel = new JLabel("Answer: ");
        answerLabel.setForeground(Color.RED);

        // text fields
        num1 = new JTextField("1st Number", 10);
        num1.setBackground(Color.LIGHT_GRAY);
        num2 = new JTextField("2nd Number", 10);
        num2.setBackground(Color.LIGHT_GRAY);

        // buttons
        calculate = new JButton("Calculate");
        calculate.setBackground(Color.PINK);
        quit = new JButton("Quit");
        quit.setBackground(new Color(50, 100, 50));

        // add contents to orange panel
        orangePanel.add(letLabel);
        orangePanel.add(num1);
        orangePanel.add(num2);
        orangePanel.add(operation);
        orangePanel.add(answerLabel);

        // add contents to yellow panel
        yellowPanel.add(calculate);
        yellowPanel.add(quit);

        // add contents to content pane
        cp.add(orangePanel, BorderLayout.NORTH);
        cp.add(yellowPanel, BorderLayout.SOUTH);

        // listener
        CalcListener listener = new CalcListener(this);
        calculate.addActionListener(listener);

        pack();
        setVisible(true);
    }

    public void calculatePressed() {
        try {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            String op = (String) operation.getSelectedItem();
            double result = 0;

            switch (op) {
                case ADD_OP -> result = n1 + n2;
                case SUB_OP -> result = n1 - n2;
                case MUL_OP -> result = n1 * n2;
                case DIV_OP -> result = n1 / n2;
                default -> System.out.println("Invalid operation!");
            }

            answerLabel.setText("Answer: " + result);
            pack();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
    }
}
