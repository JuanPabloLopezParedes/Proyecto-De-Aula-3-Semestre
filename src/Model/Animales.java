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
    
   private String nombre;
   private String ID;
   private String edad;
   private String peso;
   private String tipo;
   private String estado;
   private String habitat;
   private String cuidadorAsignado;

    public Animales(String nombre, String ID, String edad, String peso, String tipo, String estado, String habitat, String cuidadorAsignado) {
        this.nombre = nombre;
        this.ID = ID;
        this.edad = edad;
        this.peso = peso;
        this.tipo = tipo;
        this.estado = estado;
        this.habitat = habitat;
        this.cuidadorAsignado = cuidadorAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getCuidadorAsignado() {
        return cuidadorAsignado;
    }

    public void setCuidadorAsignado(String cuidadorAsignado) {
        this.cuidadorAsignado = cuidadorAsignado;
    }
   
   


  
   
   
}
