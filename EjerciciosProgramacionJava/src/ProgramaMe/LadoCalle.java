/*
 * Proyecto EjerciciosProgramacionJava - Archivo LadoCalle.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package ProgramaMe;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 15 dic. 2021 16:35:57
 */
public class LadoCalle {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num; 

        do {
            num = lector.nextInt();
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("DERECHA");
                } else {
                    System.out.println("IZQUIERDA");
                }
            }
        } while (num>0);
        

    }
}
