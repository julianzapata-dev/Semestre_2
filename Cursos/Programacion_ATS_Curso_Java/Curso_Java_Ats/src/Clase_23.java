import javax.swing.JOptionPane;

public class Clase_23 {
    public static void main(String[] args) {
        int num1, num2, num3;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero"));

        if (num1 > num2 && num2 > num3) {
            JOptionPane.showMessageDialog(null, "Numeros en orden: \n"+num1+"\n"+num2+"\n"+num3);
        }
        else if (num1 > num3 && num3 > num2) {
            JOptionPane.showMessageDialog(null, "Numeros en orden: \n"+num1+"\n"+num3+"\n"+num2);
        }
        else if (num2 > num3 && num3 > num1) {
            JOptionPane.showMessageDialog(null, "Numeros en orden: \n"+num2+"\n"+num3+"\n"+num1);
        }
        else if (num2 > num1 && num1 > num3) {
            JOptionPane.showMessageDialog(null, "Numeros en orden: \n"+num2+"\n"+num1+"\n"+num3);
        }
        else if (num3 > num2 && num2 > num1) {
            JOptionPane.showMessageDialog(null, "Numeros en orden: \n"+num3+"\n"+num2+"\n"+num1);
        }
        else if (num3 > num1 && num1 > num2) {
            JOptionPane.showMessageDialog(null, "Numeros en orden: \n"+num3+"\n"+num1+"\n"+num2);
        }
        else {
            JOptionPane.showMessageDialog(null, "Los tres numeros deben ser diferentes");
        }
    }
}