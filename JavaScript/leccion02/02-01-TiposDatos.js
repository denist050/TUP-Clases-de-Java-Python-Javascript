//Tipos de Datos en Javascript
/*
La sintaxis en lo que es comentarios
es identica a la de java
*/
//las variables son reutilizables en javascript
var nombre = "Ariel"; //Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre)
var numero = 3000; //Tipo Numerico
console.log(numero);

var objeto = {
    nombre : "Ariel",
    apellido : "Betancud",
    telefono : "2614524562"
}

console.log(objeto);

//Tipo de dato boolean
var bandera = true;
console.log(bandera);

//Tipo de dato funcion
//las funciones son un tipo de dato
//nos permite reutilizar lineas de codigo

function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;

    }
}

console.log(Persona)

//Tipo de dato undefined
var x;
console.log(typeof x);

x = undefined;
console.log(typeof x)

// null: significa ausencia de valor
var y = null; //null no es un tipo de dato,pero su origen es object
console.log(typeof y);

//Tipo de dato array y Empty String
var autos = ['Citroen','Audi','Chevrolet']
console.log(autos);
console.log(typeof autos); //Preguntamos que tipo de dato es:

var z = '';
console.log(z);
console.log(typeof z);

