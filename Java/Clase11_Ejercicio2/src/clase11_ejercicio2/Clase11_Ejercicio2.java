/*11.2 Ejercicio 2
En un almacén se hace un 20% de descuento a los clientes cuya compra supere los
$100. ¿Cuál será la cantidad que pagará una persona por su compra? (Diagrama N-S)
*/
package clase11_ejercicio2;

import java.util.Scanner;

public class Clase11_Ejercicio2 {

    public static void main(String[] args) {
        //Llamamos a la clase scanner para leer los datos
        Scanner entrada = new Scanner(System.in);
        //Pedimos al usuario que ingrese la cantidad a pagar
        //y se guarda en la variable double compra
        System.out.println("Digite la cantidad a pagar: ");
        double compra = Double.parseDouble(entrada.nextLine());
        //Se define la variable descuento como double
        double descuento;
        //Esctructura if else para calcular cuanto paraga la persona por la compra
        if(compra > 100){
            descuento = (compra * 0.2);
        }
        else{
            descuento = (0);
        }
        //Se calcula el precio final
        double precio_final = compra - descuento;
        //Imprimimos el precio
        System.out.println("El precio a pagar es: " + precio_final);
    }
    
}
