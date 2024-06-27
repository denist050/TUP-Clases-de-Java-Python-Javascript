//10.6 Ejercicio: sistema de calificaciones con if else, como tarea hacerlo también con la sentencia de control switch
package condicionalejercicio_3_if;

import java.util.Scanner;

public class CondicionalEjercicio_3_if {

    public static void main(String[] args) {
        //Llamamos a la clase Scanner para ingresar los datos
        Scanner entrada = new Scanner(System.in);
        // Solicitamos al usuario que digite una calificacion
        System.out.println("Digite una calificacion: ");
        //Se lee la calificacion del usuario y se convierte en variable double
        double calificacion = Double.parseDouble(entrada.nextLine());
        //Se establece este mensaje para una nota invalida o fuera de rango
        var nota = "Ingrese una calificacion valida";
        //Estructura if else para mostrar la nota de acuerdo a la calificacion ingresada
        if(calificacion >= 9 && calificacion <=10){
            nota = "A";
        }
        else if (calificacion >= 8 && calificacion < 9){
            nota = "B";
           }
        else if (calificacion >= 7 && calificacion < 8){
            nota = "C";
           }
        else if (calificacion >= 6 && calificacion < 7){
            nota = "D";
        }
        else if (calificacion >= 0 && calificacion <6){
            nota = "F";
        }   //Imprimimos la nota
            System.out.println("La calificacion del alumno es: " + nota);    
    }
    
}