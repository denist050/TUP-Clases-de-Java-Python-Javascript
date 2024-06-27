# Ejercicio 7: Calcular suma de pares, cantidad de pares y promedio de impares

# pedimos los numeros a ingresar
n_elementos = int(input("Digite la cantidad de elementos a ingresar: "))

# Inicializamos variables
suma_pares, conteo_pares, suma_impares, conteo_impares = 0, 0, 0, 0

i = 1
# con este ciclo while verificamos que se le pida al usuario los numeros hasta alcanzar la variable n_elementos
while i <= n_elementos:
    num = int(input(f"{i}. Digite un numero: "))
    # con esta condicion if-else verificamos si son pareos o impares, haciendo la suma y el conteo
    if num % 2 == 0:
        # numero par, suma interactiva de pares
        suma_pares += num
        # conteo de pares
        conteo_pares += 1
    else:
        # numero impar, suma interactiva de impares
        suma_impares += num
        # conteo de impares
        conteo_impares += 1
    i += 1
# verificamos si son pares con este condicional y mostramos suma y conteo
if conteo_pares == 0:
    print("No se han digitado numeros pares")
else:
    print(f"La suma de los numeros pares es: {suma_pares}")
    print(f"El conteo de los numeros pares es: {conteo_pares}")
# verificamos si son impares con este condicional y mostramos el promedio
if conteo_impares == 0:
    print("No se han digitado numeros impares")
else:
    promedio_impares = suma_impares / conteo_impares
    print(f"El promedio de los numeros impares es: {promedio_impares}")
