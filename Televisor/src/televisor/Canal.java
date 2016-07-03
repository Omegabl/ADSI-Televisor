/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisor;

/**
 *
 * @author APRENDIZ
 */
public class Canal {

	private int numero;
	private String nombre;
	private boolean closedCaption;

	public Canal(int numero, String nombre, boolean closedCaption) {
		this.numero = numero;
		this.nombre = nombre;
		this.closedCaption = closedCaption;
	}
	//Getters

	public int getNumero() {
		return numero;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isClosedCaption() {
		return closedCaption;
	}
	
}
