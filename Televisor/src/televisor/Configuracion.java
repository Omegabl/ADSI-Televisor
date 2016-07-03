/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisor;

import java.util.Scanner;

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
        int maxtinte=100;
        int mintinte=0;
        int i=0;
        int maxnitidez=100;
        int minnitidez=0;

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
        public void Aumentartinte(){
            Scanner mas=new Scanner(System.in);
            System.out.print("Digite la cantidad actual del tinte: ");
        int actualtinte=mas.nextInt();
        //Usuario elige en presionar 0 o 1
        System.out.print("Elija "+1+" si desea subir el tinte o "+0+" si desea reducir el tinte: ");
        int eleccion=mas.nextInt();
        if(eleccion==1 && eleccion<maxtinte && eleccion>mintinte){
          System.out.print("Elija la cantidad a la que desea subir el tinte: ");
          int cantidad=mas.nextInt();
          for(i=actualtinte;i<cantidad;i++){
              System.out.println(i+1);
          }  
        }else{
                 System.out.print("Elija la cantidad a la que desea reducir el tinte el tinte: ");
          int cantidad=mas.nextInt();
          for(i=actualtinte;i>cantidad;i--){
              System.out.println(i-1); 
                  }
        }
    }
        public void Cambiarnitidez(){
            Scanner mas=new Scanner(System.in);
            System.out.print("Digite la cantidad actual del nitidez: ");
        int actualtinte=mas.nextInt();
        //Usuario elige en presionar 0 o 1
        System.out.print("Elija "+1+" si desea subir la nitidez o "+0+" si desea reducir la nitidez: ");
        int eleccion=mas.nextInt();
        if(eleccion==1 && eleccion>minnitidez && eleccion<maxnitidez){
          System.out.print("Elija la cantidad a la que desea subir el nitidez: ");
          int cantidad=mas.nextInt();
          for(i=actualtinte;i<cantidad;i++){
              System.out.println(i+1);
          }  
        }else{
                 System.out.print("Elija la cantidad a la que desea reducir el tinte el tinte: ");
          int cantidad=mas.nextInt();
          for(i=actualtinte;i>cantidad;i--){
              System.out.println(i-1); 
                  }
        }
    }
}
