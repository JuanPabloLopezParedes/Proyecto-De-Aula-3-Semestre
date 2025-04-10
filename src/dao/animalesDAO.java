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

/**
 *
 * @author juanp
 */
public class animalesDAO {
    private static final String ARCHIVO_JSON = "C:\\Users\\juanp\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoAula3Semestre\\src\\resources\\data\\animales.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    
    public List<Animales> cargarRegistros() {
        try (Reader read = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<ArrayList<Animales>>(){}.getType();
            List<Animales> animales = gson.fromJson(new FileReader("animales.json"), new TypeToken<List<Animales>>(){}.getType());
            return animales != null ? animales : new ArrayList<>();
        } catch (IOException e) {
            System.err.println("ERROR. No se puede cargar: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
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
}
