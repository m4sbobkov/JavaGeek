import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {
    private final JTextField textField;
    private final JTextField resultArea;

    public CalcButtonActionListener(JTextField textField, JTextField resultArea) {
        this.textField = textField;
        this.resultArea = resultArea;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String[] summary = textField.getText().split("\\+");
        String[] difference = textField.getText().split("\\-");
        String[] multiply = textField.getText().split("\\*");
        String[] division = textField.getText().split("\\/");

        if (summary.length >= 2) {
            int sum = 0;
            for (int i = 0; i < summary.length; i++) {
                sum += Integer.parseInt(summary[i]);
            }
            resultArea.setText(String.valueOf(sum));
        }
        else if (difference.length >= 2){
            int diff = Integer.parseInt(difference[0]);
            for (int i = 1; i < difference.length; i++) {
                diff -= Integer.parseInt(difference[i]);
            }
            resultArea.setText(String.valueOf(diff));
        }
        else if (multiply.length >= 2){
            int mult = Integer.parseInt(multiply[0]);
            for (int i = 0; i < multiply.length; i++) {
                mult *= Integer.parseInt(multiply[i]);
            }
            resultArea.setText(String.valueOf(mult));
        }
        else if (division.length >= 2){
            float div = Float.parseFloat(division[0]);
            for (int i = 1; i < division.length; i++) {
                div /= Float.parseFloat(division[i]);
            }
            resultArea.setText(String.valueOf(div));
        }




    }
}
/**
 *
 * Сначала сам делал так, потом почитал телегу, и попытался сделать по подобию других.
String str = textField.getText();

        if (str.contains("+")) {
            String[] operands = textField.getText().split("\\+");
            int sum = 0;
            for (int i = 0; i < operands.length; i++) {
                sum += Integer.parseInt(operands[i]);
            }
            resultArea.setText(String.valueOf(sum));
        } else if (str.contains("-")) {
            String[] operands = textField.getText().split("\\-");
            int diff = Integer.parseInt(operands[0]);
            for (int i = 1; i < operands.length; i++) {
                diff -= Integer.parseInt(operands[i]);
            }
            resultArea.setText(String.valueOf(diff));
        }
        else if (str.contains("*")) {
            String[] operands = textField.getText().split("\\*");
            int mult = Integer.parseInt(operands[0]);
            for (int i = 0; i < operands.length; i++) {
                mult *= Integer.parseInt(operands[i]);
            }
            resultArea.setText(String.valueOf(mult));
        }
        else if (str.contains("/")) {
            String[] operands = textField.getText().split("\\/");
            int div = Integer.parseInt(operands[0]);
            for (int i = 1; i < operands.length; i++) {
                div /= Integer.parseInt(operands[i]);
            }
            resultArea.setText(String.valueOf(div));
        }
 */




