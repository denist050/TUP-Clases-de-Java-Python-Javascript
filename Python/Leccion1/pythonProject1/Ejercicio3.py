def obtenerEstacion(mes):
    if mes in [1, 2, 3]:
        return "Verano"
    elif mes in [4, 5, 6]:
        return "Otoño"
    elif mes in [7, 8, 9]:
        return "Invierno"
    elif mes in [10, 11, 12]:
        return "Primavera"
    else:
        return None  # Manejo de un valor de mes inválido

# Solicitar al usuario que ingrese un mes
mes = int(input("Ingrese un mes (1-12): "))

# Obtener y mostrar la estación correspondiente
estacion = obtenerEstacion(mes)

if estacion:
    print(f"El mes {mes} corresponde a la estación: {estacion}")
else:
    print("Mes inválido. Por favor, ingrese un valor entre 1 y 12.")