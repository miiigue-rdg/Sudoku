# 🧩 Sudoku en Java

Un proyecto completo para jugar y resolver Sudokus desde la terminal o mediante una interfaz gráfica usando Java. Está estructurado para ser fácilmente mantenible, modular y amigable para los usuarios y desarrolladores.

---

## 📚 Índice

- [🌟 Funcionalidades Principales](#-funcionalidades-principales)
- [🏛️ Diseño del Proyecto](#-diseño-del-proyecto)
- [📁 Estructura de Carpetas](#-estructura-de-carpetas)
- [🎮 Modo de Juego](#-modo-de-juego)
- [🛠️ Instalación y Uso](#-instalación-y-uso)
- [🖥️ Interfaces Disponibles](#-interfaces-disponibles)
- [⚙️ Configuración Interna](#-configuración-interna)
- [💡 Para Desarrolladores](#-para-desarrolladores)
- [📌 Ejemplos de Uso](#-ejemplos-de-uso)
- [🏁 Conclusión](#-conclusión)

---

## 🌟 Funcionalidades Principales

- 🖥️ Modo gráfico (GUI) y modo consola (CLI)
- 🔢 Tres niveles de dificultad: fácil, medio y difícil
- 🧠 Generación automática de tableros válidos
- ✅ Validación instantánea de movimientos
- 🔍 Opción para ver la solución
- 🎨 Colores diferenciados para jugadas válidas/erróneas

---

## 🏛️ Diseño del Proyecto

- 🧱 Modularidad y separación de responsabilidades
- 🚦 Validaciones mediante excepciones personalizadas
- 🧩 Algoritmo backtracking para resolver Sudokus
- 🔧 Arquitectura OOP con clases reutilizables

---

## 📁 Estructura de Carpetas

```plaintext
sudoku/
├── bin/                               # Archivos compilados
├── images/                            # Recursos gráficos (para GUI)
├── test/                              # Archivos de prueba (si se usan)
└── src/                               # Código fuente
    ├── ProgramaSudoku.java                    # Launcher GUI
    ├── ProgramaSudokuResolver.java            # Launcher consola
    ├── TableroSudokuBase.java                 # Lógica base del tablero
    ├── TableroSudokuJugar.java                # Lógica de juego
    ├── ReglasTableroBase.java                 # Reglas generales
    ├── ReglasTableroJugar.java                # Reglas aplicadas al juego
    ├── MetodosParaJugar.java                  # Utilidades de apoyo
    ├── ResolverSudoku.java                    # Resolver automático
    └── ExcepcionesPersonalizadas/
        ├── CoordenadaIncorrecta.java
        ├── DificultadIncorrecta.java
        └── NumeroNoValidoParaJugar.java
```

---

## 🎮 Modo de Juego

🧩 El objetivo es completar una cuadrícula de 9x9 con los números del 1 al 9 siguiendo las siguientes reglas:

- Cada fila debe contener todos los dígitos del 1 al 9 sin repetir
- Cada columna debe contener todos los dígitos del 1 al 9 sin repetir
- Cada subcuadro de 3x3 debe contener todos los dígitos del 1 al 9 sin repetir

---

## 🛠️ Instalación y Uso

### 📋 Requisitos

- Java JDK 8 o superior
- Terminal o IDE como Eclipse / IntelliJ IDEA

### 🧪 Compilar

```bash
javac -d bin src/*.java src/ExcepcionesPersonalizadas/*.java
```

### 🚀 Ejecutar

**Interfaz gráfica:**

```bash
java -cp bin ProgramaSudoku
```

**Interfaz consola:**

```bash
java -cp bin ProgramaSudokuResolver
```

---

## 🖥️ Interfaces Disponibles

### 💬 Modo Consola

- Representación de tablero en texto
- Interacción mediante entrada numérica
- Indicación de errores y movimientos inválidos
- Posibilidad de resolver automáticamente

### 🖼️ Modo Gráfico (GUI)

- Basado en Swing
- Panel de dificultad inicial
- Selección de celdas y números mediante clicks
- Colores para jugadas válidas, inválidas y solución

---

## ⚙️ Configuración Interna

Puedes modificar los niveles de dificultad dentro de `TableroSudokuJugar.java` en el método que genera el tablero:

```java
switch (dificultad.toLowerCase()) {
    case "facil":
        // Menos celdas vacías
        break;
    case "media":
        // Dificultad intermedia
        break;
    case "dificil":
        // Más celdas vacías
        break;
}
```

---

## 💡 Para Desarrolladores

- 💎 Código limpio y organizado
- 📐 Basado en principios SOLID (modularidad, cohesión)
- ♻️ Clases reutilizables
- 🧱 Componentes separados:
  - `Modelo`: TableroSudokuBase, TableroSudokuJugar
  - `Reglas`: ReglasTableroBase, ReglasTableroJugar
  - `Vista`: ProgramaSudoku, ProgramaSudokuResolver
  - `Utilidades`: MetodosParaJugar, ResolverSudoku

---

## 📌 Ejemplos de Uso

### ➕ Insertar número

```java
tablero.insertarNumero(1, 2, 5); // Fila 1, columna 2, número 5
```

### ✅ Validar jugada

```java
boolean valido = reglas.validarMovimiento(1, 2, 5, tablero);
```

### 🧠 Resolver el tablero

```java
ResolverSudoku solver = new ResolverSudoku();
boolean resuelto = solver.resolver(tablero);
```

---

## 🏁 Conclusión

Este proyecto de Sudoku en Java es ideal para aprender sobre estructuras de datos, validación de entrada, algoritmos de resolución y construcción de interfaces tanto gráficas como de línea de comandos. Ya sea que quieras jugar, mejorar el juego o estudiar su arquitectura, aquí tienes una base sólida para trabajar. ¡Que disfrutes resolviendo y programando!
