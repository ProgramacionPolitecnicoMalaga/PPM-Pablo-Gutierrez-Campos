import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RankingPilotos {
    ArrayList<Piloto> listaDePilotos;
    BufferedReader bufferedReader;

    public RankingPilotos() {
        listaDePilotos = new ArrayList<Piloto>();
        try {
            bufferedReader = new BufferedReader(new FileReader("pilotos.csv"));
            String linea = bufferedReader.readLine();

            while (null != linea) {
                String[] lineasCSV = linea.split(";");
                añadirPiloto(new Piloto(lineasCSV[1], lineasCSV[2], Integer.parseInt(lineasCSV[0])));
                linea = bufferedReader.readLine();
            }
        } catch (FileNotFoundException | PilotoException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void añadirPiloto(Piloto piloto) throws PilotoException {
        if(listaDePilotos.contains(piloto)){
            throw new PilotoException("El piloto ya se encuentra en la carrera");
            // HACER EL EQUALS!!!!!!!
        }
        listaDePilotos.add(piloto);
    }
    public void adelantarPiloto(Piloto piloto) throws PilotoException {
        if(listaDePilotos.indexOf(piloto)== 0){
            throw new PilotoException("El piloto está en la primera posición y no puede adelantar");
        }else{
            listaDePilotos.set(listaDePilotos.indexOf(piloto), listaDePilotos.get(listaDePilotos.indexOf(piloto)-1));
            listaDePilotos.set(listaDePilotos.indexOf(piloto) -1, piloto );
        }
    }
    public void retrasarPiloto(Piloto piloto) throws PilotoException {
        if(listaDePilotos.indexOf(piloto)== listaDePilotos.size()-1){
            throw new PilotoException("El piloto está en la última posición y no se puede atrasar");
        }else{
            listaDePilotos.set(listaDePilotos.indexOf(piloto), listaDePilotos.get(listaDePilotos.indexOf(piloto)+1));
            listaDePilotos.set(listaDePilotos.indexOf(piloto)+1, piloto );
        }
    }

    public void eliminarPilotosDescalificados(){
        for(Piloto p:listaDePilotos){
            if(p.isDescalificado()){
                listaDePilotos.remove(p);
            }
        }
    }
    public void ordenarPilotosPorPosicionDeSalida(){

   }

   public void ordenarPilotosPorNombre(){
       Collections.sort(listaDePilotos);
   }

}
