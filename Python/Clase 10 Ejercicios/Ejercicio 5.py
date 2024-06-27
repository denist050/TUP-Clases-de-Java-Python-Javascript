# Ejercicio 5: Calcular el factorial de un numero mayor o igual a 0

# Definimos i como entero
i = int
num = 0
# Le asignamos el valor de 1 a factorial
factorial = 1
# Con un condicional
while num == 0 or num < 0:
    # Pedimos al usuario que ingrese un numero y lo guardamos en la variable entera num
    num = int(input("Digite un numero: "))
    # Con esta condicion verificamos que si el numero ingresado por el usuario es 0 o negativo, se le
    # muestra el mensaje al usuario de que no es valido y debera volver a ingresarlo
    if num == 0 or num < 0 :
        print("Digite un numero valido")
    # Con esta condicion doble, si el numero ingresado es valido
    # se le dara a i el valor de 1
    # y se usara un ciclo while para sacar el factorial
    else:
        i = 1
        while i <= num:
            factorial = factorial * i
            i += 1
# Imprimimos el resultado
print(f"El factorial de {num} es: {factorial}")




