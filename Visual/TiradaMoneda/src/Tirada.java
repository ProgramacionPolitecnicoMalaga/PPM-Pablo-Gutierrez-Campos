import java.awt.event.ActionListener;

public class Tirada {
	double cara = 0;
	double cruz = 0;
	double probabilidades[] = new double[4];//el tercer hueco es el numero de tiradas que lleva
											//el cuarto lugar es si es cara o cruz
	public double[] generarResultados(int n) {
		probabilidades[2]=probabilidades[2]+n;
		for (int i = 0; i < n; i++) {
			double res = Math.random();
			if (res < 0.5) {
				cara++;
				probabilidades[3] = 0;
			}
			else {
				cruz++;
				probabilidades[3]=1;
			}
		}
		probabilidades[0] = cara / probabilidades[2] * 100;
		probabilidades[1] = cruz / probabilidades[2] * 100;


		return probabilidades;
	}

	public double[] generarResultados() {
		probabilidades[2]++;
		double res = Math.random();
		if (res < 0.5) {
			cara++;
			probabilidades[3] = 0;
		}
		else {
			cruz++;
			probabilidades[3]=1;
		}

		probabilidades[0] = cara / probabilidades[2] * 100;
		probabilidades[1] = cruz / probabilidades[2] * 100;
		return probabilidades;
	}

	public void limpiar() {
		cara = 0;
		cruz = 0;
		probabilidades[2] = 0;
		probabilidades[0] = 0;
		probabilidades[1] = 0;
	}
	
}
