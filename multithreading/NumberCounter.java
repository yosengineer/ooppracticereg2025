package multithreading;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberCounter extends JFrame implements ActionListener {
    private boolean go = false;
    private int count = 0;
    private JTextField counterTextField = new JTextField(10);
    private JButton startButton = new JButton("Start");
    private JButton stopButton = new JButton("Stop");

    public NumberCounter() {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        startButton.addActionListener(this);
        stopButton.addActionListener(this);

        cp.add(counterTextField);
        cp.add(startButton);
        cp.add(stopButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            go = true;

            Thread thread = new Thread(() -> {
                while (go) {
                    count++;
                    if (count > 9) count = 0;
                    counterTextField.setText(Integer.toString(count));
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
            thread.start();
        } else if (e.getSource() == stopButton) {
            go = false;
        }
    }

    public static void main(String[] args) {
        new NumberCounter();
    }
}
