/*
 * Proyecto EjerciciosProgramacionJava - Archivo Articulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6.Ejercicios1.ProgramaArticulo;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:34:28
 */
public class Articulo {
    public String nombre;
    public double precio;
    public int iva;
    public int cuantosQuedan;
    public double pvp, ivaEnEuros;
    
    //CONSTRUCTOR
    public Articulo(String nombre, double precio, int iva, int cuantosQuedan){
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cuantosQuedan = cuantosQuedan;
    }
    
    
       
    //METODOS
    public double pvp(){
        ivaEnEuros = ((precio * iva) / 100);
        pvp = precio + ivaEnEuros;
        return pvp;
    }
    
    public String imprimirArticulo(){
        return nombre + " - Precio:" + precio + "€ - IVA:" + iva + "% - PVP:" + pvp() + "€";
    }
    
    
    
}
