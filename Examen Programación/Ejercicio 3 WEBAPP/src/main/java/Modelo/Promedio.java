package Modelo;

import java.util.ArrayList;

public class Promedio {
    public int promedio(ArrayList<Integer> numeros){
        int numero = 0;
        for (int i = 0; i < numeros.size(); i++) {
            numero += numeros.get(i);
        }
        return numero/numeros.size();
    }
}
