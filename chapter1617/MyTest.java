package chapter1617;

import java.awt.*;
import javax.swing.*;

public class MyTest extends JFrame {
    private JLabel myLabel = new JLabel("Hello World!");

    public MyTest() {
        setTitle("My Test");
        setSize(300, 300);
        setLocation(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // get the ContentPane of the JFrame
        Container cp = getContentPane();
        cp.add(myLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }
}
