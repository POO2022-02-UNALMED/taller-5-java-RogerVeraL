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

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
    public static int caballos,leones;
    private boolean pelaje;
    private int patas;
    
    //constructor

    public Mamifero(String nombre, int edad, String habitat, String genero,boolean pelaje, int patas ) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }
    //constructor vacio
     public Mamifero() {
        super(null, 0, null, null);
        this.pelaje=false;
        this.patas=0;
        listado.add(this);
    }

    //getter & setter

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
     
     
    //metodos
    public static int cantidadMamiferos() {
        return listado.size();
    }
    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        caballos++;
        return new Mamifero(nombre,edad,"pradera",genero,true,4);
    }
    
    public static Mamifero crearLeon(String nombre, int edad, String genero){
        leones++;
        return new Mamifero(nombre,edad,"selva",genero,true,4);
    }
}
