/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainPunto.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6.Ejercicios1.ProgramaPunto;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:02:04
 */
public class MainPunto {
    public static void main(String[] args) {
        
        Punto p1 = new Punto(5,0);
        Punto p2 = new Punto(10,10);
        Punto p3 = new Punto(-3,7);
        
        System.out.println("Punto 1: " + p1.imprimirCoordenadas());
        System.out.println("Punto 2: " + p2.imprimirCoordenadas());
        System.out.println("Punto 3: " + p3.imprimirCoordenadas());
        
        p1.setX(50);
        p1.setY(20);
        p2.setX(20);
        p2.setY(3);
        p3.setX(-10);
        p3.setY(8);

        System.out.println("");
        System.out.println("Punto 1: " + p1.imprimirCoordenadas());
        System.out.println("Punto 2: " + p2.imprimirCoordenadas());
        System.out.println("Punto 3: " + p3.imprimirCoordenadas());
        
    }
            
    
}
