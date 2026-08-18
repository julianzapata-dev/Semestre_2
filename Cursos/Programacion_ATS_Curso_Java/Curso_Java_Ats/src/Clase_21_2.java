import javax.swing.JOptionPane;

public class Clase_21_2 {
    public static void main(String[] args) {
        
        double cliente, compra;

        cliente = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el total de la compra:"));

        if (cliente>300) {
            compra = cliente - (cliente * 0.20);
            JOptionPane.showMessageDialog(null, "Su compra tiene un descuento del 20%, para un total de:"+compra);
        }
        else {
            compra = cliente;
            JOptionPane.showMessageDialog(null, "Su compra no tiene descuento, y el total a pagar es de:"+compra);
        }
    }
}
