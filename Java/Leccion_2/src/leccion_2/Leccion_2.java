// 10.1 Sentencia de Control if else
package leccion_2;

import java.util.Scanner;

public class Leccion_2 {

    public static void main(String[] args) {
        /*
        cuando usamos una variable de tipo booleana, 
        poner que la condicion == true es redundar
        ya que el if trabaja de manera logica usando la inferencia de tipo
        var es que la variable condicion ya la hemos creado de tipo booleana
        */
        var condicion = true;
        if (condicion) { 
        //condicional simple : usamos solo el bloque if de la estructura de control       
            System.out.println("Condicion Verdadera"); 
        } 
        //condicional doble : usamos el bloque if y else de la estructura de control
        else {
            System.out.println("Condicion Falsa"); 
        }
        
        // 10.2 Ejercicio con la estructura if else 
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        if (numero == 1){
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);

        // 10.4 Sentencia de Control Switch
        /* Sentencia de control switch
        La expresion en switch no es de tipo booleana sino que es de tipo numero o string
        y dependiendo de la expresion si son numeros se presentan por diferentes casos
         */
        
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite un numero del 1 al 4: ");
        var numero2 = Integer.parseInt(entrada.nextLine());
        var numeroTexto2 = "Valor desconocido";
        switch(numero2) {
            case 1: 
                numeroTexto2 = "Numero uno";
                break; // si borramos el break seguira avanzando en los casos
            case 2:
                numeroTexto2 = "Numero dos";
                break;
            case 3:
                numeroTexto2 = "Numero tres";
                break;
            case 4:
                numeroTexto2 = "Numero tres";
                break;
            default:
                numeroTexto2 = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto2);
    
    
    
    }
}
