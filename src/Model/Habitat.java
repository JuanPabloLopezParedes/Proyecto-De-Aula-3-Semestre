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
    private String encargado;
    private String nombreDeHabitat;

    public Habitat(String tipoDeEcosistema, double tamaño, String horarioDeMantenimiento, String encargado, String nombreDeHabitat) {
        this.tipoDeEcosistema = tipoDeEcosistema;
        this.tamaño = tamaño;
        this.horarioDeMantenimiento = horarioDeMantenimiento;
        this.encargado = encargado;
        this.nombreDeHabitat = nombreDeHabitat;
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

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getNombreDeHabitat() {
        return nombreDeHabitat;
    }

    public void setNombreDeHabitat(String nombreDeHabitat) {
        this.nombreDeHabitat = nombreDeHabitat;
    }
    
    
    
}
