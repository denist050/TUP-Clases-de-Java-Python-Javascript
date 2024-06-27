/*
Ejercicio 2: Hacer un programa que calcule el cuadro de una suma,
el usuario debe ingresar el valor de a y el valor de b.
Formula: (a+b)2=a2+b2+2*a*b
Para esto deberán utilizar la clase Math y un método llamado pow
 */
package clase12ejercicio_2;

import java.util.Scanner;

public class Clase12Ejercicio_2 {
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario que ingrese el valor de a
        System.out.print("Ingrese el valor de a: ");
        double a = Double.parseDouble(entrada.nextLine());

        // Solicitar al usuario que ingrese el valor de b
        System.out.print("Ingrese el valor de b: ");
        double b = Double.parseDouble(entrada.nextLine());

        // Calcular el cuadrado de la suma utilizando la fórmula (a + b)^2
        double resultado = Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b;
        
        // Mostrar el resultado
        System.out.println("El resultado de (a + b)^2 es: " + resultado);
    }
    
}
