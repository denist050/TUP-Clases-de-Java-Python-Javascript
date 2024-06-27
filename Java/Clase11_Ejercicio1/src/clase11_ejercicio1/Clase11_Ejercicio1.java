/*11.1 Ejercicio 1 Con Estructura if else
Determinar si un alumno aprueba o reprueba un curso, sabiendo que:
aprobará si su promedio de tres calificaciones es mayor o igual a 70 
(reprueba caso contrario). (Diagrama de flujo
*/
package clase11_ejercicio1;

import java.util.Scanner;

public class Clase11_Ejercicio1 {
           
    public static void main(String[] args) {
        //Llamamos clase scanner para leer las entradas del usuario
        Scanner entrada = new Scanner(System.in);
        //Pedimos al usuario que ingrese 3 calificaciones y se leen en variables double
        System.out.println("Digite las 3 calificaciones: ");
        double nota1 = Double.parseDouble(entrada.nextLine());
        double nota2 = Double.parseDouble(entrada.nextLine());
        double nota3 = Double.parseDouble(entrada.nextLine());
        //Definimos var promedio como double y hacemos la formula para calcular el promedio
        double promedio = ((nota1 + nota2 + nota3)/3);
        //Usando estructura if else condicional doble para mostrar el mensaje
        //aprobado o desaprobado de acuerdo al promedio
        if(promedio >= 7.0){
            System.out.println("El alumno esta aprobado con: " + promedio);
        }
        else{
            System.out.println("El alumno esta desaprobado con: " + promedio);
        }
                
    }
}
