/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Cuidadores;
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
public class cuidadoresDao {
    
    private static final String ARCHIVO_JSON =  "C:\\Users\\juanp\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoAula3Semestre\\src\\resources\\data\\cuidadores.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public List<Cuidadores> cargarRegistros(){
        try(Reader read = new FileReader(ARCHIVO_JSON)) {
            Type lista = new TypeToken<ArrayList<Cuidadores>>(){}.getType();
            List<Cuidadores> cuidadores = gson.fromJson(read, lista);
            return cuidadores != null ? cuidadores: new ArrayList<>();
            
        } catch (IOException e) {
            System.out.println("Error, no se puede cargar" + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    public void guardarCuidadores(Cuidadores cuidador){
        List<Cuidadores> cuidadores = cargarRegistros();
        cuidadores.add(cuidador);
        guardarTodos(cuidadores);
    }
    
    public void guardarTodos(List<Cuidadores> cuidadores){
        try(FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(cuidadores, writer);
            
        } catch (IOException e) {
            System.out.println("Error al guardar los cuidadores" + e.getMessage());
        }
    }
    
    public boolean eliminarConCC(String cedula){
        List<Cuidadores> cuidadores = cargarRegistros();
        int ccBuscado;
        
        try {
            ccBuscado = Integer.parseInt(cedula);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        boolean eliminacion = cuidadores.removeIf(cuidador -> cuidador.getCedula() == ccBuscado);
         
        if (eliminacion) {
            guardarTodos(cuidadores);
        }
        
        return eliminacion;
    }
    
     public Cuidadores buscarConCC(int cedula){
        List<Cuidadores> cuidadores = cargarRegistros();
        
        for(Cuidadores cuidador : cuidadores){
            if (cuidador.getCedula()== cedula) {
                return cuidador;
            }
        }
        return null;
    }
    
    
    
    
    
    
}
