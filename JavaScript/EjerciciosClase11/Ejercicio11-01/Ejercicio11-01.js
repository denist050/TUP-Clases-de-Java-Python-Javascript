// Evitar repetir tu codigo

let days = 'Sabado';
switch (days) {
    case 'Lunes':
        console.log('hoy es ' + days);
        break;
    case 'Martes':
        console.log('hoy es ' + days);
        break;
    case 'Miercoles':
        console.log('hoy es ' + days);
        break;
    case 'Jueves':
        console.log('hoy es ' + days);
        break;
    case 'Viernes':
        console.log('hoy es ' + days);
        break;
    case 'Sábado':
        console.log('hoy es ' + days);
        break;
    case 'Domingo':
        console.log('hoy es ' + days);
        break;
    default:
        break;
}

//Opcion mejorada

//Creamos un arreglo con los dias de la semana
let days2 = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes','Sabado', 'Domingo'];
//creamos funcion getDay que tendra un parametro de tipo entero y sera n
function getDay(n){
    if(n < 1 || n > 7){
            throw new Error('out of range');
    }
    return days2[n-1];
}

console.log(getDay(5))