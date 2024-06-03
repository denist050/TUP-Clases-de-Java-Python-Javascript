"""
miVariable = 3
print(miVariable)
miVariable = "hola a todos los alumnos de la tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(y))
# Cada valor es una literal que podemos asignar a nuestra variable
# Para saber la direccion de memoria donde estan las literales se obtiene con la direccion de id
# Print es una funcion para imprimir lo que esta dentro de los parentesis y la funcion id para mostrarnos
# Lo que esta dentro de los parentesis, la funcion id muestra la casilla de memoria donde esta almacenado
# El valor que contiene la variable x
# Las literales se escriben x608 ya que las direcciones de memorias son exadecimanes y se les pone una "x"
print(id(x))
print(id(z))

a: str = "Hola Mundo"  # str da una referencia de que la clase es de tipo string
print(type(a))

# Tipos int, float, String, Bool
x = 10
print(x)
print(type(x))
X = 14.5
print(x)
print(type(x))
x = "Hola Alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas (String)
miGrupoFavorito = "Van Halen"+" "+"The best Rock Band"  # Hicimos una concatenacion dentro de la asignacion
# Tambien se puede concatenar automaticamente omitiendo el operador
print("Mi grupo favorito es: "+miGrupoFavorito)

miGrupoFavorito = "Van Halen"
caracteristicas = "The best Rock Band"
print("Mi grupo favorito es:", miGrupoFavorito, caracteristicas)

numero1 = "7"
numero2 = "8"
print(numero1 + numero2)  # De esta manera se estaria concatenando las cadenas y el resultado es 78
print(int(numero1) + int(numero2))  # Aqui estariamos convirtiendo el string en entero(int)

# Tipos Booleanos (bool)
miBooleano = True  # True es la literal para decir que es verdadero
print(miBooleano)

miBooleano = 2 > 3
print(miBooleano)
# En este condicional imprimira verdadero o falso dependiendo de si la variable miBooleano es True o False
if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar la entrada del usuario
# Funcion input
# Salida de informacion donde le pedimos los datos al usuario y directamente
# le asignamos los datos al usuario con print(resultado)
resultado = input("Digite un numero: ")  # regresa un dato tipo string
print(resultado)
print(int(resultado) + 8)

# Conversion de la entrada de datos
numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))  # ponemos int transformando los datos tipo string en int
resultado = numero1 + numero2  # de esta manera no concatena sino que el operador los suma
print("El resultado de la suma es: ", resultado)


operandoA = 8
operandoB = 5
suma = operandoA + operandoB
print("Resultado de la suma: ", suma)
print(f"El resultado de la suma es: {suma}")
# incluir la variable dentro de una cadena mediante {} se lo llama interpolacion

resta = operandoA - operandoB
print(f"El resultado de la resta es: {resta}")

multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicacion es: {multiplicacion}")

division = operandoA / operandoB
print(f"El resultado de la division es: {division}")
division = operandoA // operandoB
print(f"El resultado de la division (int) es: {division}")

modulo = operandoA % operandoB
print(f"El resultado de la division o residuo (modulo) es: {modulo}")

exponente = operandoA ** operandoB
print(f"El resultado del exponente es: {exponente}")

miVariable3 = 10
print(miVariable3)

# Operadores de reasignacion
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1  # Hicimos lo mismo que en la linea 110 pero con una sintaxis que tiene python

# miVariable3 = miVariable - 2
miVariable3 -= 2
print(miVariable3)

# miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

miVariable3 /= 2
print(miVariable3)

d = 4
b = 2
resultado = d == b  # Comprobamos si son iguales
print(resultado)

# Operador diferente
resultado = d != b
print(resultado)

# Operador mayor que
resultado = d > b
print(resultado)

# Operador menor que
resultado = d < b
print(resultado)

# Operador mayor o igual que
resultado = d >= b
print(resultado)

# Operador menor o igual que
resultado = d <= b
print(resultado)
"""
# Operadores Logicos

# Operador and
a = False
b = True
resultado = a and b
print(resultado)

# Operador or
resultado = a or b
print(resultado)

#Operador not
resultado = not a
print(resultado)