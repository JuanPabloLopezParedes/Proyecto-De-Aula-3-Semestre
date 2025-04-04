/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author juanp
 */
public class Visitantes extends Persona{
 
    private String metodoPago;
    private int horaDeEntrada;
    private int horaDeSalida;
    private int numeroDeAcompañantes;
    private String fechaExcursion;

    public Visitantes(String metodoPago, int horaDeEntrada, int horaDeSalida, int numeroDeAcompañantes, String fechaExcursion, String nombre, String apellidos, int edad, String nacionalidad, int fechaDeExcursion) {
        super(nombre, apellidos, edad, nacionalidad, fechaDeExcursion);
        this.metodoPago = metodoPago;
        this.horaDeEntrada = horaDeEntrada;
        this.horaDeSalida = horaDeSalida;
        this.numeroDeAcompañantes = numeroDeAcompañantes;
        this.fechaExcursion = fechaExcursion;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
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

    public int getNumeroDeAcompañantes() {
        return numeroDeAcompañantes;
    }

    public void setNumeroDeAcompañantes(int numeroDeAcompañantes) {
        this.numeroDeAcompañantes = numeroDeAcompañantes;
    }

    public String getFechaExcursion() {
        return fechaExcursion;
    }

    public void setFechaExcursion(String fechaExcursion) {
        this.fechaExcursion = fechaExcursion;
    }

    
    

    
    

    
    
    
}
