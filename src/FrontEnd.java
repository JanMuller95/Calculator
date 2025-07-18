import javax.swing.*;
import java.awt.*;

public class FrontEnd extends JFrame {

    public JTextField[] displayArray;

    public FrontEnd() {

        //Frame

        setSize(500, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //DisplayPanel

        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new GridLayout(2, 1,5,5));
        String[] displayLabels = {"", ""};
        displayArray = new JTextField[displayLabels.length];

        for (int i = 0; i < displayLabels.length; i++) {
            displayArray[i] = new JTextField(displayLabels [i]);
            displayArray[i].setEditable(false);
            displayArray[i].setPreferredSize(new Dimension(500, 100));
            displayArray[i].setHorizontalAlignment(JTextField.RIGHT);
            if (i == 0) {
                displayArray[0].addKeyListener(new KeyboardListener(displayArray));
            }
            displayPanel.add(displayArray[i]);
        }
        add(displayPanel, BorderLayout.NORTH);

        //ButtonPanel

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4,5,5));
        String[] buttonLabels = {"7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "=",
                "DEL", "0", "AC", ",",
        };
        JButton[] buttonArray = new JButton[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttonArray[i] = new JButton(buttonLabels[i]);
            buttonArray[i].addActionListener(new ButtonClickListener (displayArray));
            buttonPanel.add(buttonArray[i]);
        }
        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }
}


