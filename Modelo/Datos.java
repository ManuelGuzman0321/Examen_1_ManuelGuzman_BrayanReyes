package Modelo;

public class Datos {

    String Nombre, Cedula, Edad, cita;

    public Datos(String nombre, String cedula, String edad, String cita) {
        Nombre = nombre;
        Cedula = cedula;
        Edad = edad;
        this.cita = cita;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    
    public String getCedula() {
        return Cedula;
    }
    
    public void setCedula(String cedula) {
        Cedula = cedula;
    }
    
    public String getEdad() {
        return Edad;
    }
    
    public void setEdad(String edad) {
        Edad = edad;
    }
    
    public String getCita() {
        return cita;
    }
    
    public void setCita(String cita) {
        this.cita = cita;
    }
    









}
