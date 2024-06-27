"""
edad = int(input("Digite su edad: "))
veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
print(treinta)

if veinte:
    print("Usted esta dentro del rango de los 20' años")
elif treinta:
    print("Usted esta dentro del rango de los 30' años")
else:
    print('Usted no esta dentro del rango de los (20\') y (30\') años')
"""
edad = int(input("Digite su edad: "))
print(f"Su edad es {edad} años")
if (20 <= edad < 30) or (30 <= edad < 40):
    print("Usted esta dentro del rango de los 20' y 30' años ")
else:
    print('Usted no esta dentro del rango de los (20\') y (30\') años')
