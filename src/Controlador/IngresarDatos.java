package Controlador;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import Modelo.*;
import Vista.*;

public class IngresarDatos {
	
	ArrayList<Asegurado> Pacientes = new ArrayList<Asegurado>();
	
	String nombreTemp,edadTemp,cedulaTemp,TipoConTemp,ebaisTemp, sexoTemp;
	
	
	
	
	Asegurado Messi = new Asegurado(nombreTemp, cedulaTemp, edadTemp, TipoConTemp, ebaisTemp, sexoTemp);

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	
	
	public void Ingresar() {
	
		nombreTemp = JOptionPane.showInputDialog(null,"Nombre");

	
		cedulaTemp = JOptionPane.showInputDialog(null,"cedula");		
		
		edadTemp = JOptionPane.showInputDialog(null,"edad");
		
		TipoConTemp = JOptionPane.showInputDialog(null,"estado");
		
		ebaisTemp = JOptionPane.showInputDialog(null,"ebais");
		
		/*Messi.setNombre(nombreTemp);
		Messi.setCedula(cedulaTemp);
		Messi.setEdad(edadTemp);
		Messi.setEstadosalud(estadosaludTemp);
		Messi.setEbais(ebaisTemp);*/
		
		
		
		Pacientes.add(new Asegurado(nombreTemp, cedulaTemp, edadTemp, 	TipoConTemp, ebaisTemp, sexoTemp));
		


	}
	
	
    public void Mostrar() {
    
    
    
    for(int i=0;i<Pacientes.size();i++) {
    	
    	Asegurado a = Pacientes.get(i);
    	
    	
      JOptionPane.showMessageDialog(null, a.getNombre());	
    	JOptionPane.showMessageDialog(null, a.getCedula());
    	JOptionPane.showMessageDialog(null, a.getEdad());
    	JOptionPane.showMessageDialog(null, a.getTipoConsulta());
    	JOptionPane.showMessageDialog(null, a.getEbais());
    	
    	
    	
    	
    }
    	
    	
    	
    	
    	
    	
    	
    	
    }
	
	
	
	

}
