print("Ingrese los siguientes datos del libro: ")
nombreLibro = input("Digite el nombre del libro: ")
libroID = int(input("Digite el ID del libro: "))
precioLibro = float(input("Digite el precio del libro: "))
envio = input("Indicar si el envio es gratuito respondiendo si o no: ")
if (envio == "si"):
    envio = "El envio es gratuito"
elif (envio == "no"):
    envio = "El envio no es gratuito"
else:
    envio = "No ha digitado una opcion correcta"

print(f'''
        Nombre: {nombreLibro}
        ID: {libroID}
        Precio: ${precioLibro}
        Envio gratuito: {envio}
''')