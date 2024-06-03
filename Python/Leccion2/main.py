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