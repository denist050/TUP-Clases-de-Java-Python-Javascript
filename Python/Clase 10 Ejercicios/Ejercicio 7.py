# Ejercicio 8: Dadas las horas trabajadas de 5 personas y la tarifa de pago,
# calcular el salario y la sumatoria de todos los salarios

# inicializamos suma_salarios como flotante, le damos valor de 0 y a i valor de 1
suma_salarios = float
suma_salarios = 0
i = 1
# con este ciclo controlamos que se pidan las horas y tarifas de 5 personas
while i <= 5:
    horas = float(input(f"Ingrese las horas trabajadas de la persona {i}: "))
    tarifa = float(input(f"Ingrese la tarifa por hora de la persona {i}: "))

    # calculamos el salario
    salario = horas * tarifa
    # mostramos el salario y utilizamos :.2f para mostrar solo 2 numeros flotantes
    print(f"El salario de la persona {i} es: ${salario:.2f}")
    # sumamos el total de salarios
    suma_salarios += salario

    # se le suma 1 al iterador por cada ciclo recorrido




    i += 1
# mostramos la suma de los salarios
print(f"La suma de todos los salarios es: ${suma_salarios:.2f}")