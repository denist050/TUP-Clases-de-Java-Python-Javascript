
import java.util.Scanner;


public class EjercicioTiendaDeLibros {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos del libro: ");
        
        System.out.println("Digite el nombre del libro:");
        String nombreLibro = entrada.nextLine();
        
        System.out.println("Digite el ID del libro:");
        int idLibro = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Digite el precio del libro:");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        
        System.out.println("Indicar si el envio es gratuito digitando true o false:");
        boolean envio = Boolean.parseBoolean(entrada.nextLine());
        
        
        
        System.out.println("Nombre: " + nombreLibro + "\n" + "ID: " + 
                idLibro + "\n" + "Precio: $" + precioLibro);
                 
        if (envio) {
            System.out.println("El envío es gratuito");
        } else {
            System.out.println("El envío no es gratuito");
        }
        
    
    
    }
    
}
