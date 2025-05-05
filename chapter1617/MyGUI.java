package chapter1617;

import javax.swing.*;
import java.awt.*;

public class MyGUI extends JFrame {
    private JButton myButton = new JButton("Click Me!");
    private JLabel counterLabel = new JLabel("Clicks: 0");
    private int counter = 0;

    public MyGUI() {
        setTitle("My GUI");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(counterLabel);
        cp.add(myButton);

        ClickListener listener = new ClickListener(this);
        myButton.addActionListener(listener);

        pack();
        setVisible(true);
    }

    public void incrementCounter() {
        counter++;
        counterLabel.setText("Clicks: " + counter);
        pack();
    }

    public static void main(String[] args) {
        new MyGUI();
    }
}
