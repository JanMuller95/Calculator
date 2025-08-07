import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {

    public JTextField[] displayArray;
    public ButtonClickListener(JTextField[] displayArray) {
        this.displayArray = displayArray;
    }

    @Override
    public void actionPerformed (ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String command = clickedButton.getText();
        ButtonCommandsAndRestrictions.commandAndRestrict(displayArray, command);
    }
}