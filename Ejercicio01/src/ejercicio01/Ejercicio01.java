package ejercicio01;
public class Ejercicio01 {
<<<<<<< HEAD
    public static void main(String[] args) {
=======
public static void main(String[] args) {
>>>>>>> 6e58d87018508c19a9416353d31e81643d9f35bd
        // Solución a la problemática
        int variable1 = 1;
        int variable2 = 2;
        int variable3 = 4;
        int variable4 = 3;
        int variable5 = 5;
<<<<<<< HEAD
        int variable6 = 81;
        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrada de un número
        // Se ha corregido un error en la variable 6 puesto a que estaba 80 y realmente es el 81 
        double resultado = (variable1 + variable2 + variable3 + variable4) / 
                variable5 + Math.sqrt(variable6);
        
        
        
=======
        //Antes = int variable6 = 80
        //Despues
        int variable6 = 81;
        //La variable6 estaba ingresada erroneamente.
        
        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrada de un número
        
        double resultado = ((variable1 + variable2 + variable3 + variable4) / 
                (variable5)) + Math.sqrt(variable6);
>>>>>>> 6e58d87018508c19a9416353d31e81643d9f35bd
        System.out.println(resultado);
    }
}
