/*
 * Proyecto EjerciciosProgramacionJava - Archivo PerimetroRectangulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package ProgramaMe;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 15 dic. 2021 17:01:17
 */
public class PerimetroRectangulo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int numHor, numVer, perimetro;

        do {
            numHor = lector.nextInt();
            numVer = lector.nextInt();
            
            perimetro = (numHor*2)+(numVer*2);
             
            System.out.println(perimetro);

        } while (numHor >= 0 && numVer >= 0);

    }
}
