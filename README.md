Aquí tienes la documentación para el código de conversión de temperaturas en Java que has proporcionado. He organizado la documentación para que cubra las descripciones de las clases, métodos, constantes, excepciones manejadas y el flujo de ejecución:

# **Documentación del Proyecto: Conversión de Temperatura (TemperatureConvertion)**

## **Descripción General**

Este proyecto proporciona una utilidad simple para convertir temperaturas entre grados Celsius y Fahrenheit utilizando valores enteros. La aplicación utiliza la clase `BigInteger` para garantizar que pueda manejar números grandes si es necesario. El programa permite al usuario interactuar a través de la consola y elegir entre convertir una temperatura de Fahrenheit a Celsius o de Celsius a Fahrenheit.

## **Estructura del Código**

### **Clase: TemperatureConvertion**

La clase `TemperatureConvertion` contiene los métodos necesarios para realizar la conversión de temperaturas entre Celsius y Fahrenheit. Se usan constantes para realizar los cálculos.

### **Constantes**
1. **celcsToFahrFactor**: 
   - **Tipo**: `BigInteger`
   - **Valor**: `9`
   - **Descripción**: Este factor se utiliza en la fórmula de conversión de Celsius a Fahrenheit.
   
2. **divisor**: 
   - **Tipo**: `BigInteger`
   - **Valor**: `5`
   - **Descripción**: Este valor es el divisor en la fórmula de conversión entre Celsius y Fahrenheit.
   
3. **offset**: 
   - **Tipo**: `BigInteger`
   - **Valor**: `32`
   - **Descripción**: Este es el desplazamiento utilizado en la conversión de Celsius a Fahrenheit para ajustar el punto de inicio de la escala Fahrenheit.

### **Métodos**

#### **celciusToFahrenheit(BigInteger celcius)**
- **Descripción**: Convierte una temperatura en grados Celsius a Fahrenheit.
- **Parámetro**:
  - `celcius` - Valor de la temperatura en Celsius que debe ser convertido. 
  - **Tipo**: `BigInteger`
- **Lógica del Método**: 
  - La fórmula para la conversión es: `F = C * (9/5) + 32`. Se multiplican los grados Celsius por 9, se divide entre 5 y luego se suma 32.
- **Salida**: Muestra el resultado de la conversión en Fahrenheit en la consola.

#### **fahrenheitToCelsius(BigInteger fahrenheit)**
- **Descripción**: Convierte una temperatura en grados Fahrenheit a Celsius.
- **Parámetro**:
  - `fahrenheit` - Valor de la temperatura en Fahrenheit que debe ser convertido. 
  - **Tipo**: `BigInteger`
- **Lógica del Método**: 
  - La fórmula para la conversión es: `C = (F - 32) * (5/9)`. Se resta 32 de la temperatura en Fahrenheit, luego se multiplica por 5 y se divide entre 9.
- **Salida**: Muestra el resultado de la conversión en Celsius en la consola.

### **Método principal: `public static void main(String[] args)`**

- **Descripción**: 
  Este método maneja la interacción con el usuario, presentando un menú de opciones y ejecutando las conversiones según las entradas proporcionadas por el usuario.
  
#### **Flujo del Programa**:
1. **Mostrar Menú**: Se presenta un menú en la consola con las siguientes opciones:
   - 1: Convertir Fahrenheit a Celsius.
   - 2: Convertir Celsius a Fahrenheit.
   - 3: Salir del programa.
   
2. **Captura de Entrada**: Se solicita al usuario que ingrese una opción.
   - Si el usuario elige la opción 1, se le pide que ingrese la temperatura en Fahrenheit y se llama al método `fahrenheitToCelsius`.
   - Si el usuario elige la opción 2, se le pide que ingrese la temperatura en Celsius y se llama al método `celciusToFahrenheit`.
   - Si elige la opción 3, el programa finaliza.
   
3. **Gestión de Excepciones**:
   - **IOException**: Se captura cuando hay un error al leer la entrada del usuario.
   - **NumberFormatException**: Se captura cuando el usuario ingresa un valor que no es un número válido.

### **Detalles sobre el Bucle de Ejecución**
El programa se ejecuta en un bucle `while` hasta que el usuario elija la opción 3 (Salir). Dentro del bucle, el programa lee la entrada del usuario para determinar qué conversión realizar o si debe salir.

### **Manejo de Excepciones**
El código maneja varias excepciones para asegurar que las entradas del usuario sean válidas:
1. **NumberFormatException**: 
   - Se captura si el usuario ingresa un valor que no puede convertirse en un número entero válido para realizar las conversiones.
   - Mensaje al usuario: "Invalid input. Please enter a valid number."
   
2. **IOException**: 
   - Se captura si hay un problema al leer la entrada desde la consola.
   - Mensaje al usuario: "Error reading input: [detalle del error]".

### **Mensajes al Usuario**
- En caso de una opción inválida: "Invalid option. Please choose a valid option."
- En caso de un valor numérico inválido: "Invalid input. Please enter a valid number."
- Al finalizar: "Exiting..."

## **Ejemplo de Ejecución**

```
------------------
Elige una opción: 
1. Fahrenheit to Celsius 
2. Celsius to Fahrenheit 
3. Exit
1
Enter the temperature in Fahrenheit (integer values only):
100
Your temperature in Celsius: 37°C
------------------
Elige una opción: 
1. Fahrenheit to Celsius 
2. Celsius to Fahrenheit 
3. Exit
3
Exiting...
```

## **Mejoras Futuras**
- Permitir la entrada de valores con decimales (flotantes).
- Añadir más conversiones de temperatura, como Kelvin.
- Implementar una interfaz gráfica para facilitar el uso.

Esta documentación cubre la funcionalidad del código y proporciona una guía detallada para los desarrolladores o usuarios interesados en entender su funcionamiento.