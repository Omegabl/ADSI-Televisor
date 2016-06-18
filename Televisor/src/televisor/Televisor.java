package televisor;

/**
 *
 * @author Sena
 */
public class Televisor{
	Canal canal;
	public String marca;
	public double largo;
	public double ancho;
	public double profundidad;
	public boolean encendido = false;
	public boolean mute = false;
	public int volumen = 0;
	public int canalActual;
	private int cantidadCanales = 125;
	private int volumenMaximo = 100;

	public Televisor(Canal canal, String marca, double largo, double ancho, double profundidad, int cantidadCanales, int volumenMaximo) {
		this.marca = marca;
		this.largo = largo;
		this.ancho = ancho;
		this.ancho = profundidad;
		this.cantidadCanales = cantidadCanales;
		this.volumenMaximo = volumenMaximo;
	}

	public void encender() {
		encendido = !encendido;
	}

	public void cambiarCanal(int canal) {
		this.canalActual = canal;
	}

	public void subirCanal() {
		canalActual = (canalActual == cantidadCanales) ? 1 : canalActual++;
	}

	public void bajarCanal() {
		canalActual = (canalActual == 1) ? cantidadCanales : canalActual--;
	}

	public void subirVolumen() {
		volumen = (volumen == volumenMaximo) ? volumen : volumen++;
	}

	public void bajarVolumen() {
		volumen = (volumen == 0) ? volumen : volumen--;
	}

	public void cambiarConfiguración() {
	}

	public void cambiarMute() {
		mute = !mute;
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Televisor TV = new Televisor("LG", 40, 100, 5, 125, 100);
		System.out.println(TV.marca);
		System.out.println(TV.cantidadCanales);
	}

}
