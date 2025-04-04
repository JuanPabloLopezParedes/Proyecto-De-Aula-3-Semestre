/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author juanp
 */
public class Habitat {
    
    private String tipoDeEcosistema;
    private double tamaño;
    private String horarioDeMantenimiento;
    private Encargado encargado;

    public Habitat(String tipoDeEcosistema, double tamaño, String horarioDeMantenimiento, Encargado encargado) {
        this.tipoDeEcosistema = tipoDeEcosistema;
        this.tamaño = tamaño;
        this.horarioDeMantenimiento = horarioDeMantenimiento;
        this.encargado = encargado;
    }

    public String getTipoDeEcosistema() {
        return tipoDeEcosistema;
    }

    public void setTipoDeEcosistema(String tipoDeEcosistema) {
        this.tipoDeEcosistema = tipoDeEcosistema;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getHorarioDeMantenimiento() {
        return horarioDeMantenimiento;
    }

    public void setHorarioDeMantenimiento(String horarioDeMantenimiento) {
        this.horarioDeMantenimiento = horarioDeMantenimiento;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }
    
    
}
