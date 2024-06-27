
package clase11_ejercicio2;

import java.util.Scanner;

public class Clase11_Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad a pagar: ");
        double compra = Double.parseDouble(entrada.nextLine());
        double descuento;
        if(compra > 100){
            descuento = (compra * 0.2);
        }
        else{
            descuento = (0);
        }
        double precio_final = compra - descuento;
        System.out.println("El precio a pagar es: " + precio_final);
    }
    
}
