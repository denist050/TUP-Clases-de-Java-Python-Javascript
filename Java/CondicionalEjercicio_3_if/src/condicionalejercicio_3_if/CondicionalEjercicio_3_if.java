package condicionalejercicio_3_if;

import java.util.Scanner;

public class CondicionalEjercicio_3_if {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite una calificacion: ");
        double calificacion = Double.parseDouble(entrada.nextLine());
        var nota = "Ingrese una calificacion valida";
        
       
        
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
        }
            System.out.println("La calificacion del alumno es: " + nota);    
    }
    
}