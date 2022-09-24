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

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
    public static int iguanas,serpientes;
    private String colorEscamas;
    private int largoCola;
    
    //constructor 
    public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas, int largoCola){    
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    //constructor vacio
    public Reptil(){    
        super(null, 0, null, null);
        this.colorEscamas = null;
        this.largoCola = 0;
        listado.add(this);
    }
    
    //getter & setter

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
    
    
    //metodos
    public static int cantidadReptiles(){
        return listado.size();
    }
    
    @Override
    public String movimiento(){
        return "reptar";
    }
    
    public static Reptil crearRIguana(String nombre, int edad, String genero){
        iguanas++;
        return new Reptil(nombre,edad,"humedal",genero,"verde",3);
    }
    
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes++;
        return new Reptil(nombre,edad,"jungla",genero,"blanco",1);
    
    }
}
