/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author juanp
 */
public class Personas {
    private String nombre;
    private String apellidos;
    private int edad;
    private String nacionalidad;
    private int horaDeEntrada;
    private int horaDeSalida;

    public Personas(String nombre, String apellidos, int edad, String nacionalidad, int horaDeEntrada, int horaDeSalida) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.horaDeEntrada = horaDeEntrada;
        this.horaDeSalida = horaDeSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(int horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public int getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(int horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }
    
    
}
