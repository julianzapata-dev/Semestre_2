import java.util.Scanner;

public class Clase_17_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a, b, c, discr, x1, x2;

        System.out.println("Ingrese el valor de A: ");
        a = entrada.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        b = entrada.nextDouble();
        System.out.println("Ingrese el valor de C: ");
        c = entrada.nextDouble();

        discr = (b * b) - (4 * a * c);

        x1 = (-b + Math.sqrt(discr)) / (2 * a);
        x2 = (-b - Math.sqrt(discr)) / (2 * a);

        System.out.println("La primera raíz es: " + x1);
        System.out.println("La segunda raíz es: " + x2);
    }
}
