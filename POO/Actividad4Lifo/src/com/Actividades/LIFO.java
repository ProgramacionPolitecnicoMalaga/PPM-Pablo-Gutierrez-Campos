package com.Actividades;
public class LIFO {
    private final int LONGITUD_MAXIMA =1000;
    private int numero;
    int [] pila;
    int longitud_actual = 0;
    int numero_elementos = 0;
    int posicion_actual = 0;
    public LIFO()
        {
            pila = new int [LONGITUD_MAXIMA];
        }

    public void insertar (int numero_elementos){

       longitud_actual = pila[numero_elementos];

        longitud_actual++;
    }


    public int extraer(){
        int valor = 0;
         valor = pila [longitud_actual];
        longitud_actual--;
        return valor;

    }
    public void mostrarCima(){
    int cima = 0;
    cima =  pila[longitud_actual];


    }

    public int longitud(){
        return longitud_actual;

    }

    }


//Cambiar robot en todos los sitios

