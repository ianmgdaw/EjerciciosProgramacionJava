/*
 * Proyecto EjerciciosProgramacionJava - Archivo HolaMundo.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package ProgramaMe;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 15 dic. 2021 13:00:25
 */
public class HolaMundo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nVeces;
        System.out.print("Escribe nº veces: ");
        
        nVeces = lector.nextInt();
        
        if (nVeces >=0 || nVeces <= 5) {
            for (int i = 0; i < nVeces; i++) {
                System.out.println("Hola Mundo");
            }
        }
        
    }
    
    
}
