# Leer 10 numeros e imprimir cuantos son positivos, cuantos negativos
# y cuantos neutros

conteoPositivos = 0
conteoNegativos = 0
conteoNeutros = 0
contador = 0

for contador in range(10):
    varNum = int(input("Digite un numero: "))

    if varNum == 0:
        conteoNeutros += 1
    elif varNum > 0:
        conteoPositivos += 1
    elif varNum < 0:
        conteoNegativos += 1


print(f"La cantidad de numeros positivos es: {conteoPositivos}")
print(f"La cantidad de numeros negativos es: {conteoNegativos}")
print(f"La cantidad de neutros es: {conteoNeutros}")
