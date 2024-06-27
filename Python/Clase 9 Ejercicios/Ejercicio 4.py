# Ejercicio 4: Suponga que se tiene un conjunto de calificaciones de un grupo de 10 alumnos. Realizar un algoritmo para calcular
# la calificacion promedio y la calificacion mas baja del grupo

suma = 0

contador = 0
nota_baja = 99999

for contador in range(10):

    notas = int(input("Digite una calificacion: "))

    suma += notas

    if notas < nota_baja:

        nota_baja = notas


calificacion_promedio = suma/10

print(f"La calificacion promedio es: {calificacion_promedio}")
print(f"La calificacion promedio es: {nota_baja}")


