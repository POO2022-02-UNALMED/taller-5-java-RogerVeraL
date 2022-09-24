/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooAnimales;

/**
 *
 * @author Roger Vera
 */
import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas,salamandras;
    private String colorPiel;
    private boolean venenoso;
    
    
   
    //constructor
    public Anfibio(String nombre, int edad, String habitat, String genero,String colorPiel, boolean venenoso){super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }
    
    //constructor vacio
    public Anfibio(){
        super(null, 0, null, null);
        this.colorPiel = null;
        this.venenoso = false;
        listado.add(this);
    }
    //getter & setter

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    
    
    
    //metodos
    public static int cantidadAnfibios(){
        return listado.size();
    }
    
    @Override
    public String movimiento(){
        return "saltar";
    }
    public static Anfibio crearRana(String nombre, int edad, String genero){
        ranas++;
        return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
    }
    
    public static Anfibio crearSalmandra(String nombre, int edad, String genero){
        salamandras++;
        return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
    }

    
}
