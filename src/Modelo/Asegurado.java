package Modelo;

public class Asegurado extends Persona{

String TipoConsulta,Ebais, sex;

public Asegurado(String nombre, String cedula, String edad, String tipoConsulta, String ebais, String sex) {
	super(nombre, cedula, edad);
	TipoConsulta = tipoConsulta;
	Ebais = ebais;
	this.sex = sex;
}

public String getTipoConsulta() {
	return TipoConsulta;
}

public void setTipoConsulta(String tipoConsulta) {
	TipoConsulta = tipoConsulta;
}

public String getEbais() {
	return Ebais;
}

public void setEbais(String ebais) {
	Ebais = ebais;
}

public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}


	
}
