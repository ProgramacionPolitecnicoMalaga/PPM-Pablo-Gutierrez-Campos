package com.politecnicomalaga;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConversorTest {

    @Test
    public void inchACm() {
        Conversor conversor = new Conversor();
        double ResultadoEsperado = 2.54;
        double ResultadoEsperado2 = 30.48;

        double ResultadoObtenido = conversor.inchACm(1);
        double ResultadoObtenido2 = conversor.inchACm(12);

        Double.compare(ResultadoEsperado,ResultadoObtenido);
        Double.compare(ResultadoEsperado2,ResultadoObtenido2);

    }

    @Test
    public void cmAInch() {
        Conversor conversor = new Conversor();

        double ResultadoEsperado = 4.72441;
        double ResultadoEsperado2 = 0;
        double ResultadoEsperado3 = 19.68;

        double ResultadoObtenido = conversor.cmAInch(12);
        double ResultadoObtenido2 = conversor.cmAInch(0);
        double ResultadoObtenido3 = conversor.cmAInch(0.5);

        Double.compare(ResultadoEsperado,ResultadoObtenido);
        Double.compare(ResultadoEsperado2,ResultadoObtenido2);
        Double.compare(ResultadoEsperado3,ResultadoObtenido3);

    }
}