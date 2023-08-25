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
public class Consola {
    protected String ID;
    protected String Fabrincante;
    protected int Años_Uso;
    protected double Precio;
    protected ArrayList<Juego> juegos = new ArrayList();
    protected String Modelo;

    public Consola() {
    }

    public Consola(String ID, String Fabrincante, int Años_Uso, double Precio, String Modelo) {
        this.ID = ID;
        this.Fabrincante = Fabrincante;
        this.Años_Uso = Años_Uso;
        this.Precio = Precio;
        this.Modelo = Modelo;
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
        return Modelo;
    }
    
    
}
