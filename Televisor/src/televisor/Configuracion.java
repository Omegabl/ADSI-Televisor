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

    private int brilloMax = 100;
    private int contrasteMax = 100;
    private int colorMax = 100;
    public int brilloActual;
    public int contrasteActual;
    public int colorActual;

    public void aumentarBrillo() {
        brilloActual = (brilloActual == brilloMax) ? 1 : brilloActual++;

    }

    public void bajarbrillo() {
        brilloActual = (brilloActual == 1) ? brilloMax : brilloActual--;
    }
    public void aumentarContraste() {
        contrasteActual = (contrasteActual == contrasteMax) ? 1 : contrasteActual++;
    
    }
    public void disminuirContraste() {
        contrasteActual = (contrasteActual == 1) ? contrasteMax : contrasteActual--;
    }
    
    public void aumentarColor() {
        colorActual = (colorActual == colorMax) ? 1 : colorActual++;

    }
    public void bajarColor() {
        colorActual = (colorActual == 1) ? colorMax : colorActual--;
    }
    

}
