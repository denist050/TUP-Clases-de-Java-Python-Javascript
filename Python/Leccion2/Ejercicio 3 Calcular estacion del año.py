#Ejercicio 3 Estacion del año
mes = int(input("Ingrese un mes del año del 1 al 12: "))
estacion = None
if 1 <= mes <= 3:
    estacion = "Verano"
elif 4 <= mes <= 6:
    estacion = "Otoño"
elif 7 <= mes <= 9:
    estacion = "Invierno"
elif 10 <= mes <= 12:
    estacion = "Privamera"
else:
    estacion = "Error, el numero no pertenece a ninguna estacion"

print(f"Para el mes {mes}, la estacion es: {estacion}")