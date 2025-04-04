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

public class Vigilantes extends Persona{
    
    private Date horario;
    private Zona zona;
    private String salario;
    private String cargo;

    public Vigilantes(Date horario, Zona zona, String salario, String nombre, String apellidos, int edad, String nacionalidad, int fechaDeExcursion) {
        super(nombre, apellidos, edad, nacionalidad, fechaDeExcursion);
        this.horario = horario;
        this.zona = zona;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
