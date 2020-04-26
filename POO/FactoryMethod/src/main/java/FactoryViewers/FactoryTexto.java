package FactoryViewers;

import Modelo.Empadronamiento;

import java.util.ArrayList;

public class FactoryTexto implements Viewer {

    @Override
    public String imprimirDatos(ArrayList<Empadronamiento> empadronamientos) {
        String aux = "Listado de empadronamientos: \n";
        for (Empadronamiento e:empadronamientos) {
            aux += " El total de empadronados en" + e.getAño() + "procedentes de " + e.getNacionalidad() + "fue de" + e.getNumeroEmpadronados() + "personas\n" ;

        }
        return aux;
    }
    }

