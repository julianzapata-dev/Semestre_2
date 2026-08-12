import java.util.Scanner;

public class Clase_15 {
    public static void main(String[] args) {
        Scanner Operadores = new Scanner(System.in);

        double guillermo, luis, juan;

        System.out.println("Indique cuantos dolares tiene Guillermo: ");
        guillermo = Operadores.nextDouble();
        luis = guillermo/2;
        juan = (guillermo+luis)/2;
        System.out.println("\nGuillermo tiene $"+guillermo+"\nLuis tiene $"+luis+"\nJuan tiene $"+juan);

        double total = guillermo+luis+juan;
        System.out.println("Y el total entre los tres es de $"+total);
    }
}
