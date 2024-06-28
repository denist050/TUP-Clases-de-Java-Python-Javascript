// Ejercicio 1: calcular estacion del año
//
let mes = 10
let estacion; //undefined
// estructura if - else para verificar el mes del año
if(mes == 1 || mes == 2 || mes == 3){
    estacion = "Verano";
}
else if(mes == 4 || mes == 5 || mes == 6){
    estacion = "Otoño";
}   
else if(mes == 7 || mes == 8 || mes == 9){
    estacion = "Invierno";
}   
else if(mes == 10 || mes == 11 || mes == 12){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("La estacion del año es: " + estacion)