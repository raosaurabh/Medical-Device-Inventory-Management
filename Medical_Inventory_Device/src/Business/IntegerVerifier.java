/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class IntegerVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        JTextField jtextfeild = (JTextField) input;
        String text = jtextfeild.getText();

        if (text.length() > 0) {

            try {

                int number = Integer.parseInt(text);
                if (number < 0) {
                    input.setBackground(Color.red);
                    JOptionPane.showMessageDialog(input, "Negative values are not permitted", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                jtextfeild.setBackground(UIManager.getColor("TextFeild.Background"));

                return true;
            } catch (Exception e) {
                jtextfeild.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Please enter an Integer");
                return false;

            }

        } else {
            jtextfeild.setBackground(Color.red);
            return false;
        }

    }

}
