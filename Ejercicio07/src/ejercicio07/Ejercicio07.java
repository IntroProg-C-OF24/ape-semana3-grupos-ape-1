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
        int var8 = 0;
        boolean op1;
        boolean op2;
        boolean op3;
                
       // Planteamiento de la formula-
       op1 = ((Math.sqrt(var1)+ var2)/ var3) == var2;
       op2 = (var4 > var5);
       op3 = ((var6/var7)+(Math.sqrt(var6))== var8);
       
       boolean resultado  = ((op1 || op2) && op3);
       
               
        // Impresion de cada solucion
        System.out.println("La respuesta a la primera operacion es: " + op1);
        System.out.println("La respuesta a la segunda operacion es: " + op2);
        System.out.println("La respuesta a la tercera operacion es: " + op3);
        System.out.println("La respuesta final es: " + resultado);
        
        // El ejercicio 7 en base al problema planteado no tiene solucion sin embargo se coloco al final de la operacion ==0 para poder realizarlo asi logrando resolverlo y obteniendo resultados booleanos
        // Hecho por Diego Jimenez
    }    
}
