import java.util.Scanner;

public class Clase_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float numero1, numero2, suma, resta, mult, div, resid;

        System.out.println("Digite 2 numeros: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        resid = numero1 % numero2;

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+mult);
        System.out.println("La división es: "+div);
        System.out.println("El residuo es: "+resid);
    }
}