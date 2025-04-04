/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author juanp
 */
public class Administrador extends Persona{
    private int id;

    public Administrador(int id, String nombre, String apellidos, int edad, String nacionalidad, int fechaDeExcursion) {
        super(nombre, apellidos, edad, nacionalidad, fechaDeExcursion);
        this.id = id;
    }
    
    
    

    
}
