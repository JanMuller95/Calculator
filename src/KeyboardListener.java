import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListener extends KeyAdapter {

    public JTextField[] displayArray;

    public KeyboardListener(JTextField[] displayArray) {
        this.displayArray = displayArray;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        String command = mapKeyToCommand(e);
        if (command != null) {
            ButtonCommandsAndRestrictions.commandAndRestrict(displayArray, command);
        }
    }

    private String mapKeyToCommand(KeyEvent e) {

        return switch (e.getKeyCode()) {
            case KeyEvent.VK_1 -> "1";
            case KeyEvent.VK_NUMPAD1 -> "1";
            case KeyEvent.VK_2 -> "2";
            case KeyEvent.VK_NUMPAD2 -> "2";
            case KeyEvent.VK_3 -> "3";
            case KeyEvent.VK_NUMPAD3 -> "3";
            case KeyEvent.VK_4 -> "4";
            case KeyEvent.VK_NUMPAD4 -> "4";
            case KeyEvent.VK_5 -> "5";
            case KeyEvent.VK_NUMPAD5 -> "5";
            case KeyEvent.VK_6 -> "6";
            case KeyEvent.VK_NUMPAD6 -> "6";
            case KeyEvent.VK_7 -> "7";
            case KeyEvent.VK_NUMPAD7 -> "7";
            case KeyEvent.VK_8 -> "8";
            case KeyEvent.VK_NUMPAD8 -> "8";
            case KeyEvent.VK_9 -> "9";
            case KeyEvent.VK_NUMPAD9 -> "9";
            case KeyEvent.VK_0 -> "0";
            case KeyEvent.VK_NUMPAD0 -> "0";
            case KeyEvent.VK_PLUS -> "+";
            case KeyEvent.VK_MINUS -> "-";
            case KeyEvent.VK_COMMA -> ",";
            case KeyEvent.VK_EQUALS -> "=";
            case KeyEvent.VK_ENTER -> "=";
            case KeyEvent.VK_BACK_SPACE -> "DEL";
            default -> null;
        };
    }
}
