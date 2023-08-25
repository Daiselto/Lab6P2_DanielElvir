/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6P2_DanielElvir;

import java.util.Date;

/**
 *
 * @author HP
 */
class Juego {
    private String Nombre;
    private String Descripcion;
    private Date Fecha_Lanzamiento;
    private double Precio;
    private String Estado;
    private boolean Rentable;
    private boolean Agregado;
    private int Cantidad_Disponible;

    public Juego() {
    }

    public Juego(String Nombre, String Descripcion, Date Fecha_Lanzamiento, double Precio, String Estado, boolean Rentable, boolean Agregado, int Cantidad_Disponible) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Fecha_Lanzamiento = Fecha_Lanzamiento;
        this.Precio = Precio;
        this.Estado = Estado;
        this.Rentable = Rentable;
        this.Agregado = Agregado;
        this.Cantidad_Disponible = Cantidad_Disponible;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFecha_Lanzamiento() {
        return Fecha_Lanzamiento;
    }

    public void setFecha_Lanzamiento(Date Fecha_Lanzamiento) {
        this.Fecha_Lanzamiento = Fecha_Lanzamiento;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public boolean isRentable() {
        return Rentable;
    }

    public void setRentable(boolean Rentable) {
        this.Rentable = Rentable;
    }

    public boolean isAgregado() {
        return Agregado;
    }

    public void setAgregado(boolean Agregado) {
        this.Agregado = Agregado;
    }

    public int getCantidad_Disponible() {
        return Cantidad_Disponible;
    }

    public void setCantidad_Disponible(int Cantidad_Disponible) {
        this.Cantidad_Disponible = Cantidad_Disponible;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
