/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6P2_DanielElvir;

/**
 *
 * @author HP
 */
public class Estacionaria extends Consola{
    private int Numero_Controles;
    private int Almacenamiento;
    private String Tipo_Conexion;

    public Estacionaria() {
        super();
    }

    public Estacionaria(int Numero_Controles, int Almacenamiento, String Tipo_Conexion, String ID, String Fabrincante, int Años_Uso, double Precio, String Modelo) {
        super(ID, Fabrincante, Años_Uso, Precio, Modelo);
        this.Numero_Controles = Numero_Controles;
        this.Almacenamiento = Almacenamiento;
        this.Tipo_Conexion = Tipo_Conexion;
    }

    public int getNumero_Controles() {
        return Numero_Controles;
    }

    public void setNumero_Controles(int Numero_Controles) {
        this.Numero_Controles = Numero_Controles;
    }

    public int getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(int Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public String getTipo_Conexion() {
        return Tipo_Conexion;
    }

    public void setTipo_Conexion(String Tipo_Conexion) {
        this.Tipo_Conexion = Tipo_Conexion;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
