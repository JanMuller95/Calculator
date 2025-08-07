import java.util.ArrayList;
import java.util.List;

public class CalculatorLogic {


    public static double calculate(String inputText) {

        //Empty Input Exception

        if (inputText.isEmpty()) {
            return 0.0;
        }

        //Exchange "," -> "."

        String formattedInputText = inputText.replace(",",".");

        //Extract Numbers

        String[] inputTextSplitByOperators = formattedInputText.split("[-+]");

        //Extract Operators

        List<Character> inputTextOperators = new ArrayList<>();

        for (int i = 0; i < formattedInputText.length(); i++) {
            char c = formattedInputText.charAt(i);
            if (c == '+' || c == '-') {
                inputTextOperators.add(c);
            }
        }

            //Get First Number in Input

        double result = Double.parseDouble(inputTextSplitByOperators[0]);
        for (int i = 0; i < inputTextOperators.size(); i++) {

                //Get Next Number in Input

                double nextNumberInInputText = Double.parseDouble(inputTextSplitByOperators[i + 1]);

                //Get Next Operator in Input

                char nextOperatorInInputText = inputTextOperators.get(i);

                //Calculate

                if (nextOperatorInInputText == '+') {
                    result = result + nextNumberInInputText;
                } else {
                    result = result - nextNumberInInputText;
                }
        }
        return result;
    }
}
