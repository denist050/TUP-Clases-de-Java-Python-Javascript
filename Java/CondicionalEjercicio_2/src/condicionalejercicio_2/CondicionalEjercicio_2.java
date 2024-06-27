//10.5 Ejercicio: Cálculo de las estaciones del año con Switch
package condicionalejercicio_2;

import java.util.Scanner;

public class CondicionalEjercicio_2 {

    public static void main(String[] args) {
        //Llamamos a la clase Scanner para ingresar los datos
        Scanner entrada = new Scanner(System.in);
        
        // Solicitamos al usuario que digite un número correspondiente a un mes del año
        System.out.println("Digite con un numero el mes del año: ");
        // Leemos la entrada del usuario y la convertimos a un número entero
        var mes = Integer.parseInt(entrada.nextLine());
        
        // Inicializamos la variable estacion con un valor por defecto
        var estacion = "Estacion desconocida";
        // Utilizamos una estructura switch para determinar la estación del año según el mes
        switch(mes){ 
        case 1: case 2: case 3:
            estacion = "Verano";
            break;
        case 4: case 5: case 6:
            estacion = "Verano";
            break;
        case 7: case 8: case 9:
            estacion = "Verano";
            break;
        case 10: case 11: case 12:
            estacion = "Verano";
            break;
    }   // Imprimimos la estación correspondiente al mes ingresado
            System.out.println("La estacion ingresada es: " + estacion);
    }
}
