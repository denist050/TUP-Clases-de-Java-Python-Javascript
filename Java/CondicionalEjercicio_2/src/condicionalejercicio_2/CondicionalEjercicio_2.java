
package condicionalejercicio_2;

import java.util.Scanner;

public class CondicionalEjercicio_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite con un numero el mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estacion desconocida";
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
    }
            System.out.println("La estacion ingresada es: " + estacion);
    }
}
