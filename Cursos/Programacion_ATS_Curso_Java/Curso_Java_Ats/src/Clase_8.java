import java.util.Scanner;

public class Clase_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        System.out.println("Digite un numero ");
        numero1 = entrada.nextInt();
        System.out.println("El numero es "+numero1);

        float numero2;
        System.out.println("Digite un numero decimal ");
        numero2 = entrada.nextFloat();
        System.out.println("El segundo numero digitado es "+numero2);

        entrada.nextLine();//limpiar buffer
        
        String cadena;
        System.out.println("Digite una cadena");
        cadena = entrada.nextLine();
        System.out.println("La cadena escrita es "+cadena);

        char letra;
        System.out.println("Dgite una letra ");
        letra = entrada.next().charAt(0);
        System.out.println("La letra digitada es "+letra);
    }
}
