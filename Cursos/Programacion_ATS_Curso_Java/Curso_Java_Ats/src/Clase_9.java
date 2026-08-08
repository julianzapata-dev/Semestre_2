import javax.swing.JOptionPane;

public class Clase_9 {    
    public static void main(String[] args) {
        String cadena;
        int numero;
        char letra;
        double decimal;
        float edad;
        
        cadena = JOptionPane.showInputDialog("Nombre completo: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Numero de semestre cursando: "));
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal: "));
        edad = Float.parseFloat(JOptionPane.showInputDialog("Edad: ")) ;

        JOptionPane.showMessageDialog(null, "El nombre es: "+cadena);
        JOptionPane.showMessageDialog(null, "El semestre actual cursando es: "+numero);
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
        JOptionPane.showMessageDialog(null, "Edad: "+edad);
    }
}