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
