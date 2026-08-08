public class Clase_5 {
    public static void main(String[] args) throws Exception {
        byte entero1 = 127; // 8 bits, rango de -128 a 127
        short entero2 = 32767; //16 bits, rango de -32768 a 32767
        int entero3 = 2147483647; //32 bits, rango de -2,147,483,648 a 2,147,483,647
        long entero4 = 922337203685477580L; // 64 bits, rango de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        System.out.println("El entero de 8 bits es "+entero1);
        System.out.println("El entero de 16 bits es "+entero2);
        System.out.println("El entero de 32 bits es "+entero3);
        System.out.println("El entero de 64 bits es "+entero4);
        
        float decimal1= 3.45f; //32 bits, rango de 6–7 cifras decimales
        double decimal2= 3.59874; //64 bits, rango de 15–16 cifras decimales, Es el más utilizado y el recomendado
        System.out.println("El decimal de 32 bits es "+decimal1);
        System.out.println("El decimal de 65 bits es "+decimal2);

        char caracter1 = 'A';
        boolean decision1 = true;
        boolean decision2 = false;
        System.out.println("El caracter es la letra "+caracter1);
        System.out.println("La decision 1 es "+decision1);
        System.out.println("La decision 2 es "+decision2);
    }
    
}
