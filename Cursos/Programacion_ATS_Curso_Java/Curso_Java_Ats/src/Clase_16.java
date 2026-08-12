/*
La calificación final de un estudiante de Informática se calcula con base a las calificaciones 
de cuatro aspectos de su rendimiento académico: participación, primer examen parcial, 
segundo examen parcial y examen final. Sabiendo que las calificaciones anteriores entran a la 
calificación final con ponderaciones del 10%, 25%, 25% y 40%, hacer un programa que calcule e 
imprima la calificación final obtenida por un estudiante. 
*/

import java.util.Scanner;

public class Clase_16 {
    public static void main(String[] args) {
        Scanner Calificacion = new Scanner(System.in);

        float participa, examen1, examen2, examen3, nota;

        System.out.println("Ingrese la nota por participación: ");
        participa = Calificacion.nextFloat();

        System.out.println("Ingrese la nota por el primer examen: ");
        examen1 = Calificacion.nextFloat();

        System.out.println("Ingrese la nota por el segundo examen: ");
        examen2 = Calificacion.nextFloat();

        System.out.println("Ingrese la nota por el examen final: ");
        examen3 = Calificacion.nextFloat();

        nota = (participa*0.10f)+(examen1*0.25f)+(examen2*0.25f)+(examen3*0.40f);

        System.out.println("La nota final del estudiante es: "+nota);


    }
}
