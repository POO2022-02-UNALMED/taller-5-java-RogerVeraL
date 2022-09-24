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
    public int halcones;
    public int aguilas;
    private String colorPlumas;
    
    //constructor 
    public Ave(String colorPlumas, String nombre, int edad, String habitat, String genero) {
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
    public Ave crearHalcon(String nombre, int edad, String genero){
        halcones++;
        return new Ave("cafe glorioso",nombre,edad,"montanas",genero);   
    }
    
    public Ave crearAguila(String nombre, int edad, String genero){
        aguilas++;
        return new Ave("blanco y amarillo",nombre,edad,"montanas",genero);   
    
    }
}
