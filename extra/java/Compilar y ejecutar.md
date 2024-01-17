Compilar y Ejecutar Archivos Java

1. **Crear un archivo .java:**
   Crea un archivo `.java` con tu código fuente, por ejemplo, `HolaMundo.java`.

2. **Compila el código fuente:**
   Abre una terminal y navega al directorio que contiene tu archivo `.java`. Ejecuta el siguiente comando para compilar:

   ```bash
   javac HolaMundo.java
   ```

   Esto generará un archivo `.class` con el bytecode.

## Ejecutar Archivos .class

1. **Ejecuta el programa:**
   Una vez compilado, ejecuta el programa con el siguiente comando:

   ```bash
   java HolaMundo
   ```

   Deberías ver la salida del programa en la consola.

## Convertir a Archivo JAR

1. **Crea el archivo JAR:**
   Después de compilar, puedes empaquetar tu programa en un archivo JAR. Ejecuta el siguiente comando:

   ```bash
   jar cfe HolaMundo.jar HolaMundo HolaMundo.class
   ```

   - `cfe`: Opciones del comando JAR.
   - `HolaMundo.jar`: Nombre del archivo JAR que se creará.
   - `HolaMundo`: Clase principal que se ejecutará.
   - `HolaMundo.class`: Archivo de clase compilado.

2. **Ejecuta el archivo JAR:**
   Ahora, puedes ejecutar el archivo JAR con el siguiente comando:

   ```bash
   java -jar HolaMundo.jar
   ```

   Esto debería imprimir "Hola Mundo" en la consola.

Ahora tienes un archivo JAR listo para distribuir y ejecutar fácilmente en entornos Java.
