var nombre = "Jose";
var apellido = "Montes";
var nombreCompleto = nombre+" "+apellido;
console.log(nombreCompleto);
var nombreCompleto2 = 'Ariel'+' '+'Bentacud';
console.log(nombreCompleto2);
var juntos = nombre + 219; //lee de izquierda a derecha siguiendo la cadena, lee el numero de tipo string
console.log(juntos);
juntos = nombre + (78 +17);
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += ' ' + apellido; //concatenacion usando el operador simplificado
console.log(nombre);

// Hoy ya no se usa var, se utiliza let y const
let nombre2 = 'Pedro';
console.log(nombre2);

const apellido2 = 'Lepes';
// apellido2 = 'Peres'; una constante no puede ser modificada
console.log(apellido2); 

let x, y; //Se pueden crear varias variables dentro de una misma linea
x = 17, y = 21; //se puede hacer asignacion de varias variables dentro de una misma linea
let z = x + y; //Se asigna el valor de la operacion
console.log(z);

//javascrip no permite comenzar la variable con un un numero  

let _1num = 31;
let rompiendo = "rompe"; //no utilizar palablas reservadas para variables como break

console.log(_1num);
console.log(rompiendo);