package org.example; // CHATGPT DEN YARDIM İLE YAPILMIŞTIR

import javax.swing.*;

public class soru4 {
    public static void main(String[] args) {
        String sayi1 = JOptionPane.showInputDialog("birinci sayıyı giriniz : ");
        double say1 = Double.parseDouble(sayi1);
        String sayi2 = JOptionPane.showInputDialog("ikinci sayıyı giriniz : ");
        double say2  = Double.parseDouble(sayi2);

        String operation = JOptionPane.showInputDialog("yapmak istediğiniz işlemi seçiniz  (+, -, *, /): ");

        double result = 0;

        switch (operation) {
            case "+":
                result = say1 + say2 ;
                break;
            case "-":
                result = say1 - say2;
                break;
            case "*":
                result = say1 * say2;
                break;
            case "/":
                // Check for division by zero
                if (say2 == 0) {
                    JOptionPane.showMessageDialog(null, "Error: Division by zero is not allowed!");
                    return;
                }
                result = say1 / say2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Invalid operation!");
                return;
        }

        JOptionPane.showMessageDialog(null, "Result: " + result);
    }
}
