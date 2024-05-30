import java.util.Scanner;

public class Pruebas {

    public static void main(String args[]) {
        
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digite un nombre:");
        int edad1 = Integer.parseInt (entrada.nextLine());
        System.out.println("edad = " + edad1);
        
        System.out.println("Digite su nombre = ");
        int usuario2 = entrada.nextInt();
        System.out.println("Usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        int titulo2 = entrada.nextInt();
        int resultado = titulo2 + usuario2;
        System.out.println("resultado = " + resultado);
   
    
    }

}
