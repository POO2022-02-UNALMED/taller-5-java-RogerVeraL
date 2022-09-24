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

public class Pez extends Animal{
    private static ArrayList<Pez> listado = new ArrayList<Pez>();
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    
    //constructor 

    public Pez(String colorEscamas, int cantidadAletas, String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }
    
    
    //constructor vacio
    public Pez() {
        super(null, 0, null, null);
        this.colorEscamas = null;
        this.cantidadAletas = 0;
        listado.add(this);
    }
    
    //getter & setter

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
    
    
    //metodos
    public static int cantidadPeces(){
        return listado.size();
    }
    
    @Override
    public String movimiento(){
        return "nadar";
    }
    
    public Pez crearSalmon(String nombre, int edad, String genero){
        salmones++;
        return new Pez("rojo",6,nombre,edad,"oceano",genero);
    }
    
    public Pez crearBacalao(String nombre, int edad, String genero){
        bacalaos++;
        return new Pez("gris",6,nombre,edad,"oceano",genero);
    
    }
}
