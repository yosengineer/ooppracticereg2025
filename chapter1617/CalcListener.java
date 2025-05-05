package chapter1617;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcListener implements ActionListener {
    private Calc calc;

    public CalcListener(Calc calc) {
        this.calc = calc;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calc.calculatePressed();
    }
}
