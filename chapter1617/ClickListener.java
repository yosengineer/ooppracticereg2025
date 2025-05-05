package chapter1617;

import java.awt.event.*;

public class ClickListener implements ActionListener {
    private MyGUI myGUI;

    public ClickListener(MyGUI myGUI) {
        this.myGUI = myGUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        myGUI.incrementCounter();
    }
}
