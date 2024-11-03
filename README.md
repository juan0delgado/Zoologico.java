
# Proyecto de Zoologico de Animales en un Zoológico 🐾

### por: Juan David Delgado Burbano.

## Introducción
+ Link Replit (https://replit.com/@delgadojuandavi/elmi#src/main/java/Animal.java)
+ La carpeta que dice "Taller" estan los codigos que se elaboraron en clase (que tambien se mandaron por el campus junto con el link de este replit).
+ La carpeta que dice "Tarea" estan los codigos completos tambien, pero con el agregado de las funciones que se pedian en la tarea del campus, como lectura y escritura de un archivo binario.

Este proyecto simula un sistema de gestión de animales en un zoológico, donde cada animal tiene un nombre, una edad y puede hacer un sonido característico. El sistema permite:

1. Agregar animales de distintos tipos.
2. Contar la cantidad de animales de cada tipo.
3. Guardar la lista de animales en un archivo binario.
4. Cargar la lista de animales desde el archivo para recuperar datos previos.

Este proyecto utiliza varios conceptos importantes de programación en Java, como la **serialización de objetos**, **herencia**, **uso de métodos constructores**, y la colección `Map` para realizar el conteo de animales por tipo.

## Temas y conceptos en el código

### 1. Serialización y archivos binarios
Se utiliza la interfaz `Serializable` para guardar la lista de animales en un archivo binario. Esto permite almacenar objetos de manera que se puedan recuperar en futuras ejecuciones sin perder información.

### 2. Herencia
La clase `Animal` es una clase abstracta que define las propiedades y métodos comunes a todos los animales. Las clases `Perro` y `Gato` heredan de `Animal` y personalizan el método `hacerSonido()`.

### 3. Método Constructor
Cada clase tiene un **constructor** para inicializar los atributos de los objetos. Por ejemplo, `Animal` inicializa `nombre` y `edad`, y `Perro` incluye el atributo `raza`.

### 4. Uso de `Map` para el conteo de tipos de animales
En la clase `Zoologico`, se utiliza un `Map` para contar la cantidad de animales de cada tipo. Esto facilita la organización y acceso a la cantidad de cada tipo de animal en el zoológico.

## Estructura de Archivos

El proyecto incluye las siguientes clases:

- `Animal.java`: Clase abstracta que define los atributos y métodos básicos de un animal.
- `Perro.java`: Clase que extiende `Animal` y añade el atributo `raza`.
- `Gato.java`: Clase que extiende `Animal` con características específicas de un gato.
- `Zoologico.java`: Clase que gestiona la lista de animales, permitiendo agregarlos, contar por tipo y guardar/cargar desde archivo.
- `Archivo.java`: Clase de utilidad que maneja la serialización y deserialización de la lista de animales en un archivo binario.
- `Main.java`: Clase principal que ejecuta el programa y realiza pruebas de las funciones del zoológico.

## Ejecución del Programa
+
+ ![image](https://github.com/user-attachments/assets/165b0f5e-130d-4603-ad06-854434817a08)
+
Para compilar y ejecutar el programa en la consola, utiliza los siguientes comandos:

```bash
# Compilar todos los archivos Java
javac *.java

# Ejecutar el programa
java Main
