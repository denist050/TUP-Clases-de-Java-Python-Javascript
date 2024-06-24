//Ampliando el uso de var let y const
/*
con var puedes reasignar en cualquier momento
este forma parte del ambito global
un error es que se sobrescriba su scot
*/

var nombre = 'Ariel';
nombre = 'Osvaldo';
console.log(nombre);

function saludar(){
    var nombre3 = 'Natalia';
    console.log(nombre3);
}
//console.log(nombre3); //Aqui no lee el dato en la funcion, var funciona bien en function

if(true){
    var edad = 34;
    console.log(edad);
}

console.log(edad); //con var, la variable edad no deberia salir de la estructura if pero falla

/*
let puede ser reasignada en cualquier momento
la diferencia esque su ambito es de bloque
solo disponible dentro de un bloque de llaves 
o dentro de una funcion
*/

function saludar2(){
    let nombre2 = 'Ariel';
    console.log(nombre2);
}
//console.log(nombre2); aqui la variable no sale del bloque de la funcion

if(true){
    let edad = 33;
    console.log(edad);
}
//console.log(edad2); aqui let tamnbien respeta el bloque

/*
const se utiliza para valores constantes quenopueden ser registrados
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003; no se puede reasignar una variable de tipo constante
console.log(fechaNacimiento); //solo se ejecuta el console anterior