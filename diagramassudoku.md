# 🗺️ Representación Visual del Proyecto Sudoku (Java)

## 🧩 Mapa de Clases

```mermaid
classDiagram
    direction LR

    class TableroSudokuBase {
        - int[][] tablero
        + getTablero()
        + setTablero()
    }

    class TableroSudokuJugar {
        - int[][] tableroUsuario
        + insertarNumero(int fila, int col, int valor)
        + obtenerEstado()
        + validarMovimiento(int fila, int col, int valor)
    }

    class ReglasTableroBase {
        + esNumeroValido(int fila, int col, int valor)
        + estaEnFila()
        + estaEnColumna()
        + estaEnBloque()
    }

    class ReglasTableroJugar {
        + validarMovimiento(int fila, int col, int valor)
    }

    class MetodosParaJugar {
        + imprimirTablero()
        + leerEntradaUsuario()
    }

    class ResolverSudoku {
        + resolver(int[][] tablero)
        + esSeguro(int fila, int col, int valor)
    }

    class ProgramaSudoku {
        + main(String[] args)
    }

    class ProgramaSudokuResolver {
        + main(String[] args)
    }

    class CoordenadaIncorrecta~Exception~
    class DificultadIncorrecta~Exception~
    class NumeroNoValidoParaJugar~Exception~

    TableroSudokuJugar --|> TableroSudokuBase
    ReglasTableroJugar --> ReglasTableroBase
    TableroSudokuJugar --> ReglasTableroJugar
    ProgramaSudoku --> TableroSudokuJugar
    ProgramaSudoku --> ResolverSudoku
    ProgramaSudokuResolver --> TableroSudokuJugar
    ProgramaSudokuResolver --> MetodosParaJugar
    TableroSudokuJugar --> CoordenadaIncorrecta
    TableroSudokuJugar --> NumeroNoValidoParaJugar
    ProgramaSudoku --> DificultadIncorrecta
```

---

## 🎮 Interacciones del Usuario (Casos de Uso)

```mermaid
stateDiagram-v2
    [*] --> ElegirDificultad : Inicia juego
    ElegirDificultad --> GenerarTablero : Según nivel elegido
    GenerarTablero --> MostrarTablero
    MostrarTablero --> IngresarNumero : Jugador introduce valor
    IngresarNumero --> ValidarEntrada
    ValidarEntrada --> MostrarTablero
    MostrarTablero --> VerSolucion : Si el usuario lo solicita
    MostrarTablero --> FinalizarJuego : Si completa correctamente
    FinalizarJuego --> [*]
```

---

## 🔗 Matriz de trazabilidad

| Funcionalidad Clave                         | Módulo Asociado             | Métodos Relevantes                        | Casos de Prueba o Uso                 |
|--------------------------------------------|-----------------------------|-------------------------------------------|----------------------------------------|
| Crear tablero inicial                       | `TableroSudokuBase`         | `setTablero()`, `getTablero()`            | `testCrearTablero()`                   |
| Insertar valores y comprobar jugadas        | `TableroSudokuJugar`        | `insertarNumero()`, `validarMovimiento()` | `testInsertarYValidar()`              |
| Validaciones de Sudoku                      | `ReglasTableroJugar`        | `validarMovimiento()`                     | `testReglasSudoku()`                   |
| Comprobar posiciones válidas                | `ReglasTableroBase`         | `esNumeroValido()`                        | `testVerificarCasilla()`              |
| Resolver tablero automáticamente            | `ResolverSudoku`            | `resolver()`, `esSeguro()`                | `testResolucionBacktracking()`        |
| Manejo de errores de entrada                | `*Incorrecta.java`          | `throw new ...`                           | `testErroresPersonalizados()`         |
| Modo visual con Swing                       | `ProgramaSudoku`            | `main()`                                  | `testGUI()`                            |
| Interfaz por consola                        | `ProgramaSudokuResolver`    | `main()`                                  | `testConsola()`                        |


