# Ejercicio año bisiesto

print("Comprobamos si el año es Bisiesto")

opcion = int(input("Para seguir adelante digite la opcion 1: "))

while opcion == 1:

    anio = int(input("Ingrese el anio: "))

    if ((anio % 4 == 0) and (anio % 100 != 0) or anio % 400 == 0):
        print(f"El anio {anio} es Bisiesto")

    else:
        print(f"El anio {anio} no es Bisiesto")

    opcion = int(input("Para seguir adelante digite la opcion 1: "))

print("Fin del programa")

