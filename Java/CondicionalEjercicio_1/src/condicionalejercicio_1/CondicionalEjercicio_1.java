//10.3 Ejercicio: Cálculo de las estaciones del año con if else
package condicionalejercicio_1;

import java.util.Scanner;

public class CondicionalEjercicio_1 {
    public static void main(String[] args) {
        //llamamos a la clase scanner para ingresar los datos
        Scanner entrada = new Scanner(System.in);
         // Solicitamos al usuario que digite un mes del año
        System.out.println("Digite un mes del año: ");
        
        var mes = Integer.parseInt(entrada.nextLine());
        // Leemos la entrada del usuario y la convertimos a un número entero
        var estacion = "Estacion desconocida";
        // Utilizamos una estructura if-else para determinar la estación del año según el mes
        if(mes == 1 || mes == 2 || mes == 3){
            estacion = "Verano";
        }
        else if(mes == 4 || mes == 5 || mes == 6){
           estacion = "Otoño";
        }   
         else if(mes == 7 || mes == 8 || mes == 9){
           estacion = "Invierno";
        }   
         else if(mes == 10 || mes == 11 || mes == 12){
           estacion = "Primavera";
        }
        // Imprimimos la estación correspondiente al mes ingresado
        System.out.println("La estacion del mes ingresado es: " + estacion);
    }
}