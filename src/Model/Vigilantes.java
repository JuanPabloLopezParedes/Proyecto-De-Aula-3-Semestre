/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Date;
/**
 *
 * @author juanp
 */

public class Vigilantes {
    
    private String nombre;
    private String apellido;
    private String edad;
    private String numDocumento;
    private String cargo;
    private String horario;
    private String zonaAsignada;

    public Vigilantes(String nombre, String apellido, String edad, String numDocumento, String cargo, String horario, String zonaAsignada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numDocumento = numDocumento;
        this.cargo = cargo;
        this.horario = horario;
        this.zonaAsignada = zonaAsignada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getZonaAsignada() {
        return zonaAsignada;
    }

    public void setZonaAsignada(String zonaAsignada) {
        this.zonaAsignada = zonaAsignada;
    }
    
    
    
}
