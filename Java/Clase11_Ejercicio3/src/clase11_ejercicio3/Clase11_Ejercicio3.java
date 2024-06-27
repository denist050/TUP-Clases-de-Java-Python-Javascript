package clase11_ejercicio3;

import java.util.Scanner;

public class Clase11_Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dos numeros: ");
        double num1 = Double.parseDouble(entrada.nextLine());
        double num2 = Double.parseDouble(entrada.nextLine());
        double resultado;
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
