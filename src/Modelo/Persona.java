package Modelo;

public class Persona {

String Nombre,Cedula,edad;

public Persona(String nombre, String cedula, String edad) {
	super();
	Nombre = nombre;
	Cedula = cedula;
	this.edad = edad;
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
	return edad;
}

public void setEdad(String edad) {
	this.edad = edad;
}	
	

	

}
