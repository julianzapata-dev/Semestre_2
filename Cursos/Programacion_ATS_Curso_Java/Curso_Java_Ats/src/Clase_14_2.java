import java.util.Scanner;

public class Clase_14_2 {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);

        int hora, cant;

        System.out.println("Ingese el valor hora labor: ");
        hora = salario.nextInt();

        System.out.println("Indique cuantas horas laboro: ");
        cant = salario.nextInt();

        int suma = hora*cant;
        System.out.println("El valor total recidibo sera de: "+suma);
    }
}
