
# Laboratorio 1 - Juego de Batalla Digimon
## Estructura del Proyecto
```
Lab1_Digimon/
├── src/
│   ├── Digimon.java          
│   ├── Digievolución.java   
│   ├── Entrenador.java       
│   ├── Batalla.java          
│   ├── Juego.java           
│   └── Main.java           
├── tests/
│   └── TestDigimon.java    
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
lsd /home/Arch-Linux/Lab1_Digimon
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

