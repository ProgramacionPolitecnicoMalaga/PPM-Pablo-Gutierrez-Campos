import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrMoneda implements ActionListener{
	private VistaMoneda vista;
	private Tirada tirada;
	
	public CtrMoneda(VistaMoneda vc, Tirada t){
		vista = vc;
		tirada = t;
	}
	public void actionPerformed (ActionEvent e){
			if(e.getActionCommand().equals("Tirar")){
				double[] res = tirada.generarResultados();
				vista.escribirResultados(res);
			}else if(e.getActionCommand().equals("Repetir")){
				double[] res = tirada.generarResultados(vista.obtenerNumTiradas());
				vista.escribirResultados(res);
			}else if(e.getActionCommand().equals("Limpiar")){
				vista.limpiar();
				tirada.limpiar();
			}

	}
}
