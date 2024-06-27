/*
Ejercicio 1: Construir un programa que, dado un número total de
horas, devuelve el número de semanas, días y horas equivalentes.
Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,
6 días y 16 horas.
 */
package clase12_ejercicio1;

import java.util.Scanner;

public class Clase12_Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el total de horas: ");
        int totalHoras = Integer.parseInt(entrada.nextLine());

        int semanas = totalHoras / 168;  // una semana tiene 168 horas
        int dias = (totalHoras % 168) / 24; //  hacemos que el resto del total 
        //de horas dividido 168 horas se divida por 24 para obtener los dias
        int horas = totalHoras % 24; // el resto de total de horas de los dias 
        //se divide por 24 para obetener las horas

        System.out.println("Para " + totalHoras + " horas:");
        System.out.println(semanas + " semanas, " + dias + " días, y " + horas + " horas.");
    }
}


