/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Veterinarios;
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
public class veterinariosDAO {
    
    private static final String ARCHIVO_JSON = "C:\\Users\\juanp\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoAula3Semestre\\src\\resources\\data\\veterinarios.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public List<Veterinarios> cargarRegistros(){
        try (Reader read = new FileReader(ARCHIVO_JSON)) {
            Type Lista = new TypeToken<ArrayList<Veterinarios>>(){}.getType();
            List<Veterinarios> veterinarios = gson.fromJson(read, Lista);
            return veterinarios != null ? veterinarios : new ArrayList<>();
               
        } catch (IOException e) {
            System.err.println("ERROR. No se puede cargar: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    public void guardarVeterinarios(Veterinarios veterinario){
        List<Veterinarios> veterinarios = cargarRegistros();
        veterinarios.add(veterinario);
        guardarTodos(veterinarios);
        
    }
    
    public void guardarTodos(List<Veterinarios> veterinarios){
        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(veterinarios, writer);    
        } catch (IOException e) {
            System.err.println("Error al guardar veterinarios: " + e.getMessage());
        }
        
    }
    
    public boolean eliminarConCC(String cedula){
        List<Veterinarios> veterinarios = cargarRegistros();
        int cedulaBuscada;
        
        try {
            cedulaBuscada = Integer.parseInt(cedula);    
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Numero de identificacion no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        boolean eliminacion = veterinarios.removeIf(veterinario -> veterinario.getCedula() == cedulaBuscada);
        
        if (eliminacion) {
            guardarTodos(veterinarios);   
        }
        return eliminacion;
    }
    
}
