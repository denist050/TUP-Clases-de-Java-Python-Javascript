
package clase11_ejercicio1;

import java.util.Scanner;

public class Clase11_Ejercicio1 {
           
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.println("Digite las 3 calificaciones: ");
        double nota1 = Double.parseDouble(entrada.nextLine());
        double nota2 = Double.parseDouble(entrada.nextLine());
        double nota3 = Double.parseDouble(entrada.nextLine());
        double promedio = ((nota1 + nota2 + nota3)/3);
        if(promedio >= 7.0){
            System.out.println("El alumno esta aprobado con: " + promedio);
        }
        else{
            System.out.println("El alumno esta desaprobado con: " + promedio);
        }
                
    }
}
