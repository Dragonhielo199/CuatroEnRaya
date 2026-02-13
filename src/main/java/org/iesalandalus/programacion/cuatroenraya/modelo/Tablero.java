package org.iesalandalus.programacion.cuatroenraya.modelo;

public class Tablero {

    public static final int FILAS = 6;
    public static final int COLUMNAS = 7;
    public static final int FICHAS_IGUALES_CONSECUTIVAS_NECESARIAS = 4;

    public Tablero() {
        Casilla[][] tablero = new Casilla[FILAS][COLUMNAS];
    }

    private columnaVacia() {
        boolean columnaVacia = true;
        for (int columna = 0; columna < COLUMNAS; columna++) {
            for (int fila = 0; fila < FILAS; fila++) {
                if (estaOcupada()) {
                    columnaVacia = false;
                }
            }
        }
        return columnaVacia;
    }
}
