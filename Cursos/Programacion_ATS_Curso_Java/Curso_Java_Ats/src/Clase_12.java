public class Clase_12 {
    public static void main(String[] args) {

        int x=5, y;

        y = x++; //Asina valor 5 a Y, luego hace el incremento
        System.out.println("El valor de Y sin incremento es: "+y);
        y = ++x; //Hace el incremento, luego asigna valor a Y
        System.out.println("El valor de Y con el incremento es: "+y);
        y = x--; //Asina valor 5 a Y, luego hace el decremento
        System.out.println("El valor de Y sin el decremento es: "+y);
        y = --x; //Hace el decremento, luego asigna valor a Y
        System.out.println("El valor de Y con el decremento es: "+y);
    }
}
