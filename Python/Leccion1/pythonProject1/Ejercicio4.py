try:
    # Capturar la edad del usuario
    edad = int(input("Ingresa tu edad: "))

    # Determinar la etapa de vida
    if 0 <= edad <= 10:
        print("La infancia es increíble y bella.")
    elif 11 <= edad <= 19:
        print("Tienes muchos cambios, mucho que estudiar.")
    elif 20 <= edad <= 29:
        print("Amor y comienza el trabajo.")
    elif 30 <= edad <= 39:
        print("Estabilidad y capacidad adaptativa.")
    elif 40 <= edad <= 49:
        print("Los nuevos 20.")
    elif 50 <= edad <= 59:
        print("Tiempo de aprovechar la experiencia y disfrutar de la vida.")
    elif 60 <= edad <= 69:
        print("Los nuevos 40.")
    elif 70 <= edad <= 79:
        print("Espiritualidad y sabiduría.")
    elif 80 <= edad <= 89:
        print("Octogenarios llenos de historias.")
    elif 90 <= edad <= 99:
        print("Testigos de la historia. La longevidad es un regalo raro y preciado.")
    else:
        print("No tengo información para esa etapa de vida.")

except ValueError:
    print("Ingresa un número válido para la edad.")

