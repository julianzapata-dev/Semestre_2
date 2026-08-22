//*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses son de 30 días. */

import javax.swing.JOptionPane;

public class Clase_24 {
    public static void main(String[] args) {
        int day, month, year;

        day = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese dia: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese mes: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese año: "));

        if (day >= 1 && day <=30) {
            if (month >=1 && month <= 12) {
                if (year > 0) {
                    JOptionPane.showMessageDialog(null, "La fecha es correcta:\n"+day+" / "+month+" / "+year);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Año de fecha incorrecto.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Mes de fecha incorrecto.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Día de fecha incorrecto.");
        }
    }
}
