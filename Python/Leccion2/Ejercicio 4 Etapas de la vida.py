# Ejercicio 4 Etapas de la vida

edad = int(input("Ingrese su edad: "))
mensaje = None
if 0 <= edad < 10:
    mensaje = "La infancia es increible y bella"
elif 10 <= edad < 19:
    mensaje = "Tienes muchos cambios, mucho que estudias"
elif 20 <= edad < 29:
    mensaje = "Amor y comienza el trabajo"
elif 30 <= edad < 39:
    mensaje = "Estabilidad, nuevas metas"
elif 40 <= edad < 49:
    mensaje = "Los nuevos 20"
elif 50 <= edad < 59:
    mensaje = "Viajar y seguir creciendo"
elif 60 <= edad < 69:
    mensaje = "Los nuevos 40"
elif 70 <= edad < 79:
    mensaje = "Reflexion y espiritualidad"
elif 80 <= edad < 89:
    mensaje = "Periodo de paz y familia"
elif 90 <= edad <= 120:
    mensaje = "Prueba del paso del tiempo e historias"

print(f"Su edad es: {edad}, {mensaje}")