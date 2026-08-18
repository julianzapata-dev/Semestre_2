import javax.swing.JOptionPane;

public class Clase_21 {
    public static void main(String[] args) {
        
        int letra;

        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);

        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, letra+" Es una letra mayuscula");
        }
        else {
            JOptionPane.showMessageDialog(null, letra+" Es una letra minuscola");
        }
    }
}
