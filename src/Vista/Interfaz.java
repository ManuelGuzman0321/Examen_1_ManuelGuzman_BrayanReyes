package Vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import Controlador.*;
import Modelo.Asegurado;
import javax.swing.JPasswordField;
import javax.swing.JTable;
public class Interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCedula;
	
	String nombreTemp,edadTemp,cedulaTemp,TipoConTemp,ebaisTemp, sexoTemp;
	
    IngresarDatos Elbicho = new IngresarDatos();
    
    ArrayList<Asegurado> CR7 = new ArrayList<Asegurado>();
    public JTextField NombreUSA;
    private JPasswordField Contraseña;
    
    public static String NomUSA;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		JPanel panel = new JPanel();
		
		panel.setVisible(false);
		JLabel lblNewLabel_1_1 = new JLabel("Hospital Enrrique Baltodano Briceño");
		JLabel lblNewLabel_1 = new JLabel("BIENVENIDO");
		lblNewLabel_1_1.setVisible(false);
		lblNewLabel_1.setVisible(false);
		JPanel PanelManual = new JPanel();
		JPanel PanelMenu = new JPanel();
		PanelMenu.setVisible(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		PanelManual.setVisible(false);
		JPanel PanelMostrar = new JPanel();
		PanelMostrar.setVisible(false);
		JPanel PanelAdmin = new JPanel();
		PanelAdmin.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		PanelAdmin.setVisible(false);
		JPanel PanelOtorgar = new JPanel();
		PanelOtorgar.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		PanelOtorgar.setVisible(true);
		
		
		JLabel medida = new JLabel("xx");
		JPanel PanelIngreso = new JPanel();
		PanelIngreso.setVisible(false);
		
		
		PanelIngreso.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		PanelIngreso.setBounds(10, 10, 622, 353);
		contentPane.add(PanelIngreso);
		PanelIngreso.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre del asegurado:");
		lblNewLabel_2.setBounds(10, 10, 141, 13);
		PanelIngreso.add(lblNewLabel_2);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(10, 33, 129, 19);
		PanelIngreso.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Numero de cedula:");
		lblNewLabel_2_1.setBounds(10, 62, 141, 13);
		PanelIngreso.add(lblNewLabel_2_1);
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.setBounds(10, 85, 129, 19);
		PanelIngreso.add(txtCedula);
		
		JLabel lblNewLabel_3 = new JLabel("Comunidad de EBAIS:");
		lblNewLabel_3.setBounds(10, 114, 141, 13);
		PanelIngreso.add(lblNewLabel_3);
		
		JComboBox ComunidadEBAIS = new JComboBox();
		ComunidadEBAIS.setModel(new DefaultComboBoxModel(new String[] {"Corazon de Jesus", "Nazareth", "Moracia", "La Victoria", "Guadalupe", "Barrio la Cruz", "Felipe Perez"}));
		ComunidadEBAIS.setBounds(10, 137, 129, 21);
		PanelIngreso.add(ComunidadEBAIS);
		
		JSlider Sedad = new JSlider();
		Sedad.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				medida.setText(Integer.toString(Sedad.getValue()));
				
			}
		});
		Sedad.setMajorTickSpacing(10);
		Sedad.setMinorTickSpacing(10);
		Sedad.setSnapToTicks(true);
		Sedad.setPaintTicks(true);
		Sedad.setPaintLabels(true);
		Sedad.setBounds(10, 295, 211, 37);
		PanelIngreso.add(Sedad);
		
		JLabel medidor = new JLabel("Indique la edad:");
		medidor.setBounds(10, 272, 141, 13);
		PanelIngreso.add(medidor);
		
		JLabel lblNewLabel_5 = new JLabel("Consulta:");
		lblNewLabel_5.setBounds(10, 168, 129, 13);
		PanelIngreso.add(lblNewLabel_5);
		
		JComboBox Padecimientos = new JComboBox();
		Padecimientos.setModel(new DefaultComboBoxModel(new String[] {"Consulta General", "Odontologia", "Cirugia Menor", "Cuidados Prenatal", "Emergencia"}));
		Padecimientos.setBounds(10, 191, 129, 21);
		PanelIngreso.add(Padecimientos);
		
		JLabel lblNewLabel_6 = new JLabel("Sexo:");
		lblNewLabel_6.setBounds(10, 220, 80, 13);
		PanelIngreso.add(lblNewLabel_6);
		
		JComboBox SexoBox = new JComboBox();
		SexoBox.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer"}));
		SexoBox.setBounds(10, 241, 129, 21);
		PanelIngreso.add(SexoBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(285, -1, 4, 352);
		PanelIngreso.add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(298, 10, 313, 267);
		PanelIngreso.add(scrollPane);
		
		JTextArea TXTIngre = new JTextArea();
		TXTIngre.setEditable(false);
		scrollPane.setViewportView(TXTIngre);
		
		JButton btnVolverIng = new JButton("Volver");
		btnVolverIng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelIngreso.setVisible(false);
				PanelMenu.setVisible(true);
				
				TXTIngre.setText(null);
						txtNombre.setText(null);
						txtCedula.setText(null);
						ComunidadEBAIS.setSelectedItem("Corazon de Jesus");
				         Padecimientos.setSelectedItem("Consulta General");
				         SexoBox.setSelectedItem("Hombre");
				         Sedad.setValue(50);
				         medida.setText("xx");
				
				
			}
		});
		btnVolverIng.setBounds(304, 304, 85, 21);
		PanelIngreso.add(btnVolverIng);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nom, ced, ed, comu, tconsul, sexo;
				
				nom = txtNombre.getText();
				ced = txtCedula.getText();
				ed = Integer.toString(Sedad.getValue());
				comu = (String) ComunidadEBAIS.getSelectedItem();
				tconsul = (String) Padecimientos.getSelectedItem();
				sexo = (String) SexoBox.getSelectedItem();
				
				CR7.add(new Asegurado (nom, ced, ed, comu, tconsul, sexo));
				
				PanelMenu.setVisible(true);
				PanelIngreso.setVisible(false);
				
				JOptionPane.showMessageDialog(null,"INFORMACION DEL ASEGURADO(A) GUARDADO CON EXITO!!");
				
				
				TXTIngre.setText(null);
				txtNombre.setText(null);
				txtCedula.setText(null);
				ComunidadEBAIS.setSelectedItem("Corazon de Jesus");
		         Padecimientos.setSelectedItem("Consulta General");
		         SexoBox.setSelectedItem("Hombre");
		         Sedad.setValue(50);
		         medida.setText("xx");
				
			}
			
			
			
			//TODO: aqui se realiza el guardado de los datos...
		});
		btnGuardar.setBounds(522, 304, 85, 21);
		PanelIngreso.add(btnGuardar);
		
		JButton btnMostrarPlan = new JButton("Mostrar");
		btnMostrarPlan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				TXTIngre.setText("==================================="+"\n"+
				                 "Nombre del asegurado(a): "+"\t"+txtNombre.getText()+"\n"+
						         "Numero de cedula: "+"\t"+txtCedula.getText()+"\n"+
				                 "EBAIS correspondiente: "+"\t"+ComunidadEBAIS.getSelectedItem()+"\n"+
						         "Tipo de consulta: "+"\t"+Padecimientos.getSelectedItem()+"\n"+
				                 "Sexo del asegurado(a): "+"\t"+SexoBox.getSelectedItem()+"\n"+
						         "Edad: "+"\t"+"\t"+Integer.toString(Sedad.getValue())+"\n"+
						         "===================================");
				
				
			}
			
			
		});//TODO: Esta parte de codigo sirve para mostrar la plantilla de los datos que se van a guardar...
		btnMostrarPlan.setBounds(414, 304, 85, 21);
		PanelIngreso.add(btnMostrarPlan);
		
		
		medida.setBounds(105, 272, 45, 13);
		PanelIngreso.add(medida);
		
		
		PanelOtorgar.setBounds(185, 29, 278, 286);
		contentPane.add(PanelOtorgar);
		PanelOtorgar.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel(" Administracion de Datos");
		lblNewLabel_4.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel_4.setBounds(10, 10, 267, 49);
		PanelOtorgar.add(lblNewLabel_4);
		
		JLabel lblNewLabel_9 = new JLabel("Nombre de Usuario:");
		lblNewLabel_9.setBounds(78, 82, 128, 13);
		PanelOtorgar.add(lblNewLabel_9);
		
		NombreUSA = new JTextField();
		NombreUSA.setBounds(69, 105, 118, 19);
		PanelOtorgar.add(NombreUSA);
		NombreUSA.setColumns(10);
		
		JLabel lblNewLabel_9_1 = new JLabel("Contraseña:");
		lblNewLabel_9_1.setBounds(92, 134, 87, 13);
		PanelOtorgar.add(lblNewLabel_9_1);
		
		JButton btnIngresarOto = new JButton("Ingresar");
		btnIngresarOto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			
				
				
				
				if("18122022".equals(Contraseña.getText())) {
					
					PanelOtorgar.setVisible(false);
					PanelMenu.setVisible(true);
					lblNewLabel_1.setVisible(true);
					lblNewLabel_1_1.setVisible(true);
					panel.setVisible(true);
					Contraseña.setText(null);
					NomUSA = NombreUSA.getText();
					NombreUSA.setText(null);
					
					
				}
				else {
					
					
					
					JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA!!");
					Contraseña.setText(null);
					NombreUSA.setText(null);
					
					
					
					
				}
				
				
				
				
			}//TODO: esta parte de codigo es para la verificacion de los administradores...
		});//TODO: Ademas muestra la prioridad para otorgar la citas.
		btnIngresarOto.setBounds(86, 204, 85, 21);
		PanelOtorgar.add(btnIngresarOto);
		
		Contraseña = new JPasswordField();
		Contraseña.setBounds(69, 157, 118, 19);
		PanelOtorgar.add(Contraseña);
		
		
		PanelAdmin.setBounds(10, 10, 622, 353);
		contentPane.add(PanelAdmin);
		PanelAdmin.setLayout(null);
		
		JButton btnVolver72 = new JButton("Volver");
		btnVolver72.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelMenu.setVisible(true);
				PanelAdmin.setVisible(false);
				
			}
		});
		btnVolver72.setBounds(21, 311, 85, 21);
		PanelAdmin.add(btnVolver72);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(300, 10, 312, 333);
		PanelAdmin.add(scrollPane_3);
		
		JTextArea TXTadmin = new JTextArea();
		scrollPane_3.setViewportView(TXTadmin);
		
		JButton btnNewButton_1 = new JButton("Mostrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String LaDeReusEsInevitable = null;
				
				for(int i=0;i<CR7.size();i++) {
					
					String Priori="",x;
			    	
			    	Asegurado a = CR7.get(i);
			    	
			    	x =a.getEbais();
			    	
			    	System.out.println(x);
			    	
			    	if(x.equals("Emergencia")) {
			    		
			    		Priori ="Riesgo de Vida";
			    	}
			    	if(x.equals("Cuidados Prenatal")) {Priori ="Prioridad Mayor";}
			    	if(x.equals("Consulta General")) {Priori ="Riesgo Estable";}
			    	if(x.equals("Cirugia Menor")) {Priori ="No Urgente";}
			    	if(x.equals("Odontologia")) {Priori ="No Urgente";}
			    	
			    	
			    	
			    	LaDeReusEsInevitable="==================================="+"\n"+
			                 "Nombre del asegurado(a): "+"\t"+ a.getNombre()+"\n"+
					         "Numero de cedula: "+"\t"+a.getCedula()+"\n"+
			                 "EBAIS correspondiente: "+"\t"+a.getTipoConsulta()+"\n"+
					         "Tipo de consulta: "+"\t"+a.getEbais()+"\n"+
			                 "Prioridad para dar cita: "+"\t"+Priori+"\n"+
					         
					         "==================================="+"\n"+
					         "Administrador encargado: "+"\t"+NomUSA+"\n"+
			                 
					         "==================================="+"\n"+"\n";
			    	
			    	TXTadmin.append(LaDeReusEsInevitable);
			    	
				}
			}
		});//TODO: Esta parte es para  mostrar la prioridad de cita ya otorgada, por el administrador
		btnNewButton_1.setBounds(116, 311, 85, 21);
		PanelAdmin.add(btnNewButton_1);
		
		JLabel lblNewLabel_10 = new JLabel("Bienvenido(a) al sistema de citas:\r\n\r\n");
		lblNewLabel_10.setToolTipText("ji\r\nju");
		lblNewLabel_10.setBounds(21, 13, 200, 21);
		PanelAdmin.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Al pulsar \"Mostrar\" se repartiran\r\n");
		lblNewLabel_11.setBounds(21, 36, 200, 13);
		PanelAdmin.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("automaticamente la prioridad de\r\n");
		lblNewLabel_12.setBounds(21, 54, 200, 13);
		PanelAdmin.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("citas.");
		lblNewLabel_13.setBounds(21, 71, 45, 13);
		PanelAdmin.add(lblNewLabel_13);
		
		
		PanelMostrar.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		PanelMostrar.setBounds(11, 10, 618, 352);
		contentPane.add(PanelMostrar);
		PanelMostrar.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(304, 18, 297, 312);
		PanelMostrar.add(scrollPane_1);
		
		JTextArea textAreaMostrar = new JTextArea();
		scrollPane_1.setViewportView(textAreaMostrar);
		
		JLabel lblNewLabel_7 = new JLabel("Riesgo de Vida");
		lblNewLabel_7.setBounds(36, 26, 109, 13);
		PanelMostrar.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Prioridad Mayor");
		lblNewLabel_7_1.setBounds(36, 46, 109, 13);
		PanelMostrar.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Riesgo Estable");
		lblNewLabel_7_1_1.setBounds(36, 67, 109, 13);
		PanelMostrar.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_7_1_1_1 = new JLabel("No Urgente");
		lblNewLabel_7_1_1_1.setBounds(36, 88, 109, 13);
		PanelMostrar.add(lblNewLabel_7_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(0, 255, 0));
		panel_2.setBounds(146, 88, 10, 10);
		PanelMostrar.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1.setBackground(new Color(255, 255, 0));
		panel_2_1.setBounds(146, 67, 10, 10);
		PanelMostrar.add(panel_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_1.setBackground(new Color(255, 0, 0));
		panel_2_1_1.setBounds(146, 46, 10, 10);
		PanelMostrar.add(panel_2_1_1);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_1_1.setBackground(new Color(0, 0, 255));
		panel_2_1_1_1.setBounds(146, 26, 10, 10);
		PanelMostrar.add(panel_2_1_1_1);
		
		JButton btnVolverMos = new JButton("Volver");
		btnVolverMos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelMenu.setVisible(true);
				PanelMostrar.setVisible(false);
				textAreaMostrar.setText(null);
				
			}
		});
		btnVolverMos.setBounds(21, 310, 85, 21);
		PanelMostrar.add(btnVolverMos);
		
		JButton btnMosMostrar = new JButton("Mostrar");
		btnMosMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String LaDeReusEsInevitable = null;
				
				for(int i=0;i<CR7.size();i++) {
			    	
			    	Asegurado a = CR7.get(i);
			    	
			    	
			    	LaDeReusEsInevitable="==================================="+"\n"+
			                 "Nombre del asegurado(a): "+"\t"+ a.getNombre()+"\n"+
					         "Numero de cedula: "+"\t"+a.getCedula()+"\n"+
			                 "EBAIS correspondiente: "+"\t"+a.getEbais()+"\n"+
					         "Tipo de consulta: "+"\t"+a.getTipoConsulta()+"\n"+
			                 "Sexo del asegurado(a): "+"\t"+a.getSex()+"\n"+
					         "Edad: "+"\t"+"\t"+a.getEdad()+"\n"+
					         "==================================="+"\n"+"\n";
			    	
			    	textAreaMostrar.append(LaDeReusEsInevitable);
			    	
				}
				
				
			}//TODO: Esta parte de codigo es para mostrar todos los datos guardados de los asegurados
		});
		btnMosMostrar.setBounds(165, 311, 85, 21);
		PanelMostrar.add(btnMosMostrar);
		
		JLabel lblNewLabel_8 = new JLabel("Categorizacion de Riesgos");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_8.setBounds(35, 8, 172, 13);
		PanelMostrar.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Nivel de Prioridad (Mayor a menor)");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_8_1.setBounds(35, 134, 230, 13);
		PanelMostrar.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Emergencias");
		lblNewLabel_7_2.setBounds(36, 156, 109, 13);
		PanelMostrar.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("Cuidados Prenatales");
		lblNewLabel_7_2_1.setBounds(36, 174, 120, 13);
		PanelMostrar.add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_7_2_1_1 = new JLabel("");
		lblNewLabel_7_2_1_1.setBounds(36, 194, 109, 13);
		PanelMostrar.add(lblNewLabel_7_2_1_1);
		
		JLabel lblNewLabel_7_2_1_1_1 = new JLabel("Cirugia Menor");
		lblNewLabel_7_2_1_1_1.setBounds(36, 211, 109, 13);
		PanelMostrar.add(lblNewLabel_7_2_1_1_1);
		
		JLabel lblNewLabel_7_2_1_1_2 = new JLabel("Odontologia");
		lblNewLabel_7_2_1_1_2.setBounds(36, 230, 109, 13);
		PanelMostrar.add(lblNewLabel_7_2_1_1_2);
		
		JLabel lblNewLabel_7_2_1_1_3 = new JLabel("Consulta General");
		lblNewLabel_7_2_1_1_3.setBounds(36, 194, 109, 13);
		PanelMostrar.add(lblNewLabel_7_2_1_1_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.BLACK);
		panel_1_1.setBounds(290, 0, 4, 352);
		PanelMostrar.add(panel_1_1);
		
		
		PanelManual.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		PanelManual.setBounds(335, 10, 294, 353);
		contentPane.add(PanelManual);
		PanelManual.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 8, 274, 304);
		PanelManual.add(scrollPane_2);
		
		JTextArea txtrMenuIngresar = new JTextArea();
		txtrMenuIngresar.setFont(new Font("Perpetua", Font.PLAIN, 13));
		txtrMenuIngresar.setText("                  Ingresar nuevos usuarios\r\n__________________________________________________________\r\n\r\nEste boton permitiraque el usuario pueda ingresar nuevos\r\nusuarios, preguntanto los siguientes datos:\r\n\r\n1. Nombre: Nombre oficial del documento de \r\nidentificacion.\r\n\r\n2. Cedula: Numero de cedula correspondiente al\r\ndocumento.\r\n\r\n3. Comunidad: Este dato es para saber a cual EBAIS\r\nsera dirijido, de acuerdo a su comunidad.\r\n\r\n4. Tipo de consulta: Es para verificar la prioridad de \r\nla atencion.\r\n\r\n5. Sexo: Para realizar pacientes con medicos del mismo\r\nsexo, para evitar una incomodidad en procesos \r\nespecificos.\r\n\r\n6. Edad: Determinar la edad, para tener una precaucion\r\nvigente con respecto a la edad del asegurado(a).\r\n\r\n__________________________________________________________\r\n\r\n                               Registros\r\n__________________________________________________________       \r\n\r\nEste boton, ayuda a mostrar todos los datos que hasta\r\nel momento han sido guardados en el sistema. Ademas\r\nse presentan una secuencia de indicadores, para categorizar\r\npor prioridad la atencion a las y los asegurados.\r\n\r\n\r\n__________________________________________________________\r\n\r\n                      Administrar atenciones\r\n__________________________________________________________\r\n\r\nEste apartado se encuentra restringidos, por lo que \r\nsolamente los directores pueden administrar y \r\notorgar citas para los asegurados(a).\r\n\r\nPor otra parte, con este sistema se busca realizar, una\r\nmayor cobertura a las personas, categorizando la proridad \r\ncon respecto a la atencion que buscan.\r\n\r\n               ");
		txtrMenuIngresar.setEditable(false);
		scrollPane_2.setViewportView(txtrMenuIngresar);
		
		JButton btnNewButton = new JButton("Cerrar Instrucciones");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelMenu.setVisible(true);
				PanelManual.setVisible(false);
				
				
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		scrollPane_2.setColumnHeaderView(btnNewButton);
		
		
		PanelMenu.setBackground(new Color(255, 255, 255));
		PanelMenu.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		PanelMenu.setBounds(642, 0, 72, 373);
		contentPane.add(PanelMenu);
		PanelMenu.setLayout(null);
		
		JButton btnNuevoUsuario = new JButton("");
		btnNuevoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelMenu.setVisible(false);
				PanelIngreso.setVisible(true);
			}
		});
		btnNuevoUsuario.setBackground(new Color(255, 255, 255));
		btnNuevoUsuario.setIcon(new ImageIcon(Interfaz.class.getResource("/botones/icons8-añadir-usuario-masculino-64 (6).png")));
		btnNuevoUsuario.setBounds(10, 10, 55, 49);
		PanelMenu.add(btnNuevoUsuario);
		
		JButton btnMostrarTodo = new JButton("");
		btnMostrarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelMenu.setVisible(false);
				PanelMostrar.setVisible(true);
				
				
			}
		});
		btnMostrarTodo.setBackground(new Color(255, 255, 255));
		btnMostrarTodo.setIcon(new ImageIcon(Interfaz.class.getResource("/botones/icons8-pasado-50.png")));
		btnMostrarTodo.setBounds(10, 90, 55, 48);
		PanelMenu.add(btnMostrarTodo);
		
		JButton btnDarCitas = new JButton("");
		btnDarCitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelAdmin.setVisible(true);
				PanelMenu.setVisible(false);
							
			}
		});
		btnDarCitas.setBackground(new Color(255, 255, 255));
		btnDarCitas.setIcon(new ImageIcon(Interfaz.class.getResource("/botones/icons8-dar-entradas-60.png")));
		btnDarCitas.setBounds(10, 166, 52, 49);
		PanelMenu.add(btnDarCitas);
		
		JButton btnComoUtilizar = new JButton("");
		btnComoUtilizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				PanelMenu.setVisible(false);
				PanelManual.setVisible(true);
				
				
				
			}//TODO: Esta porcion de codigo, es para la muestra de la guia de uso de la aplicacion...
		});
		btnComoUtilizar.setBackground(new Color(255, 255, 255));
		btnComoUtilizar.setIcon(new ImageIcon(Interfaz.class.getResource("/botones/icons8-ayuda-50.png")));
		btnComoUtilizar.setBounds(10, 239, 52, 49);
		PanelMenu.add(btnComoUtilizar);
		
		JButton btnCerrarPrograma = new JButton("");
		btnCerrarPrograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "'El unico modo de hacer un gran\ntrabajo es amar lo que haces'\n\n- Steve Jobs -");
				System.exit(0);
				
			}
		});
		btnCerrarPrograma.setBackground(new Color(255, 255, 255));
		btnCerrarPrograma.setIcon(new ImageIcon(Interfaz.class.getResource("/botones/icons8-cerrar-ventana-50.png")));
		btnCerrarPrograma.setBounds(10, 314, 52, 49);
		PanelMenu.add(btnCerrarPrograma);
		
		
		JPanel PanelFondo = new JPanel();
		
		
		PanelFondo.setBounds(0, 0, 714, 373);
		contentPane.add(PanelFondo);
		PanelFondo.setLayout(null);
		
		
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 321, 360, 52);
		PanelFondo.add(lblNewLabel_1_1);
		
		
		panel.setBounds(10, 327, 319, 6);
		PanelFondo.add(panel);
		
		
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 43));
		lblNewLabel_1.setBounds(10, 275, 360, 52);
		PanelFondo.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 728, 410);
		lblNewLabel.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/sunset-8k-forest-4k-wallpaper-preview.jpg")));
		PanelFondo.add(lblNewLabel);
	
	}
}
