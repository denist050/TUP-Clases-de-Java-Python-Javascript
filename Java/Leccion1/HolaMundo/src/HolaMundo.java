
import java.util.Scanner;

//Mi clase en Java
/*
Usamos /* para escribir muchas lineas
 */
public class HolaMundo {

    public static void main(String args[]) {
        /*System.out.println("Hola mundo desde Java");
        
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "bienvenidos";
        
        Las variables tipo cadena tienen privilegios
        Si fuese un objeto se utiliza "new String("Bienvenidos");"
        
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en Java";
        System.out.println(miVariableCadena);
        Control + click izquierdo me donde esta instanciada la variable.
         */

        //Var -inferencia de tipos en Java
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //soutv + tab
        //Para ejecutar Shift + F6 

        /*Reglas para definir una variable en Java
         - Primer caracter del nombre de una variable podemos utilizar cualquier 
        en mayuscula o minuscula pero por convencion se recomienda el tipo de 
        escritura camelcase
         - nose pueden utilizar numeros como primer caracter de nuestra variable
        ni caracteres
         - si puede comenzar con _ o signo $
         - usar acento no es recomendables
         */
        
        
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        //Para ordenar el codigo utilizamos click derecho -> format 
        //alt + shift + F
        
        //cuando creamos una variable se recomienda usar un nombre que lo 
        //identifique para no crear confusion
        //tampoco deben coincidir con palabras reservadas de Java
        
        var a = 8;
        var b = 4;
        System.out.println(a + b); //Aqui no hay concatenacion porque var 
        //ha identificado que esta variable es de tipo entera entonces 
        //el operador de suma suma las literales
        
        //Se evaluan las expresiones de izquierda a derecha
        //Si el primer dato es de tipo cadena, entonces todo sera una cadena
        //A esto se lo conoce como contexto de cadena
        System.out.println(usuario + a + b);
        //para solucionar esto se puede  cambiar la prioridad
        System.out.println(usuario + " " + (a + b));
        //aqui se hizo primero la suma por prioridad de parentesis
        //y segundo hizo la concatenacion del string 
        
        //asignar valores a las variables se lo conoce como codigo duro
        var nombre = "Natalia";
        //"\n" nos da un salto de linea
        System.out.println("Nueva linea: \n" + nombre);
        // "\t" se usa para obtener un espacio
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("\t\t.:MENU:.");
        System.out.println("Retroceso: \b\b" + nombre);//se quita un espacio con\b
        System.out.println("Comillas simples: \'"+nombre+"\'");//se utiliza \' para poner un espacio
        System.out.println("Comillas dobles: \""+nombre+"\"");// se utiliza \" para comillas dobles
        
        //Clase Scanner
        Scanner entrada = new Scanner(System.in); //aqui hemos creado un objeto de la clase scanner llamado entrada
        //es necesario importar esta clase ya que se encuentra definida en
        //otra parte de las clases en Java
        //Las clases que vamos a utilizar en Java las vamos a clasificar o empaquetar
        //en Folders, a esto se lo conoce como paquetes, asi que esta clase se encuentra
        //en un paquete llamado java.util.scanner
        //Sino esta importada Scanner aparecera en rojo
        System.out.println("Digite su nombre = ");
        //El metodo nextLine permite leer informacion de la consola
        var usuario2 = entrada.nextLine();
        System.out.println("Usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado = " + titulo2 + " " + usuario2);
        
        
        
        
    }
}
