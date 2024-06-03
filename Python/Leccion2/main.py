"""
# En esta clase veremos la sentencia if/else
condicion = False
if condicion:
    print("condicion verdadera")
else:
    print("condicion falsa")
# Si ponemos solo un numero o por ejemplo '', la sencia if/else evaluara si
# la variable esta vacia o tiene algun valor, si tiene algun valor sera verdadera
# y sino falsa
condicion = ''
if condicion:
    print("condicion verdadera")
else:
    print('condicion falsa')
# sino ponemos una variable tipo booleana nos dira que la condicion es sin especificar
condicion = ("Hola alumnos")
if condicion == True:
    print("condicion verdadera")
elif condicion == False:
    print("condicion falsa")
else:
    print("condicion sin especificar")
"""
# Ejercicio convertir numero a texto con sentencia if/else
# num = int(input("Digite un numero en el rango del 1 al 3: "))
# numTexto = ''
# if num == 1:
#     numTexto = 'Numero uno'
# elif num == 2:
#     numTexto = 'Numero dos'
# elif num == 3:
#     numTexto = 'Numero tres'
# else:
#     numTexto = 'Has ingresado un numero fuera de rango'
#
# print(f"El numero ingresado es {num} - {numTexto}")

condicion = True
# if condicion:
#     print("Condicion Verdadera")
# else:
#     print("Condicion Falsa")

print("Condicion Verdadera") if condicion else ("Condicion Falsa")
