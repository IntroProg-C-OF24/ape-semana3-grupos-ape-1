package ejercicio01;
public class Ejercicio01 {
    public static void main(String[] args) {
        // Solución a la problemática
        int variable1 = 1;
        int variable2 = 2;
        int variable3 = 4;
        int variable4 = 3;
        int variable5 = 5;
        int variable6 = 81;
        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrada de un número
        // Se ha corregido un error en la variable 6 puesto a que estaba 80 y realmente es el 81 
        double resultado = (variable1 + variable2 + variable3 + variable4) / 
                variable5 + Math.sqrt(variable6);
        
        
        
        System.out.println(resultado);

    }

}
