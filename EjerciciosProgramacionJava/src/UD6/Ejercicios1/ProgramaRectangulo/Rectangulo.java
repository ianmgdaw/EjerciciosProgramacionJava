/*
 * Proyecto EjerciciosProgramacionJava - Archivo Rectangulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6.Ejercicios1.ProgramaRectangulo;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:17:45
 */
public class Rectangulo {
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    
    
    public String imprimirCoordenadas() {
        return "(" + x1 + "," + y1 + ")(" + x2 + "," + y2 + ")";
    }
    
    public int perimetro() {
        int ancho = Math.abs(x2-x1);
        int alto = Math.abs(y2-y2);
        int perimetro = (ancho + alto) * 2;
        return perimetro;
    }
    
    public int area(){
        int ancho = Math.abs((x2-x1));
        int alto  = Math.abs((y2-y1));
        int area = ancho * alto;
        return area;
    }
    
    
    
    
}
