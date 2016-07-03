/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisor;

/**
 *
 * @author GAES2
 */
public class Configuracion {

	private final int brilloMax;
	private final int contrasteMax;
	private final int colorMax;
	public int brilloActual;
	public int contrasteActual;
	public int colorActual;
	public String[] idiomas;

	public Configuracion(int brilloMax, int contrasteMax, int colorMax, String[] idiomas) {
		this.brilloMax = brilloMax;
		this.contrasteMax = contrasteMax;
		this.colorMax = colorMax;
		this.idiomas = idiomas;
	}

	public void aumentarBrillo() {
		brilloActual = (brilloActual == brilloMax) ? brilloMax : brilloActual++;
	}

	public void disminuirBrillo() {
		brilloActual = (brilloActual == 0) ? brilloActual : brilloActual--;
	}

	public void aumentarContraste() {
		contrasteActual = (contrasteActual == contrasteMax) ? contrasteMax : contrasteActual++;

	}

	public void disminuirContraste() {
		contrasteActual = (contrasteActual == 0) ? contrasteActual : contrasteActual--;
	}

	public void aumentarColor() {
		colorActual = (colorActual == colorMax) ? colorMax : colorActual++;

	}

	public void disminuirColor() {
		colorActual = (colorActual == 0) ? colorActual : colorActual--;
	}

}
