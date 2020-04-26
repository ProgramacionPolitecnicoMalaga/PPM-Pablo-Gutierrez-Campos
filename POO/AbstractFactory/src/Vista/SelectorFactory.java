package Vista;

import Escenarios.FactoryDesierto;
import Escenarios.FactoryEscenario;
import Escenarios.FactoryEspacio;
import Escenarios.FactorySelva;

public class SelectorFactory {

    public FactoryEscenario elegirFactory(String tipoEscenario){
            FactoryEscenario escenario = null;
        if (tipoEscenario.equals("Desierto")){
            FactoryDesierto desierto = new FactoryDesierto();
            escenario = desierto;

        } else if(tipoEscenario.equals("Espacio")){
            FactoryEspacio espacio = new FactoryEspacio();
            escenario=espacio;
        } else if(tipoEscenario.equals("Selva")){
            FactorySelva selva = new FactorySelva();
            escenario=selva;
        } else {
            System.out.println("Introduce un escenario válido");
        }
        return escenario;
    }
}
