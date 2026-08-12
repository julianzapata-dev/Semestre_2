import java.util.Scanner;

public class Clase_16_2 {
    public static void main(String[] args) {
        Scanner Suma = new Scanner(System.in);

        int a, b, cuadrado;

        System.out.println("Ingrese el valor de A: ");
        a = Suma.nextInt();
        System.out.println("Ingrese el valor de B: ");
        b = Suma.nextInt();

        cuadrado = (a+b)*(a+b);

        System.out.println("El cuadrado de la suma es: "+cuadrado);
    }
}
