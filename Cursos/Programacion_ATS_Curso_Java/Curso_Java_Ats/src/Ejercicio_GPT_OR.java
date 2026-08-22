//*Pedir un número del 1 al 12 e indicar si corresponde a un mes que tiene 31 días.

import javax.swing.JOptionPane;

public class Ejercicio_GPT_OR {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero de mes: "));

        if (numero == 2) {
            JOptionPane.showMessageDialog(null, "Mes "+numero+", corresponde a un mes de 28 días.");
        }
        else if (numero == 4 || numero == 6 || numero == 9 || numero == 11) {
            JOptionPane.showMessageDialog(null, "Mes "+numero+", corresponde a un mes de 30 días.");
        }
        else if (numero == 1 || numero == 3 || numero == 5 || numero == 7 || numero == 8 || numero == 10 || numero == 12) {
            JOptionPane.showMessageDialog(null, "Mes "+numero+", corresponde a un mes de 31 días.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Mes "+numero+" es invalido. \nSolo es valido desde el mes 1, hasta el mes 12");
        }
    }
}