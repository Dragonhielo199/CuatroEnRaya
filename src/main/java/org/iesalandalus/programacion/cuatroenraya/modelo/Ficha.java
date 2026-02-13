package org.iesalandalus.programacion.cuatroenraya.modelo;

public enum Ficha {
    AZUL("A"),
    VERDE("V");

    private String ficha;

    private Ficha(String ficha) {
        this.ficha = ficha;
    }

    @Override
    public String toString() {
        return ficha;
    }
}


