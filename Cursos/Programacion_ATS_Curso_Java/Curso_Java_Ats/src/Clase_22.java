/*
Ejercicio 5: Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
✓ Si trabaja 40 horas o menos se le paga $16 por hora.
✓ Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
Si trabajo<= 40 entonces salario = trabajo *16
Si trabajo >40 entonces salario = (40 * 16) + ((trabajo - 40) * 20)
*/

import javax.swing.JOptionPane;

public class Clase_22 {
    public static void main(String[] args) {
        int trabajo;
        float salario;

        trabajo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de horas trabajadas"));

        if (trabajo<=40) {
            salario = trabajo*16;
        }
        else {
            salario = (40*16) + ((trabajo-40)*20);
        }
        
        JOptionPane.showMessageDialog(null, "El salario de esta semana es de $"+salario);
    }
}