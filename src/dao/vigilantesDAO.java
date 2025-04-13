/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Vigilantes;
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

/**
 *
 * @author juanp
 */

public class vigilantesDAO {
    private static final String ARCHIVO_JSON = "C:\\Users\\juanp\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoAula3Semestre\\src\\resources\\data\\vigilantes.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    
    public List<Vigilantes>cargarRegistro(){
        try(Reader read = new FileReader(ARCHIVO_JSON)) {
            Type list = new TypeToken<ArrayList<Vigilantes>>(){}.getType();
            List<Vigilantes> vigilantes = gson.fromJson(new FileReader("vigilantes.json"), new TypeToken<List<Vigilantes>>(){}.getType());
            return vigilantes != null ? vigilantes : new ArrayList<>();
            
            
        } catch (Exception e) {
            System.err.println("ERROR. No se puede cargar: " + e.getMessage());
            return new ArrayList<>();
        }
        
    }
    public void guardarVigilantes(Vigilantes vigilante){
        List<Vigilantes> vigilantes = cargarRegistro();
        vigilantes.add(vigilante);
        guardarTodo(vigilantes);
        
    }
    
    public void guardarTodo(List<Vigilantes> vigilantes){
        try(FileWriter write = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(vigilantes, write);
            
        } catch (Exception e) {
            System.err.println("Error al guardar al vigilante: " + e.getMessage());
        }
        
    }

    
}
