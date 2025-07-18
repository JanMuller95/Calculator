import javax.swing.*;

public class ButtonCommandsAndRestrictions {

    public static void commandAndRestrict(JTextField[] displayArray, String command) {

        String inputText = displayArray[0].getText();
        String[] inputTextSplitByOperators = inputText.split("[-+]");
        String lastNumberInInputText = inputTextSplitByOperators[inputTextSplitByOperators.length - 1];

        //All Clear Restriction

        if (command.equals("AC")) {
            displayArray[0].setText("");
        }

        //Delete Restriction

        else if (command.equals("DEL")) {
            if (!inputText.isEmpty()) {
                displayArray[0].setText(inputText.substring(0, inputText.length() - 1));
            }
        }

        //Consecutive [-+,] Restriction

        else if (command.matches("[-+,]") && (inputText.isEmpty() || inputText.substring(inputText.length() - 1).matches("[-+,]"))) {
            displayArray[0].setText(inputText);
        }

        //Multiple "," in Number Restriction

        else if (command.equals(",") && lastNumberInInputText.contains(",")) {
            displayArray[0].setText(inputText);
        }

        //Redundant "0" Restriction

        else if (command.length() == 1 && command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            if (!lastNumberInInputText.equals("0")) {
                displayArray[0].setText(inputText + command);
            }
        }

        //Execute Calculator Logic when "="

        else if (command.equals("=")) {
            if (!inputText.substring(inputText.length() - 1).matches("[-+,]")) {
                double result = CalculatorLogic.calculate(inputText);
                displayArray[1].setText(String.valueOf(result));
            }
        } else {
            displayArray[0].setText(inputText + command);
        }
    }
}

