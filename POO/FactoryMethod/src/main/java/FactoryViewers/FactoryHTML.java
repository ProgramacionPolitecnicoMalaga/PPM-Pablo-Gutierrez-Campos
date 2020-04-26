package FactoryViewers;

import Modelo.Empadronamiento;

import java.util.ArrayList;

public class FactoryHTML implements Viewer {

    @Override
    public String imprimirDatos(ArrayList<Empadronamiento> empadronamientos) {
        String aux = "<table> \n";
        for (Empadronamiento e:empadronamientos) {
            aux += " <tr>\n" +
                    "        <th> " + e.getNacionalidad() +  "</th><th>"+ e.getAño()+ "</th><th>" + e.numeroEmpadronados + "</th>\n" +
                    "</tr>\n";

        }
        aux += "</table>";
        return aux;
    }
}
