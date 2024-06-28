//Ejercicio 2: estaciones del año

let month = ['Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'];
function getmonth(n){
    if(n < 1 || n > 12){
            throw new Error('out of range');
    }
    return month[n-1];
}

console.log(getmonth(10))