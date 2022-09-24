/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooAnimales;

/**
 *
 * @author Roger Vera
 */
import gestion.Zona;
import zooAnimales.*;
public class Animal {
    private int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;
    
    //constructor
    public Animal(String nombre, int edad, String habitat, String genero) {
        this.totalAnimales++;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }
   
    //constructor vacio
    public Animal(){
        this.totalAnimales++;
    }
    
    //getter & setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    //metodos
    public String movimiento(){
        return "desplazarse";
    }
    
    
    public static String totalPorTipo() {
        return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + 
                "\nReptiles: " + Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() +
                "\nAnfibios: " + Anfibio.cantidadAnfibios();
    }
    
    
    @Override
    public String toString(){
        if(this.zona==null){
            return "Mi nombre es "+ this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+
                    " y mi genero es "+this.genero;
        }
        else{
            return "Mi nombre es "+ this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+
                    " y mi genero es "+this.genero+", la zona en la que me ubico es "+this.zona.getNombre()+
                    ", en el "+this.zona.getZoo().getNombre();
        }    
    }
}
