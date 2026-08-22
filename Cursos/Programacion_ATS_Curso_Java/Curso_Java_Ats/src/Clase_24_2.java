//*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos. */

import javax.swing.JOptionPane;

public class Clase_24_2 {
    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año: "));

        if (año > 0) {
            if (mes != 2) {
                if (mes != 4 && mes != 6 && mes != 9 && mes != 11) {
                    if (mes != 1 && mes != 3 && mes != 5 && mes != 7 && mes != 8 && mes != 10 && mes != 12) {
                        JOptionPane.showMessageDialog(null, "El mes de la fecha es incorrecto");
                    }
                    else if (dia > 0 && dia < 32) {
                        JOptionPane.showMessageDialog(null, "La fecha ingresada es correcta.\n" + dia + "/" + mes + "/"+ año);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "El día de la fecha es incorrecto");
                    }
                }
                else if (dia >= 1 && dia <=30) {
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es correcta.\n" + dia + "/" + mes + "/" + año);
                }
                else {
                    JOptionPane.showMessageDialog(null, "El día de la fecha es incorrecto");
                }
            }
            else if (dia >= 1 && dia <=28) {
                JOptionPane.showMessageDialog(null, "La fecha ingresada es correcta.\n" + dia + "/" + mes + "/" + año);
            }
            else {
                JOptionPane.showMessageDialog(null, "El día de la fecha es incorrecto");
            }
        }
        else {
        JOptionPane.showMessageDialog(null, "El año de la fecha es incorrecta");
        }
    }
}