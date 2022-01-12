/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainRectangulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6.Ejercicios1.ProgramaRectangulo;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:18:11
 */
public class MainRectangulo {
    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo();
        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 5;
        r1.y2 = 5;
        
        Rectangulo r2 = new Rectangulo();
        r2.x1 = 7;
        r2.y1 = 9;
        r2.x2 = 2;
        r2.y2 = 3;
        
        System.out.println("Coordenadas rectángulo 1: " + r1.imprimirCoordenadas());
        System.out.println("Perímetro: " + r1.perimetro());
        System.out.println("Area: " + r1.area());
        System.out.println("");
        System.out.println("Coordenadas rectángulo 2: " + r2.imprimirCoordenadas());
        System.out.println("Perímetro: " + r2.perimetro());
        System.out.println("Area: " + r2.area());
        
    }
}
