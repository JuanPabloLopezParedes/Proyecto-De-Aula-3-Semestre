/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author juanp
 */
public class Veterinarios extends Persona{
    
    private String direccion;
    private String horario;
    private int cedula;

    public Veterinarios(String direccion, String horario, int cedula, String nombre, String apellidos, int edad, String nacionalidad) {
        super(nombre, apellidos, edad, nacionalidad);
        this.direccion = direccion;
        this.horario = horario;
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
    
    
    
}
