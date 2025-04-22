/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Animales;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author juanp
 */

public class animalesDAO {
    private static final String ARCHIVO_JSON = "C:\\Users\\juanp\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoAula3Semestre\\src\\resources\\data\\animales.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    
    public List<Animales> cargarRegistros() {
        try (Reader read = new FileReader(ARCHIVO_JSON)) {
            Type Lista = new TypeToken<ArrayList<Animales>>(){}.getType();
            List<Animales> animales = gson.fromJson(read, Lista);
            return animales != null ? animales : new ArrayList<>();
        } catch (IOException e) {
            System.err.println("ERROR. No se puede cargar: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    
    //METODO GUARDADO DE ANIMALES
    public void guardarAnimal(Animales animal) {
        List<Animales> animales = cargarRegistros();
        animales.add(animal);
        guardarTodos(animales);
    }
    
    public void guardarTodos(List<Animales> animales) {
        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(animales, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar animales: " + e.getMessage());
        }
    }
    
    
    //METODO ELIMINACION DE ANIMALES
    public boolean eliminarConId(String Id){
        List<Animales> animales = cargarRegistros();
        int idBuscado;
        
        try {
            idBuscado = Integer.parseInt(Id);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        boolean eliminacion = animales.removeIf(animal -> animal.getID() == idBuscado);
         
        if (eliminacion) {
            guardarTodos(animales);
        }
        
        return eliminacion;
    }
    
    //METODO BUSQUEDA DE ANIMALES
    public Animales buscarConId(int id){
        List<Animales> animales = cargarRegistros();
        
        for(Animales animal : animales ){
            if (animal.getID() == id) {
                return animal;
            }
        }
        return null;
    }
}
