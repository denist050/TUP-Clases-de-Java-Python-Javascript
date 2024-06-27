/*11.3 Ejercicio 3
Ejercicio 4: Leer 2 números; si son iguales que los multiplique, si el primero 
es mayor que el segundo que los reste y si no que los sume (pseudocódigo).
*/
package clase11_ejercicio3;

import java.util.Scanner;

public class Clase11_Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //Se le pide al usuario dos numeros, se guardan en var num1 y num2 como 
        //double, resultado se define como double
        System.out.println("Digite dos numeros: ");
        double num1 = Double.parseDouble(entrada.nextLine());
        double num2 = Double.parseDouble(entrada.nextLine());
        double resultado;
        //Estructura if else con condicional anidado para determinar
        //que operacion se hara de acuerdo a los numeros ingresados
        if (num1 == num2) {
            resultado = num1 * num2;
        } else if (num1 > num2) {
            resultado = num1 - num2;
        } else {
            resultado = num1 + num2;
        }
        System.out.println("El resultado es: " + resultado);
    }

    
}
