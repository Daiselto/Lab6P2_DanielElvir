/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6P2_DanielElvir;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Portatil extends Consola{
    private String Tamaño_Pantalla;
    private int Bateria;
    private boolean tieneEstuche;

    public Portatil() {
        super();
    }

    public Portatil(String Tamaño_Pantalla, int Bateria, boolean tieneEstuche, String ID, String Fabrincante, int Años_Uso, double Precio, String Modelo) {
        super(ID, Fabrincante, Años_Uso, Precio, Modelo);
        this.Tamaño_Pantalla = Tamaño_Pantalla;
        this.Bateria = Bateria;
        this.tieneEstuche = tieneEstuche;
    }

    public String getTamaño_Pantalla() {
        return Tamaño_Pantalla;
    }

    public void setTamaño_Pantalla(String Tamaño_Pantalla) {
        this.Tamaño_Pantalla = Tamaño_Pantalla;
    }

    public int getBateria() {
        return Bateria;
    }

    public void setBateria(int Bateria) {
        this.Bateria = Bateria;
    }

    public boolean isTieneEstuche() {
        return tieneEstuche;
    }

    public void setTieneEstuche(boolean tieneEstuche) {
        this.tieneEstuche = tieneEstuche;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFabrincante() {
        return Fabrincante;
    }

    public void setFabrincante(String Fabrincante) {
        this.Fabrincante = Fabrincante;
    }

    public int getAños_Uso() {
        return Años_Uso;
    }

    public void setAños_Uso(int Años_Uso) {
        this.Años_Uso = Años_Uso;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
