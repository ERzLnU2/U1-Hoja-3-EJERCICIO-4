/**
 * @author Daw120
 * 
 * 4. Dado el siguiente polinomio de segundo grado: y=ax2+bx+c crea un programa 
      que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor
      correspondiente de y.
 */
package com.solomongo.ejercicio4_hoja3;
import java.util.Scanner;
public class Ejercicio4_Hoja3 {
 public static void main(String[] args) {
        ////////////polinomio////////////
         // ecuación de 2º grado.. next level
        int a;
       int b,c,x;
      
       Scanner entrada=new Scanner(System.in);
       System.out.println("Introduce el valor de a: ");
       a=entrada.nextInt();
      
       System.out.println("Introduce el valor de b: ");
       b=entrada.nextInt();
      
       System.out.println("Introduce el valor de c: ");
       c=entrada.nextInt();
       
       System.out.println("Introduce el valor de x: ");
       x=entrada.nextInt();  
       
       int y= (int) ((a*Math.pow(x, 2))+b*x+c);       
       System.out.println("El resultado de la ecuacion es: "+y);
}
}

    
