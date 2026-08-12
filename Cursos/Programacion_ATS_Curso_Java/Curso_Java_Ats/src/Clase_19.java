import javax.swing.JOptionPane;

public class Clase_19 {
    public static void main(String[] args) {

        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor entre 1 y 5: "));

        switch (dato) {
            case 1: JOptionPane.showInternalMessageDialog(null, "Es el numero 1");
                
                break;
            case 2: JOptionPane.showInternalMessageDialog(null, "Es el numero 2");
                
                break;
            case 3: JOptionPane.showInternalMessageDialog(null, "Es el numero 3");
                
                break;
            case 4: JOptionPane.showInternalMessageDialog(null, "Es el numero 4");
                
                break;
            case 5: JOptionPane.showInternalMessageDialog(null, "Es el numero 5");
                
                break;
            default: JOptionPane.showMessageDialog(null, "El numero no es valido");
                
                break;
        }
    }
}
