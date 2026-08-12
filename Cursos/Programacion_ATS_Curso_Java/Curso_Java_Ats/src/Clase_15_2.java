
/*
Ejercicio 4: Una compañía de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, 
mas una comisión de $150 por cada carro vendido, más el 5% del valor de la venta por carro. Cada mes el capturista 
de la empresa ingresa en la computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario 
mensual de un vendedor dado. 
*/
import java.util.Scanner;

public class Clase_15_2 {
    public static void main(String[] args) {
        Scanner Autos = new Scanner(System.in);
        double salario=1000, comision=150, vendedor, modelo;
        int cant;

        System.out.println("Indique el valor del modelo vendido por el empleado: ");
        modelo = Autos.nextInt();
        System.out.println("Por favor indique cuantos autos vendio durante el mes: ");
        cant = Autos.nextInt();
        vendedor = salario + (comision*cant)+(modelo*cant*0.05);
        System.out.println("El salario mensual para este empleado fue de: "+vendedor);
    }
}
