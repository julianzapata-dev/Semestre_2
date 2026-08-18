import javax.swing.JOptionPane;

public class Clase_20 {
    public static void main(String[] args) {
        
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero multiplo de 10: "));

        if (numero % 10 ==0) {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" si es multiplo de 10");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" no es multiplo de 10");
        }
    }
}
