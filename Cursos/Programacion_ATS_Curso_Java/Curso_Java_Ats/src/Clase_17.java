import java.util.Scanner;

public class Clase_17 {
    public static void main(String[] args) {
        Scanner Operadores = new Scanner(System.in);

        int horastotal, dias, semanas, horas;

        System.out.println("Por favor indique el numero total de horas: ");
        horastotal = Operadores.nextInt();

        semanas = horastotal/(24*7);
        dias = (horastotal%(24*7))/24;
        horas = horastotal%24;

        System.out.println("La cantidad de semanas es: "+semanas+"\nLa cantidad de dias es: "+dias+"\nLa cantidad de horas es: "+horas);
        


    }
}
