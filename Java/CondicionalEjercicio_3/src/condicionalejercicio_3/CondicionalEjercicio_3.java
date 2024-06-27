
package condicionalejercicio_3;

import java.util.Scanner;

public class CondicionalEjercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite una calificacion: ");
        double calificacion = Double.parseDouble(entrada.nextLine());
        var nota = "Ingrese una calificacion valida";
        
        //convertimos el valor double a un entero
        int range = (int) calificacion;
        
        switch(range){
            case 10:
            case 9:
                nota = "A";
                break;
            case 8:
                nota = "B";
                break;
            case 7:
                nota = "C";
                break;
            case 6:
                nota = "D";
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                nota = "F";
                break;
            
        }
            System.out.println("La calificacion del alumno es: " + nota);    
    }
    
}
