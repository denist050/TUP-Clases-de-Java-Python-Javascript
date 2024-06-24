//Ejercicio Asistir al juego
let vacaciones = false; diaDescanso = false;
if(vacaciones || diaDescanso){
    console.log("puede asistir al juego")
}
else{
    console.log("no puede asistir al juego")
}

//Operador ternario
let resultado2 = 3 > 2 ? "Verdaderos" : "Falso";
console.log(resultado2);

//Ejercicio Par o impar
let numero = 23;
resultado2 = numero % 2 == 0 ? "El numero es par" : "El numero es impar";
console.log(resultado2);

//Convertir String a Number
let miNumero = "10"; //es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero); //esta es una funcion, la funcion de conversion de la variable miNumero a entero y se le asigna a la variable edad2
console.log(typeof edad2);

if(edad2 >= 18){
    console.log("Puede votar");
}
else{
    console.log("No puede votar");
}

let resultado3 = edad2 >= 18 ? "Puede votar" : "No puede votar";
console.log(resultado3);

//Funcion isNaN
//funcion para comprobar si en la funcion anterior "10 "que era una cadena que luego se convierte en entero, incluimos una letra
//para hacer comprobaciones, necesitamos la funcion isNaN para verificar que la variable sea de tipo numerica

let miNumero2 = "f43"; //es una cadena
console.log(typeof miNumero2);
let edad3 = Number(miNumero2); //esta es una funcion, la funcion de conversion de la variable miNumero a entero y se le asigna a la variable edad2
console.log(typeof edad3);

if(isNaN(edad3)){//no es un numero = is Not a Number(devuelve un resultado booleano)
    console.log("Esta variable no contiene solo numeros")
}
else{
    if(edad3 >= 18){
        console.log("Puede votar");
    }
    else{
        console.log("No puede votar");
    }
}




