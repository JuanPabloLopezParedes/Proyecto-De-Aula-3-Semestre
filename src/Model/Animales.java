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
  private int ID;
  private int edad;
  private String peso;
  private String cuidadorAsignado;
  private String estado;
  private String tipo;
  private String habitat;

    public Animales(String nombre, String peso, String cuidadorAsignado, String estado, String tipo, String habitat, String tipo1, String habitat1) {
        this.nombre = nombre;
        this.ID = ID;
        this.edad = edad;
        this.peso = peso;
        this.cuidadorAsignado = cuidadorAsignado;
        this.estado = estado;
        this.tipo = tipo;
        this.habitat = habitat;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getCuidadorAsignado() {
        return cuidadorAsignado;
    }

    public void setCuidadorAsignado(String cuidadorAsignado) {
        this.cuidadorAsignado = cuidadorAsignado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

  
    
}
