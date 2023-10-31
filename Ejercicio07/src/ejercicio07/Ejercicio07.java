package ejercicio07;

public class Ejercicio07 {
    public static void main(String[] args) {
        // Resolucion del ejercicio07
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        int var6 = 100;
        int var7 = 25;
        boolean op1;
        boolean op2;
        boolean rta = true;
                
       // Planteamiento de la formula
       op1 = ((Math.sqrt(var1)+ var2)/ var3) == var2;
       op2 = (var4 > var5);
       
       double resultado  = ((var6/var7)+(Math.sqrt(var6)));
       
               
        // Impresion de cada solucion
        System.out.println("La respuesta a la primera operacion es: " + op1);
        System.out.println("La respuesta a la segunda operacion es: " + op2);
        System.out.println("La respuesta de las 2 primeras operaciones es: " + rta);
        System.out.println("La respuesta a la tercera opcione es: " + resultado);
        
        // El ejercicio 7 no tiene solucion debido a que la tercera opcion tiene un valor numerico y las demas opciones tienen resultados booleanos por lo tanto no se puede operar.
        // Hecho por Diego Jimenez
    }    
       
    
    
}
