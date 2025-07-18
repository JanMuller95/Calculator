import javax.swing.*;

public class RunCalculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FrontEnd frame = new FrontEnd();
            frame.setVisible(true);
        });
    }
}
