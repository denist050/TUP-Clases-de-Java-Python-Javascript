
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        final double salarioBase = 1000;
        double comisionBase = 150;
        double porcentajeBase = 0.05;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de autos vendidos por Juan: ");
        int autosVendidos = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese el valor total de venta de todos los autos vendidos:");
        int totalVentas = Integer.parseInt(entrada.nextLine());
        
        double comisionFinal = comisionBase * autosVendidos;
        double porcentajeFinal = totalVentas * 0.05;
        double salarioFinal = salarioBase + comisionFinal + porcentajeFinal;
        System.out.println("El salario final es: $" + salarioFinal);
        
        
        
    }
    
}
