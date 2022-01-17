/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainCoche.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios2.Ejer2ClaseCoche;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 16 ene. 2022 17:47:40
 */
public class MainCoche {

    public static void main(String[] args) {

        Coche coche1 = new Coche("C4", "Gris", true, "9835 JKP", TipoCoche.UTILITARIO, 2020, ModalidadSeguro.TODO_RIESGO);
        Coche coche2 = new Coche("Golf", "Negro", true, "5219 HGT", TipoCoche.UTILITARIO, 2018, ModalidadSeguro.TERCEROS);
        Coche coche3 = new Coche("Leon", "Rojo", false, "1536 GNH", TipoCoche.FAMILIAR, 2017, ModalidadSeguro.TODO_RIESGO);

        coche1.imprimir();
        coche2.imprimir();
        coche3.imprimir();

    }
}
