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

public class StringVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        JTextField jtextfeild = (JTextField) input;
        String text = jtextfeild.getText();

        if (text.length()==0||text.startsWith(" ")) {

            jtextfeild.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Please enter an valid String");
            return false;

        } else {
            jtextfeild.setBackground(UIManager.getColor("TextFeild.Background"));
            return true;
        }

    }
}
