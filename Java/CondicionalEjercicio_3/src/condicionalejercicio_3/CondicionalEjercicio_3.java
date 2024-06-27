//10.6 Ejercicio: sistema de calificaciones con control switch
package condicionalejercicio_3;

import java.util.Scanner;

public class CondicionalEjercicio_3 {

    public static void main(String[] args) {
        //Llamamos a la clase Scanner para ingresar los datos
        Scanner entrada = new Scanner(System.in);
         // Solicitamos al usuario que digite una calificacion
        System.out.println("Digite una calificacion: ");
       // Leemos la entrada del usuario y la convertimos a un número double
        double calificacion = Double.parseDouble(entrada.nextLine());
        var nota = "Ingrese una calificacion valida";
        
        //convertimos el valor double a un entero para poder usarlo en sentencia switch
        int range = (int) calificacion;
        //segun la calificacion, imprimira la nota correspondiente
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
            
        }   //se imprime la nota
            System.out.println("La calificacion del alumno es: " + nota);    
    }
    
}
