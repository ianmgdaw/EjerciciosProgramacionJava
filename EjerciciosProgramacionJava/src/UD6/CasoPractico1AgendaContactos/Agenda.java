/*
 * Proyecto EjerciciosProgramacionJava - Archivo Agenda.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6.CasoPractico1AgendaContactos;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 24 ene. 2022 21:10:57
 */
public class Agenda {

    private Contacto[] contactos;
    private int cuantos;
    
    //CONSTRUCTOR
    public Agenda() {
        contactos = new Contacto[100];
        cuantos = 0;
    }
    
    //SETTERS / GETTERS
    public Contacto[] getContactos() {
        return contactos;
    }
    
    public int cuantos() {
        return cuantos;
    }
    
    
    //METODOS
    public void agregarContacto(String nombre, String telefono, String correo){
        if (cuantos < 100) {
            Contacto c = new Contacto(nombre, telefono, correo);
            contactos[cuantos] = c;
            cuantos++;
        } else {
            System.out.println("ERROR: No se puede agregar contacto. Lista llena.");
        }
    }
    
    
}
