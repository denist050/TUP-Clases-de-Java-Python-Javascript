valorNumerico = int(input("Ingrese un valor numerico: "))
print(f"El valor numerico ingresado es: {valorNumerico}")
if (valorNumerico) >= 0 and (valorNumerico) <= 5:
    print("El valor numerico se encuentra entre el rango 0 a 5")
else:
    print("El valor numerico no se encuentra dentro de un rango")

#otra forma de hacerlo

valor = int(input("Ingrese un valor numerico: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f"El valor numerico {valor} se encuentra dentro del rango")
else:
    print(f"El valor numerico {valor} no se encuentra dentro del rango")