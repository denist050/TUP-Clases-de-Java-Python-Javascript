/*Ejercicio 3: La calificacion final de un estudiante de informática
se calcula con base a las calificaciones de cuatro aspectos de su
rendimiento académico: participación, primer examen parcial, segundo
examen parcial y examen final. Sabiendo que las calificaciones anteriores
entran a la calificación final con ponderaciones de 10%, 25%, 25%
y 40%, Hacer un programa que calcule e imprima la calificación final
obtenida por un estudiante. 
Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,
la calificación final.
*/

package clase12ejercicio_3;

import java.util.Scanner;

public class Clase12Ejercicio_3 {

    public static void main(String[] args) {
        //Creamos objeto scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);
        //Pedimos al usuario las 4 calificaciones 
        System.out.print("Ingrese la calificacion en la participacion del alumno: ");
        double participacion = Double.parseDouble(entrada.nextLine());
        System.out.print("Ingrese la calificacion del primer examer parcial: ");
        double examenParcial_1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Ingrese la calificacion del segundo parcial: ");
        double examenParcial_2 = Double.parseDouble(entrada.nextLine());
        System.out.print("Ingrese la calificacion del examen final: ");
        double examenFinal = Double.parseDouble(entrada.nextLine());
        //Formula para calcular la calificacion final
        double calificacionFinal = (participacion * 0.10) + (examenParcial_1 * 0.25) + (examenParcial_2 * 0.25) + (examenFinal * 0.40);
  
        //Se muestra la calificacion final
        System.out.println("La calificacion final del alumno es: " + calificacionFinal);
      
    }
    
}
