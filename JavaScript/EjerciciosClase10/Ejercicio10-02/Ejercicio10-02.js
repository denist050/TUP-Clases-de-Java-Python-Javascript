//Ejercicio 2: Hora del dia 

let horaDia = 9;
let mensaje; 

if(6 <= horaDia < 11){
    mensaje = "Good morning";
}
else if(11 <= horaDia < 16){
    mensaje = "Good afternoon";
}
else if(16 <= horaDia < 19){
    mensaje = "Good evening";
}
else if(19 <= horaDia <= 12){
    mensaje = "Good night";
}
else{
    mensaje = "Wrong number";
}
console.log(mensaje);


