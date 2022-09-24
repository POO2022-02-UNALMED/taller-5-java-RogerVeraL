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

public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones,aguilas;
    private String colorPlumas;
    
    //constructor 
    public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }
    
    //constructor vacio
    public Ave(){
        super(null, 0, null, null);
        this.colorPlumas=null;
        listado.add(this);
    }
    
    //getter & setter
    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    
    
    //metodos
    public static int cantidadAves(){
        return listado.size();
    }
    
    @Override
    public String movimiento(){
        return "volar";
    }
    public static Ave crearHalcon(String nombre, int edad, String genero){
        halcones++;
        return new Ave(nombre,edad,"montanas",genero,"cafe glorioso");   
    }
    
    public static Ave crearAguila(String nombre, int edad, String genero){
        aguilas++;
        return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");   
    
    }
}
