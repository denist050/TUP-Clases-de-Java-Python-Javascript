# Ejercicio: Calcular la suma de "N" primeros numeros

numeros = int(input("Digite la cantidad de numeros a sumarse: "))
suma = 0
contador = 0

while contador <= numeros:
    suma += contador
    contador += 1

print(f"La suma es: {suma}")

# Tambien se puede hacer de esta manera

numeros = int(input("Digite la cantidad de numeros a sumarse: "))
suma = 0
contador = 0

for contador in range(numeros + 1):  # range(numeros + 1) tomara los varoles de 0 hasta el numero ingresado
    suma += contador

print(f"La suma es: {suma}")
