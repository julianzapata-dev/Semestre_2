import java.util.Scanner;

public class Clase_14 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        float nota1, nota2, nota3;

        System.out.println("Escriba la nota 1: ");
        nota1 = notas.nextFloat();

        System.out.println("Escriba la nota 2: ");
        nota2 = notas.nextFloat();

        System.out.println("Escriba la nota 3: ");
        nota3 = notas.nextFloat();

        float notafin = nota1+nota2+nota3;

        System.out.println("La nota final es"+notafin);
    }
}