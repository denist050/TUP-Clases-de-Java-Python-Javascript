
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
        
        /*
        //Clase Scanner
        Scanner entrada = new Scanner(System.in); //aqui hemos creado un objeto de la clase scanner llamado entrada
        /*
        es necesario importar esta clase ya que se encuentra definida en
        otra parte de las clases en Java
        Las clases que vamos a utilizar en Java las vamos a clasificar o empaquetar
        en Folders, a esto se lo conoce como paquetes, asi que esta clase se encuentra
        en un paquete llamado java.util.scanner
        Sino esta importada Scanner aparecera en rojo
        */
        /*
        System.out.println("Digite su nombre = ");
        //El metodo nextLine permite leer informacion de la consola
        var usuario2 = entrada.nextLine();
        System.out.println("Usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado = " + titulo2 + " " + usuario2);
        */
        
        byte numEnteroByte = (byte)129; 
        /*
        podemos poner un valor superior al tipo byte mediante lo que se conoce
        como conversion de tipos, con (byte)129 lo estamos obligando al
        compilador a convertir este valor numerico de tipo entero a un valor
        de tipo byte.
        Si lo ejecutamos, imprimira -127 ya que se han ocupado los 127 numeros 
        positivos. Esto se conoce como perdida de presicion al convertir los
        tipos.
        */
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE); //Al ser clases, Byte comienza con mayusculas
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE);
        
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE);
        //Debido a las limitaciones de los tipos primitivos byte y short,
        //se recomienda usar el primitivo int.
        int numEnteroInt = (int) 2147483648L;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del Int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del Int: " + Integer.MAX_VALUE);
        /*
        El numero maximo que se puede guardar dentro int es 
        2147483647, para poner un numero mayor usamos la letra L para pasar
        la literal a tipo long que es de 64 bits.
        De todas maneras encontrarenmos perdida de presicion
        */
        long numEnteroLong = 9223372036854775807L; //Este seria el numero maximo para numeros enteros en java, para mayores se necesita usar floats
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo del long: " + Long.MAX_VALUE);
        
        /*
        float numFloat = 10.0; por defoul, 10.0 se convierte en double(64 bits)
        para que se convierta en flotante utilizamos la F al final de 10.0
        o usar (float) 10.0
        */
        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float = " + Float.MIN_VALUE);
        System.out.println("El valor maximo de float = " + Float.MAX_VALUE);
        //El valor positivo o negativo se demuestra utilizando notacion exponencial
        //Aqui seria 1.4E-45, usando la letra exponente indicamos en cuantas posiciones
        // se movera el valor 1.4 para simplificar el numero
        
        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de double = " + Double.MIN_VALUE);
        System.out.println("El valor maximo de double = " + Double.MAX_VALUE);
       
        /*
        //Ineferencia de tipos var y tipos primitivos
        var numEntero = 20; //Las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        //Para ver el tipo de dato, ejecutaremos el paso a paso, el modo debugfile
        //El punto de ruptura, line breakpoint detiene la ejecucion
        var numFloat2 = 10.0F;
        System.out.println("numFloat2 = " + numFloat2);
        var numDouble2 = 10.0;
        System.out.println("numDouble2 = " + numDouble2);
        */
        
        //Tipos primitivos char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //Este es el valor decimal del juego de caracter unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; //Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        var varCaracter1 = '\u0024'; //Indicamos a Java la asignacion con el codigo unicode
        //en la inferencia de tipo lo referencia a  u0024 como tipo char 
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = (char)36; //Aqui lo tomara como un valor entero y le asigna un tipo int, se usa (char) para que sea de tipo char
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$'; //Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        //Un char se puede asignar a un tipo entero porque el tipo int es de 
        //32 bits mientras que el tipo char es de 16 bits
        //Nos estaria mostrando el valor decimal asociado al simbolo que es 36 en unicode
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
        
        //Tipos primitivos tipos booleanos
        //Las variables de tipo bool son tipo bandera
        boolean varBool = true; //si usamos var en vez de boolean, usamos la inferencia de tipos y lo tomara como booleano
        System.out.println("varBool = " + varBool);
        //Cuando una variable es booleana ponemos la varia y la estructura if
        //detectara si es verdadera o falsa, aunque se puede usar varBool == true
        if (varBool) {
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
        
        //Algoritmo: ¿Es mayor de edad?
        var edad = 20; //Literal tener presente la inferencia de tipos
        //var adulto = edad >= 18; //Esta es una expresion booleana
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
        
        //Conversion de tipos primitivos
        var edad1 = Integer.parseInt ("20");
        System.out.println("edad1 = " + (edad1 + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir un valor
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad:");
        edad1 = Integer.parseInt (entrada.nextLine());
        System.out.println("edad = " + edad1);
        
        //Conversion de tipos primitivos en Java Parte 2
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        //usamos el metodo charAt
        var fraseChar = "programadores".charAt(12);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
      
        //Inicializar variables
        int num1 = 5, num2 = 4;
        //En inferencia de tipos se puede hacer en una sola linea;
        var solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("solucion de la multiplicacion = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("solucion de la division = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la division = " + solucion2);
        
        solucion = num1 % num2; //Guarda el residuo de la division
        System.out.println("solucion = " + solucion); 
        
        if (num1 % 2 == 0) 
            System.out.println("Es un numero par");
        else
            System.out.println("El numero es impar");
        
        int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2; //Una operacion
        System.out.println("varNum3 = " + varNum3);
        
        //Operador de composicion, incrementando en 1
        varNum1 += 1; // varNum1 = varNum1 + 1;
        System.out.println("varNum1 = " + varNum1);
        
        varNum1 -= 3;
        System.out.println("varNum1 = " + varNum1);
        
        varNum2 *= 2;
        System.out.println("varNum2 = " + varNum2);
        
        varNum2 /= 2;
        System.out.println("varNum2 = " + varNum2);
        
        varNum2 /= 3.4;
        System.out.println("varNum2 = " + varNum2);
        
        varNum2 %= 2;
        System.out.println("varNum2 = " + varNum2);
        
        
        //Operadores Unarios: Cambio de Signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB); //El resultado sera negativo
        
        //Operador de negacion
        var varC = true; //Esta literal por default en Java es tipo boolean
        var varD = !varC; //Aqui esta invirtiendo el valor 
        
        //Operadores Unarios de Incrementos: Preincremento
        var varE = 9; //Se va modificando su valor
        var varF = ++varE; //simbolo antes de la variable
        //Primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE);//Se incremento en la unidad  
        System.out.println("varF = " + varF); //Va a sumar uno
        
        //PostIncremento (el simbolo va despues de la variable)
        var varG = 3;
        var varH = varG++; //Primero el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores Unarios de decremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);
        
        //Postdecremento
        var varK = 8;
        var varL = varK--; //Primero el valor de la variable, luego queda el decremento 
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);
        
        //Operadores de igualdad y Relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum != bNum; //Los parentesis son opcionales
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello";
        var cadenaB = "Hello";
        var cVar = cadenaA == cadenaB; //Esta haciendo una comparacion de referencia, no de lo que tienen dentro
        System.out.println("cVar = " + cVar);
        //Para comparar objetos de tipo string se debe hacer esto
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
        var gVar = aNum >= bNum; //operadores relacionales > < >= <= !=
        System.out.println("gVar = " + gVar);
        
        if(aNum % 2 == 0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }
        var edad2 = 30;
        var adulto = 18;
        if(edad2 >= adulto) {
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
        
        //Operadores codicionales
        var valorA = 7;
        var valorMinimo = 0; //rango de 0 a 10
        var valorMaximo = 10;
        var respuesta = valorA > 0 && valorA <= 10;
        
        if(respuesta ){
            System.out.println("respuesta esta dentro del rango");
        }
        else {
            System.out.println("respuesta esta fuera del rango");
        }
        
        var vacaciones = false;
        var diaLibre = false;
        if(vacaciones || diaLibre){
            System.out.println("Papa puede asistir al juego");
        }
        else{
            System.out.println("Papa no puede asistir al juego");
        }
          
        //Operador Ternario
        var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var solucionAritmetica = 4 + 5 *6 / 3; //(4 +(5 * 6 )/ 3))
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        solucionAritmetica = (4 + 5) * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    
    
    }
}