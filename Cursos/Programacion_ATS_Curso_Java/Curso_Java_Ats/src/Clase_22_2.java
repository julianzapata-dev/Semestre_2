//Hacer un programa que tome dos números y diga si ambos son pares o impares.

import javax.swing.JOptionPane;

public class Clase_22_2 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Ambos números son pares");
        }
        else if (num1 % 2 != 0 && num2 % 2 != 0) { 
            JOptionPane.showMessageDialog(null, "Ambos numeros son impares");
            }
            else if (num1 % 2 == 0 && num2 % 2 != 0) {
                JOptionPane.showMessageDialog(null, num1+" es numero par, y "+num2+" es numero impar");
            }
            else{
                JOptionPane.showMessageDialog(null, num1+" es numero impar, y "+num2+" es numero par");
            }
    }
}
