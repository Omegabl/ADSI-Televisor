package televisor;

import java.util.Scanner;

/**
 *
 * @author GAES2
 */
public class Televisor{
	Canal canal;
	Configuracion configuracion;
	public final String marca;
	public final double largo;
	public final double ancho;
	public final double profundidad;
	public boolean encendido = false;
	public boolean mute = false;
	public int volumen = 0;
	public int canalActual;
	private final int cantidadCanales;
	private final int volumenMaximo;

	public Televisor(Canal canal, Configuracion configuracion, String marca, double largo, double ancho, double profundidad, int cantidadCanales, int volumenMaximo) {
		this.marca = marca;
		this.largo = largo;
		this.ancho = ancho;
		this.profundidad = profundidad;
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


	public void cambiarMute() {
		mute = !mute;
	}
	
	public static void main(String[] args) {
		// TODO code application logic here
		String[] idiomas={"Español", "English", "français"};
		Canal canal = new Canal(5, "Caracol televisión", true);
		Configuracion configuracion = new Configuracion(100, 100, 100, idiomas);
		Televisor TV = new Televisor(canal, configuracion, "LG", 40, 100, 5, 125, 100);
		System.out.println(TV.marca);
		System.out.println(TV.cantidadCanales);
		TV.cambiarCanal(5);
		System.out.println(TV.canalActual);
		System.out.println(TV.canal.getNombre());
                Scanner opcion=new Scanner(System.in);
                System.out.print("Ingrese 1 para cambiar el tinte o 2 para cambiar la nitidez: ");
                int op_menu=opcion.nextInt();
                if (op_menu==1){
                configuracion.Aumentartinte();
                }else{
                configuracion.Cambiarnitidez();
            }
	}

}
