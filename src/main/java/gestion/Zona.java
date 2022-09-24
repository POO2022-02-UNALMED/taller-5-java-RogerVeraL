/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

/**
 *
 * @author Roger Vera
 */
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<Animal>();
    

    //constructor
    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;    
        this.zoo = zoo;
}

    //constructor vacio
    public Zona() {
    }
    
    //getter & setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }
    
    //metodos
    public void agregarAnimales(Animal a){
        this.animales.add(a);
    }
    
    public int cantidadAnimales(){
        return this.animales.size();
    }
    
}
