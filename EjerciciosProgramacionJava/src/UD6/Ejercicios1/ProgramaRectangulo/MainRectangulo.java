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

        Rectangulo r1 = new Rectangulo(2, 2, 5, 5);

        System.out.println("Coordenadas rectángulo 1: " + r1.imprimirCoordenadas());
        System.out.println("Perímetro: " + r1.perimetro());
        System.out.println("Area: " + r1.area());
        System.out.println("");
        
        r1.setX1(10);

        System.out.println("Coordenadas rectángulo 1: " + r1.imprimirCoordenadas());
        System.out.println("Perímetro: " + r1.perimetro());
        System.out.println("Area: " + r1.area());
        System.out.println("");
        
        /*Rectangulo r2 = new Rectangulo(1, 3, 2, 4);

        System.out.println("Coordenadas rectángulo 2: " + r2.imprimirCoordenadas());
        System.out.println("Perímetro: " + r2.perimetro());
        System.out.println("Area: " + r2.area());
        */
    }
}
