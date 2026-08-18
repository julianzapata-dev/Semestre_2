//* Pedir un número entre 0 y 99.999 y decir cuántas cifras tiene.

import javax.swing.JOptionPane;

public class Clase_23_2 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero entre 0 y 99.999"));

        if (numero >= 0 && numero <=9) {
            JOptionPane.showMessageDialog(null, "Su numero tiene una cifra \n"+numero);
        }
        else if (numero <= 99) {
            JOptionPane.showMessageDialog(null, "Su numero tiene dos cifras \n"+numero);
        }
        else if (numero <= 999) {
            JOptionPane.showMessageDialog(null, "Su numero tiene tres cifras \n"+numero);            
        }
        else if (numero <= 9999) {
            JOptionPane.showMessageDialog(null, "Su numero tiene cuatro cifras \n"+numero);            
        }
        else if (numero <= 99999) {
            JOptionPane.showMessageDialog(null, "Su numero tiene cinco cifras \n"+numero);
        }
        else {
            JOptionPane.showMessageDialog(null, "Su numero no es valido. \nDebe ser un numero entre 0 y 99.999");
        }
    }
}
