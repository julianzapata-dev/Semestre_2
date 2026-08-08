/*
Método	Función	Ejemplo	                                Resultado
Math.sqrt(x)	Raíz cuadrada	Math.sqrt(25)	        5.0
Math.pow(a,b)	Potencia	Math.pow(2,3)	            8.0
Math.max(a,b)	Mayor valor	Math.max(5,8)	            8
Math.min(a,b)	Menor valor	Math.min(5,8)	            5
Math.abs(x)	Valor absoluto	Math.abs(-10)	            10
Math.random()	Número aleatorio	Math.random()	    0.0 a 0.999...
Math.round(x)	Redondeo normal	Math.round(7.6)	        8
Math.ceil(x)	Redondea hacia arriba	Math.ceil(7.2)	8.0
Math.floor(x)	Redondea hacia abajo	Math.floor(7.8)	7.0
Math.PI	Valor de π	Math.PI	                            3.141592653589793
Math.E	Número de Euler	Math.E	                        2.718281828459045
*/
public class Clase_13 {
    public static void main(String[] args) {

        // =====================================================
        // Math.sqrt() -> Calcula la raíz cuadrada
        // =====================================================
        System.out.println("Raíz cuadrada de 64:");
        double raiz = (Math.sqrt(64));   // Resultado: 8.0
        System.out.println(raiz);

        // =====================================================
        // Math.pow() -> Eleva un número a una potencia
        // =====================================================
        double base=2, exponente=5, potencia;
        System.out.println("2 elevado a la 5:");
        potencia = Math.pow(base, exponente);  // Resultado: 32.0
        System.out.println(potencia);

        // =====================================================
        // Math.max() -> Devuelve el número mayor
        // =====================================================
        double a=15, b=28, mayor;
        System.out.println("Mayor entre 15 y 28:");
        mayor = Math.max(a, b);   // Resultado: 28
        System.out.println(mayor);

        // =====================================================
        // Math.min() -> Devuelve el número menor
        // =====================================================
        double a1=15, b1=28, menor;
        System.out.println("Menor entre 15 y 28:");
        menor = Math.min(a1, b1);   // Resultado: 15
        System.out.println(menor);

        // =====================================================
        // Math.abs() -> Devuelve el valor absoluto
        // Si el número es negativo lo convierte en positivo.
        // =====================================================
        System.out.println("Valor absoluto de -35:");
        double absoluto = Math.abs(-35); // Resultado: 35
        System.out.println(absoluto);

        // =====================================================
        // Math.random() -> Genera un número aleatorio
        // entre 0.0 y 0.999999...
        // =====================================================
        System.out.println("Número aleatorio:");
        double aleatorio1 = Math.random();
        System.out.println(aleatorio1);

        // =====================================================
        // Número entero aleatorio entre 1 y 100
        // =====================================================
        int aleatorio = (int)(Math.random() * 100) + 1;
        System.out.println("Número entero aleatorio:");
        System.out.println(aleatorio);

        // =====================================================
        // Math.round() -> Redondea normalmente
        // =====================================================
        double numero3 = 8.6;
        System.out.println("Redondear 8.6:");
        long redond = Math.round(numero3);    // Resultado: 9
        System.out.println(redond);

        // =====================================================
        // Math.ceil() -> Siempre redondea hacia arriba
        // =====================================================
        double numero4 = 8.2;
        System.out.println("Ceil de 8.2:");
        double ceil = Math.ceil(numero4);     // Resultado: 9.0
        System.out.println(ceil);

        // =====================================================
        // Math.floor() -> Siempre redondea hacia abajo
        // =====================================================
        double numero5=8.9;
        System.out.println("Floor de 8.9:");
        double floor = Math.floor(numero5);    // Resultado: 8.0
        System.out.println(floor);

        // =====================================================
        // Math.PI -> Valor de PI
        // =====================================================
        System.out.println("Valor de PI:");
        System.out.println(Math.PI);

        // =====================================================
        // Math.E -> Número de Euler
        // =====================================================
        System.out.println("Valor de E:");
        System.out.println(Math.E);

        
    }
}
