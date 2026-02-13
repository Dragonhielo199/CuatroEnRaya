package org.iesalandalus.programacion.cuatroenraya.modelo;

import java.util.Objects;

public class Casilla {

    private Ficha ficha;

    public Casilla() {
        ficha = null;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) throws CuatroEnRayaExcepcion {
        Objects.requireNonNull(ficha, "No se puede poner una ficha nula.");
        if (estaOcupada()) {
            throw new CuatroEnRayaExcepcion("La casilla ya contiene una ficha.");
        }
        this.ficha = ficha;
    }

    public boolean estaOcupada()  {
        return (ficha != null);
    }

    @Override
    public String toString() {
        String tipoFicha;
        if (ficha == null) {
            tipoFicha = " ";
        } else if (ficha == Ficha.AZUL) {
            tipoFicha = Ficha.AZUL.toString();
        } else {
            tipoFicha = Ficha.VERDE.toString();
        }
        return tipoFicha;
    }
}