/*
 * Proyecto EjerciciosProgramacionJava - Archivo TrasFestival.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package ProgramaMe;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 15 dic. 2021 20:29:05
 */
public class TrasFestival {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int nCubos;

        do {
            nCubos = lector.nextInt();

            if (nCubos % 2 == 0) {
                int dif, difAntes;
                int[] pesoCubos = new int[nCubos];
                //int[] diferencia = new int[nCubos/2];

                for (int i = 0; i < nCubos; i++) {
                    pesoCubos[i] = lector.nextInt();
                }

                Arrays.sort(pesoCubos);
                int difMax = 0;

                for (int i = 0; i < nCubos; i = i + 2) {
                    dif = pesoCubos[i + 1] - pesoCubos[i];
                    //System.out.print(dif + " ");
                    if (dif > difMax) {
                        difMax = dif;
                    }
                }
                System.out.println(difMax);
                
            }

        } while (nCubos != 0);

    }

}
