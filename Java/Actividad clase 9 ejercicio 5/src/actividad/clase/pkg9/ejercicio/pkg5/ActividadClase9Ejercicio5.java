
package actividad.clase.pkg9.ejercicio.pkg5;

import java.util.Scanner;


public class ActividadClase9Ejercicio5 {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 3 calificaciones: ");
        int calificacion1 = Integer.parseInt(entrada.nextLine());
        int calificacion2 = Integer.parseInt(entrada.nextLine());
        int calificacion3 = Integer.parseInt(entrada.nextLine());
        int resultado = calificacion1 + calificacion2 + calificacion3;
        System.out.println("resultado = " + resultado);
    }
    
}
