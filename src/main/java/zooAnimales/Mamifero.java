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
    public int caballos;
    public int leones;
    private boolean pelaje;
    private int patas;
    
    //constructor

    public Mamifero(boolean pelaje, int patas,String nombre, int edad, String habitat, String genero ) {
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
    public  Mamifero crearCaballo(String nombre, int edad, String genero){
        caballos++;
        return new Mamifero(true,4,nombre,edad,"pradera",genero);
    }
    
    public  Mamifero crearLeon(String nombre, int edad, String genero){
        leones++;
        return new Mamifero(true,4,nombre,edad,"selva",genero);
    }
}
