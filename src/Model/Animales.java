/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author juanp
 */
public class Animales {
    
    private String nombreAsignado;
    private int edad;
    private String especie;
    private double peso;
    private String tipoDeAlimentacion;
    private String comportamiento;

    public Animales(String nombreAsignado, int edad, String especie, double peso, String tipoDeAlimentacion, String comportamiento) {
        this.nombreAsignado = nombreAsignado;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso;
        this.tipoDeAlimentacion = tipoDeAlimentacion;
        this.comportamiento = comportamiento;
    }

    public String getNombreAsignado() {
        return nombreAsignado;
    }

    public void setNombreAsignado(String nombreAsignado) {
        this.nombreAsignado = nombreAsignado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoDeAlimentacion() {
        return tipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(String tipoDeAlimentacion) {
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }
    
    
}
