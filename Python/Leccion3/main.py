# Ciclo while (Mientras o durante)
contador = 0
while contador < 78:
    print(f'Ejecutamos nuestro ciclo while {contador}')
    contador += 1
else:
    print('Fin del ciclo while')

# Imprimir numero del 0 al 5 con el ciclo while
contador = 0
maxNum = 5

while contador <= maxNum:
    print(contador)
    contador += 1

# ciclo while con variable decreciente

contador = 5
minimo = 0
while contador >= minimo:
    print(contador)
    contador -= 1

# Ciclo for

cadena = ('Hello')
for letra in cadena:
    print(letra)
else:
    print('Fin del ciclo for')

# Palabra reservada break
for letra in 'Alemania':
    if letra == 'a':
        print(f'Letra encontrada: {letra}')
        break  # Rompe el ciclo
else:
    print('Fin del ciclo for')

# Palabra reservada continue
# Imprimir numeros pares que se encuentran dentro de un rango de datos

for i in range(6):
    if i % 2 == 0:
        print(f"Valor {i}")

for i in range(6):
    if i % 2 != 0:
        continue  # Elude o ignora todos los numeros impares
    print(f"Valor: {i}")


