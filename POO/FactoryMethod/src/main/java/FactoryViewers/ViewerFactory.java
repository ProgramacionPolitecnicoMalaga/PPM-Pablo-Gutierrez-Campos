package FactoryViewers;

public class ViewerFactory {
     Viewer viewer = null;
    public Viewer crearViewer(String tipo){

        if(tipo.equals("html")){
            viewer = new FactoryHTML();
        } else if (tipo.equals("texto")){
            viewer = new FactoryTexto();
        }

    return viewer;
    }
}
