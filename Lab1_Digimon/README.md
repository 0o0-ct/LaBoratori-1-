
# Laboratorio 1 - Juego de Batalla Digimon

## Descripción
Este proyecto implementa un juego de batalla entre entrenadores de Digimon siguiendo las especificaciones del Laboratorio 1 de Programación Orientada a Objetos.

## Estructura del Proyecto
```
Lab1_Digimon/
├── src/
│   ├── Digimon.java          # Clase principal de Digimon
│   ├── Digievolución.java    # Clase para habilidades especiales
│   ├── Entrenador.java       # Clase para manejar entrenadores
│   ├── Batalla.java          # Lógica de batalla individual
│   ├── Juego.java           # Control del flujo del juego
│   └── Main.java            # Clase principal ejecutable
├── tests/
│   └── TestDigimon.java     # Pruebas básicas del sistema
└── README.md
```

## Clases Implementadas

### 1. Digimon
- **Propósito**: Representa un Digimon con sus atributos básicos y habilidades
- **Atributos**: nombre, tipo, ataque, defensa, digievolución
- **Métodos principales**: calcularAtaqueTotal(), usarDigievolución()

### 2. Digievolución
- **Propósito**: Maneja las habilidades especiales con probabilidad de activación
- **Atributos**: nombre, tipoEfecto, valor, probabilidad
- **Métodos principales**: seActiva(), aplicarEfecto()

### 3. Entrenador
- **Propósito**: Representa un entrenador con su equipo de 3 Digimon
- **Atributos**: nombre, equipo, digimonUsados
- **Métodos principales**: elegirDigimon(), decidirAcción()

### 4. Batalla
- **Propósito**: Maneja la lógica de combate entre dos Digimon
- **Métodos principales**: ejecutarBatalla(), calcularPoderTotal()

### 5. Juego
- **Propósito**: Controla el flujo completo del torneo de 4 rondas
- **Métodos principales**: iniciarJuego(), jugarRonda()

## Reglas del Juego

### Efectividad de Tipos
- Fuego > Planta (+20 daño)
- Planta > Agua (+20 daño)  
- Agua > Fuego (+20 daño)
- Eléctrico > Agua (+20 daño)
- Relaciones débiles (-10 daño)
- Neutral (0 modificador)

### Sistema de Digievolución
- Cada Digimon tiene una habilidad especial con probabilidad de activación
- Efectos posibles: +ataque, +defensa, daño directo al enemigo
- Se activa según porcentaje de probabilidad (0-100%)

## Cómo Ejecutar

### Compilar el proyecto:
```bash
cd /home/ubuntu/Lab1_Digimon
javac src/*.java
```

### Ejecutar el juego:
```bash
java -cp src Main
```

### Ejecutar pruebas:
```bash
javac -cp src tests/*.java
java -cp src:tests TestDigimon
```

## Características Implementadas
- ✅ Sistema completo de tipos y efectividad
- ✅ Digievoluciones con probabilidad de activación
- ✅ Interfaz interactiva para elegir Digimon y acciones
- ✅ Sistema de 4 rondas con marcador
- ✅ Prevención de reutilización de Digimon
- ✅ Casos de prueba básicos
- ✅ Código orientado a objetos con encapsulamiento apropiado
- ✅ Comentarios y documentación clara

## Notas de Implementación
- El código está diseñado para estudiantes de segundo semestre
- Se utilizan conceptos básicos de POO: clases, objetos, herencia, encapsulamiento
- La interfaz es por consola para simplicidad
- Se incluyen validaciones básicas para entrada de usuario
- El sistema de probabilidades usa Random de Java
