/*
 * Proyecto EjerciciosProgramacionJava - Archivo Coche.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios2.Ejer2ClaseCoche;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 16 ene. 2022 17:23:04
 */
public class Coche {

    private String modelo, color, matricula;
    private boolean metalizada;
    private int anyoFabricacion;
    private tipoCoche tipoCoche;
    private modalidadSeguro modalidadSeguro;

    public enum tipoCoche {MINI, UTILITARIO, FAMILIAR, DEPORTIVO}

    public enum modalidadSeguro {TERCEROS, TODO_RIESGO}

    public Coche(String modelo, String color, boolean metalizada, String matricula, tipoCoche tipoCoche, int anyoFabricacion, modalidadSeguro modalidadSeguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizada = metalizada;
        this.matricula = matricula;
        this.tipoCoche = tipoCoche;
        this.anyoFabricacion = anyoFabricacion;
        this.modalidadSeguro = modalidadSeguro;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public boolean getMetalizada() {
        return metalizada;
    }

    public String getMatricula() {
        return matricula;
    }

    public tipoCoche getTipoCoche() {
        return tipoCoche;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public modalidadSeguro getModalidadSeguro() {
        return modalidadSeguro;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMetalizada(boolean metalizada) {
        this.metalizada = metalizada;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTipoCoche(tipoCoche tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public void setModalidadSeguro(modalidadSeguro modalidadSeguro) {
        this.modalidadSeguro = modalidadSeguro;
    }

    public void imprimir() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Color: " + getColor());
        System.out.println("Pintura metalizada: " + getMetalizada());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Tipo de coche: " + getTipoCoche());
        System.out.println("Año de fabricación: " + getAnyoFabricacion());
        System.out.println("Modalidad del seguro: " + getModalidadSeguro());
    }

}
