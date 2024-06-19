package Vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import Controlador.*;
import Modelo.Asegurado;
import java.sql.Statement;


import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends JFrame {


// URL de conexión a la base de datos
String url = "jdbc:mysql://localhost:3306/basededatos";
String user = "root";
String password = "M@nuelest123";

PreparedStatement pstmtUpdate = null;
PreparedStatement pstmtSelect = null;
static PreparedStatement pstmt = null;
static Connection conn = null;
static Statement stmt = null;
static ResultSet rs = null;


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
    private JTextField txtbuscarcedula;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    
    
	
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
		
JComboBox Padecimientos_1 = new JComboBox();
		JComboBox SexoBox_1 = new JComboBox();

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
		JPanel PanelOtorgar = new JPanel();
		PanelOtorgar.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		PanelOtorgar.setVisible(true);
		
		
		JLabel medida = new JLabel("xx");
		JPanel PanelIngreso = new JPanel();
		PanelIngreso.setVisible(false);
		JPanel PanelAdmin = new JPanel();
		PanelAdmin.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		PanelAdmin.setVisible(false);
		JPanel PanelMostrar = new JPanel();
		PanelMostrar.setVisible(false);
		
		
		PanelMostrar.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		PanelMostrar.setBounds(11, 10, 618, 352);
		contentPane.add(PanelMostrar);
		PanelMostrar.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(304, 18, 297, 312);
		PanelMostrar.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
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
				textArea.setText(null);
				
			}
		});
		btnVolverMos.setBounds(21, 310, 85, 21);
		PanelMostrar.add(btnVolverMos);
		
		JButton btnMosMostrar = new JButton("Mostrar");
		btnMosMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
 
 

 try {
	 // Conectarse a la base de datos
	 conn = DriverManager.getConnection(url, user, password);
	 stmt = conn.createStatement();
	 String query = "SELECT Nombre, Cedula, Comunidad, Consulta, Sexo, Edad FROM asegurado";
	 rs = stmt.executeQuery(query);

	 // Construir el texto a mostrar
	 StringBuilder sb = new StringBuilder();
	 while (rs.next()) {
		 String nombre = rs.getString("Nombre");
		 String cedula = rs.getString("Cedula");
		 String comunidad = rs.getString("Comunidad");
		 String consulta = rs.getString("Consulta");
		 String sexo = rs.getString("Sexo");
		 int edad = rs.getInt("Edad");

		 sb.append("Nombre: \t").append(nombre)
		   .append(", \nCedula: \t").append(cedula)
		   .append(", \nComunidad: \t").append(comunidad)
		   .append(", \nConsulta: \t").append(consulta)
		   .append(", \nSexo: \t").append(sexo)
		   .append(", \nEdad: \t").append(edad).append("\n______________________________________\n");
	 }

	 // Mostrar el texto en el JTextArea
	 textArea.setText(sb.toString());

	 

 } catch (Exception re) {
	 re.printStackTrace();
 } finally {
	 // Cerrar recursos
	 try {
		 if (rs != null) rs.close();
		 if (stmt != null) stmt.close();
		 if (conn != null) conn.close();
	 } catch (Exception re) {
		 re.printStackTrace();
	 }
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
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

textArea.setText(null);
				conn = null;
				stmt = null;
				rs = null;


				try {
					// Conectarse a la base de datos
					conn = DriverManager.getConnection(url, user, password);
		
					
		
					// Acción del botón Buscar
					
							String cedula = txtbuscarcedula.getText();
							if (cedula.isEmpty()) {
								textArea.setText("Por favor, ingrese un número de cédula.");
								return;
							}
		
							try {
								// Buscar el asegurado con la cédula especificada
								String searchQuery = "SELECT Nombre, Cedula, Comunidad, Consulta, Sexo, Edad FROM asegurado WHERE Cedula = ?";
								pstmt = conn.prepareStatement(searchQuery);
								pstmt.setString(1, cedula);
								rs = pstmt.executeQuery();
		
								// Construir el texto a mostrar
								StringBuilder sb = new StringBuilder();
								if (rs.next()) {
									String nombre = rs.getString("Nombre");
									String cedulaResult = rs.getString("Cedula");
									String comunidad = rs.getString("Comunidad");
									String consulta = rs.getString("Consulta");
									String sexo = rs.getString("Sexo");
									int edad = rs.getInt("Edad");
		
									sb.append("\nNombre: \t").append(nombre)
									  .append(",\nCedula: \t").append(cedulaResult)
									  .append(",\n Comunidad:\t ").append(comunidad)
									  .append(", \nConsulta: \t").append(consulta)
									  .append(", \nSexo: \t").append(sexo)
									  .append(", \nEdad: \t").append(edad).append("\n");
								} else {
									sb.append("No se encontró un asegurado con la cédula: ").append(cedula);
								}
		
								textArea.setText(sb.toString());
							} catch (Exception ex) {
								ex.printStackTrace();
							} finally {
								// Cerrar ResultSet y PreparedStatement
								try {
									if (rs != null) rs.close();
									if (pstmt != null) pstmt.close();
								} catch (Exception ex) {
									ex.printStackTrace();
								}
							}
						
					
		
				} catch (Exception ye) {
					ye.printStackTrace();
				} finally {
					// Cerrar conexión
					try {
						if (conn != null) conn.close();
					} catch (Exception ye) {
						ye.printStackTrace();
					}
				}












			}
		});
		btnBuscar.setToolTipText("Buscar un asegurado en especifico");
		btnBuscar.setBounds(165, 280, 85, 21);
		PanelMostrar.add(btnBuscar);
		
		JComboBox ComunidadEBAIS_1 = new JComboBox();
		JSlider Sedad_1 = new JSlider();

		txtbuscarcedula = new JTextField();
		txtbuscarcedula.setBounds(165, 251, 96, 19);
		PanelMostrar.add(txtbuscarcedula);
		txtbuscarcedula.setColumns(10);
		
		JLabel lblNewLabel_7_2_1_1_2_1 = new JLabel("Cedula  a buscar:");
		lblNewLabel_7_2_1_1_2_1.setBounds(165, 230, 109, 13);
		PanelMostrar.add(lblNewLabel_7_2_1_1_2_1);
		
		
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
		
		JButton btnNewButton_1_1 = new JButton("Eliminar");

		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 conn = null;
				 stmt = null;
				 rs = null;


				try {
					// Conectarse a la base de datos
					conn = DriverManager.getConnection(url, user, password);
					stmt = conn.createStatement();
					String query = "SELECT Nombre, Cedula, Comunidad, Consulta, Sexo, Edad FROM asegurado";
					rs = stmt.executeQuery(query);
		
					// Construir el texto a mostrar
					StringBuilder sb = new StringBuilder();
					while (rs.next()) {
						String nombre = rs.getString("Nombre");
						String cedula = rs.getString("Cedula");
						String comunidad = rs.getString("Comunidad");
						String consulta = rs.getString("Consulta");
						String sexo = rs.getString("Sexo");
						int edad = rs.getInt("Edad");
		
						sb.append("  Nombre: ").append(nombre)
						  .append(", Cedula: ").append(cedula)
						  .append(", Comunidad: ").append(comunidad)
						  .append(", Consulta: ").append(consulta)
						  .append(", Sexo: ").append(sexo)
						  .append(", Edad: ").append(edad).append("\n");
					}
		
					
		
		
					// Acción del botón Eliminar

					String cedula = textField.getText();
							if (cedula.isEmpty()) {
								return;
							}
		
							try {
								// Eliminar el asegurado con la cédula especificada
								String deleteQuery = "DELETE FROM asegurado WHERE Cedula = ?";
								try (PreparedStatement pstmt = conn.prepareStatement(deleteQuery)) {
									pstmt.setString(1, cedula);
									pstmt.executeUpdate();
									JOptionPane.showMessageDialog(null,"Asegurado con cédula " + cedula + ", eliminado!!");
								}
		
								// Refrescar el JTextArea con los datos actualizados
								rs = stmt.executeQuery(query);
								sb.setLength(0); // Limpiar el StringBuilder
								while (rs.next()) {
									String nombre = rs.getString("Nombre");
									String cedulaResult = rs.getString("Cedula");
									String comunidad = rs.getString("Comunidad");
									String consulta = rs.getString("Consulta");
									String sexo = rs.getString("Sexo");
									int edad = rs.getInt("Edad");
		
									sb.append("Nombre: ").append(nombre)
									  .append(", Cedula: ").append(cedulaResult)
									  .append(", Comunidad: ").append(comunidad)
									  .append(", Consulta: ").append(consulta)
									  .append(", Sexo: ").append(sexo)
									  .append(", Edad: ").append(edad).append("\n");
								}
								
							} catch (Exception ex) {
								ex.printStackTrace();
							}
		
				} catch (Exception te) {
					te.printStackTrace();
				} finally {
					// Cerrar recursos
					try {
						if (rs != null) rs.close();
						if (stmt != null) stmt.close();
						if (conn != null) conn.close();
					} catch (Exception te) {
						te.printStackTrace();
					}
				}




textField.setText(null);






			}
		});

		btnNewButton_1_1.setBounds(116, 311, 105, 21);
		PanelAdmin.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Buscar");
		btnNewButton_1_2.setBounds(116, 280, 105, 21);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 conn = null;
				pstmtSelect = null;
				pstmtUpdate = null;
				rs = null;
			
			
			
				String cedulaBuscar = textField.getText();

                try {
                    // Conectarse a la base de datos
                    conn = DriverManager.getConnection(url, user, password);

                    // Buscar el asegurado con la cédula ingresada
                    String selectQuery = "SELECT Nombre, Cedula, Comunidad, Consulta, Sexo, Edad FROM asegurado WHERE Cedula = ?";
                    pstmtSelect = conn.prepareStatement(selectQuery);
                    pstmtSelect.setString(1, cedulaBuscar);
                    rs = pstmtSelect.executeQuery();

                    // Mostrar los datos del asegurado encontrado en los campos de texto
                    if (rs.next()) {
                        String nombre = rs.getString("Nombre");
                        String cedula = rs.getString("Cedula");
                        String comunidad = rs.getString("Comunidad");
                        String consulta = rs.getString("Consulta");
                        String sexo = rs.getString("Sexo");
                        String edad = rs.getString("Edad");

                       

                        textField_1.setText(nombre);
                        textField_2.setText(cedula);
                        ComunidadEBAIS_1.setSelectedItem(comunidad);
                        Padecimientos_1.setSelectedItem(consulta);
                        SexoBox_1.setSelectedItem(sexo);
                        Sedad_1.setValue(Integer.parseInt(edad));
                    } else {
                        JOptionPane.showMessageDialog(null,"No se encontró ningún asegurado con la cédula: " + cedulaBuscar);
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    // Cerrar recursos
                    try {
                        if (rs != null) rs.close();
                        if (pstmtSelect != null) pstmtSelect.close();
                        if (conn != null) conn.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
			
			
			
			
			
			
			
			
			
			
			}
		});

/* */







		PanelAdmin.add(btnNewButton_1_2);
		
		textField = new JTextField();
		textField.setBounds(116, 251, 105, 19);
		PanelAdmin.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombre del asegurado:");
		lblNewLabel_2_2.setBounds(325, 10, 141, 13);
		PanelAdmin.add(lblNewLabel_2_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(325, 33, 129, 19);
		PanelAdmin.add(textField_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Numero de cedula:");
		lblNewLabel_2_1_1.setBounds(325, 62, 141, 13);
		PanelAdmin.add(lblNewLabel_2_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(325, 85, 129, 19);
		PanelAdmin.add(textField_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Comunidad de EBAIS:");
		lblNewLabel_3_1.setBounds(325, 114, 141, 13);
		PanelAdmin.add(lblNewLabel_3_1);
		
		
		ComunidadEBAIS_1.setModel(new DefaultComboBoxModel(new String[] {"Corazon de Jesus", "Nazareth", "Moracia", "La Victoria", "Guadalupe", "Barrio la Cruz", "Felipe Perez"}));
		
		ComunidadEBAIS_1.setBounds(325, 137, 129, 21);
		PanelAdmin.add(ComunidadEBAIS_1);
		
		Sedad_1.setSnapToTicks(true);
		Sedad_1.setPaintTicks(true);
		Sedad_1.setPaintLabels(true);
		Sedad_1.setMinorTickSpacing(10);
		Sedad_1.setMajorTickSpacing(10);
		Sedad_1.setBounds(325, 295, 211, 37);
		PanelAdmin.add(Sedad_1);
		
		JLabel medidor_1 = new JLabel("Indique la edad:");
		medidor_1.setBounds(325, 272, 141, 13);
		PanelAdmin.add(medidor_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Consulta:");
		lblNewLabel_5_1.setBounds(325, 168, 129, 13);
		PanelAdmin.add(lblNewLabel_5_1);
		
		
		Padecimientos_1.setModel(new DefaultComboBoxModel(new String[] {"Consulta General", "Odontologia", "Cirugia Menor", "Cuidados Prenatal", "Emergencia"}));
		
		Padecimientos_1.setBounds(325, 191, 129, 21);
		PanelAdmin.add(Padecimientos_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Sexo:");
		lblNewLabel_6_1.setBounds(325, 220, 80, 13);
		PanelAdmin.add(lblNewLabel_6_1);
		
		SexoBox_1.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer"}));
	
		SexoBox_1.setBounds(325, 241, 129, 21);
		PanelAdmin.add(SexoBox_1);
		
		JLabel lblNewLabel_10 = new JLabel("Numero de cedula a trabajar:");
		lblNewLabel_10.setBounds(102, 228, 165, 13);
		PanelAdmin.add(lblNewLabel_10);
		
		JButton btnNewButton_1_2_1 = new JButton("Actualizar");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				conn = null;
				pstmt = null;

				String nombre = textField_1.getText();
                String cedulaEdit = textField_2.getText();
                String comunidad = (String) ComunidadEBAIS_1.getSelectedItem();
                String consulta = (String) Padecimientos_1.getSelectedItem();
                String sexo =   (String) SexoBox_1.getSelectedItem();
                String edad = Integer.toString(Sedad_1.getValue());

                if (nombre.isEmpty() || cedulaEdit.isEmpty() || comunidad.isEmpty() || consulta.isEmpty() || sexo.isEmpty() || edad.isEmpty()) {
                    System.out.println("Por favor, complete todos los campos.");
                    return;
                }

                try {
                    // Conectarse a la base de datos
                    conn = DriverManager.getConnection(url, user, password);

                    // Actualizar el asegurado
                    String updateQuery = "UPDATE asegurado SET Nombre = ?, Cedula = ?, Comunidad = ?, Consulta = ?, Sexo = ?, Edad = ? WHERE Cedula = ?";
                    pstmtUpdate = conn.prepareStatement(updateQuery);
                    pstmtUpdate.setString(1, nombre);
                    pstmtUpdate.setString(2, cedulaEdit);
                    pstmtUpdate.setString(3, comunidad);
                    pstmtUpdate.setString(4, consulta);
                    pstmtUpdate.setString(5, sexo);
                    pstmtUpdate.setString(6, edad);
                    pstmtUpdate.setString(7, cedulaEdit); // Usamos la cédula original para la cláusula WHERE
                    pstmtUpdate.executeUpdate();

                    System.out.println("Asegurado actualizado con éxito.");
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    // Cerrar recursos
                    try {
                        if (pstmtUpdate != null) pstmtUpdate.close();
                        if (conn != null) conn.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }










			}
		});
		btnNewButton_1_2_1.setBounds(507, 241, 105, 21);
		PanelAdmin.add(btnNewButton_1_2_1);
		
		
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
				
				conn = null;
				pstmt = null;

				String nom, ced, ed, comu, tconsul, sex;
				
				nom = txtNombre.getText();
				ced = txtCedula.getText();
				ed = Integer.toString(Sedad.getValue());
				comu = (String) ComunidadEBAIS.getSelectedItem();
				tconsul = (String) Padecimientos.getSelectedItem();
				sex = (String) SexoBox.getSelectedItem();
				
				
				
				String nombre = nom;
                String cedula = ced;
                String comunidad = comu;
                String consulta = tconsul;
                String sexo = sex;
                String edad = ed;

                if (nombre.isEmpty() || cedula.isEmpty() || comunidad.isEmpty() || consulta.isEmpty() || sexo.isEmpty() || edad.isEmpty()) {
                    System.out.println("Por favor, complete todos los campos.");
                    return;
                }

                try {
                    // Conectarse a la base de datos
                    conn = DriverManager.getConnection(url, user, password);

                    // Insertar el asegurado
                    String insertQuery = "INSERT INTO asegurado (Nombre, Cedula, Comunidad, Consulta, Sexo, Edad) VALUES (?, ?, ?, ?, ?, ?)";
                    pstmt = conn.prepareStatement(insertQuery);
                    pstmt.setString(1, nombre);
                    pstmt.setString(2, cedula);
                    pstmt.setString(3, comunidad);
                    pstmt.setString(4, consulta);
                    pstmt.setString(5, sexo);
                    pstmt.setString(6, edad);
                    pstmt.executeUpdate();

                    System.out.println("Asegurado insertado con éxito.");
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    // Cerrar recursos
                    try {
                        if (pstmt != null) pstmt.close();
                        if (conn != null) conn.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }



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
				
				
			
				

// Declare the JDBC objects.
conn = null;
rs = null;
char[] contra = Contraseña.getPassword();
String clave = new String(contra);
String login = NombreUSA.getText();
pstmt = null;




String SQL = "SELECT * FROM administrador WHERE Login = ? AND Contraseña = ?";

try {
	
	Class.forName("com.mysql.jdbc.Driver");

	conn = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/basededatos?verifyServerCertificate=false&useSSL=true", "root",
		"M@nuelest123");
		

		pstmt  = conn.prepareStatement(SQL);
		pstmt .setString(1, login);
		pstmt .setString(2, clave);
		rs = pstmt .executeQuery();

			
		if (rs.next()) {
			
			PanelOtorgar.setVisible(false);
			PanelMenu.setVisible(true);
			lblNewLabel_1.setVisible(true);
			lblNewLabel_1_1.setVisible(true);
			panel.setVisible(true);
			Contraseña.setText(null);
			NomUSA = NombreUSA.getText();
			NombreUSA.setText(null);
			JOptionPane.showMessageDialog(null, "   Bienvenido  Admin");

		} else {

			JOptionPane.showMessageDialog(null, "USUARIO Y CONTRASEÑA INCORRECTAS!!");
			Contraseña.setText(null);
			NombreUSA.setText(null);

		}	
} catch (ClassNotFoundException e1) {

	e1.printStackTrace();
} catch (SQLException e1) {
	
	e1.printStackTrace();
}
















				
				
			/*	if("18122022".equals(Contraseña.getText())) {
					
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
					
					
					
					
				}*/
				
				
				
				
			}//TODO: esta parte de codigo es para la verificacion de los administradores...
		});//TODO: Ademas muestra la prioridad para otorgar la citas.
		btnIngresarOto.setBounds(86, 204, 85, 21);
		PanelOtorgar.add(btnIngresarOto);
		
		Contraseña = new JPasswordField();
		Contraseña.setBounds(69, 157, 118, 19);
		PanelOtorgar.add(Contraseña);
		
		
		PanelManual.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		PanelManual.setBounds(335, 10, 294, 353);
		contentPane.add(PanelManual);
		PanelManual.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 8, 274, 304);
		PanelManual.add(scrollPane_2);
		
		JTextArea txtrMenuIngresar = new JTextArea();
		txtrMenuIngresar.setFont(new Font("Perpetua", Font.PLAIN, 13));
		txtrMenuIngresar.setText("                  Ingresar nuevos usuarios\r\n__________________________________________________________\r\n\r\nEste boton permitiraque el usuario pueda ingresar nuevos\r\nusuarios, preguntanto los siguientes datos:\r\n\r\n1. Nombre: Nombre oficial del documento de \r\nidentificacion.\r\n\r\n2. Cedula: Numero de cedula correspondiente al\r\ndocumento.\r\n\r\n3. Comunidad: Este dato es para saber a cual EBAIS\r\nsera dirijido, de acuerdo a su comunidad.\r\n\r\n4. Tipo de consulta: Es para verificar la prioridad de \r\nla atencion.\r\n\r\n5. Sexo: Para realizar pacientes con medicos del mismo\r\nsexo, para evitar una incomodidad en procesos \r\nespecificos.\r\n\r\n6. Edad: Determinar la edad, para tener una precaucion\r\nvigente con respecto a la edad del asegurado(a).\r\n\r\n__________________________________________________________\r\n\r\n                               Registros\r\n__________________________________________________________       \r\n\r\nEste boton, ayuda a mostrar todos los datos que hasta\r\nel momento han sido guardados en el sistema. Ademas\r\nse presentan una secuencia de indicadores, para categorizar\r\npor prioridad la atencion a las y los asegurados.\r\n\r\n\r\n__________________________________________________________\r\n\r\n                      Administrar atenciones\r\n__________________________________________________________\r\n\r\nEste apartado se encuentra restringidos, por lo que \r\nsolamente los directores pueden administrar y \r\notorgar citas para los asegurados(a).\r\n\r\nPor otra parte, con este sistema se busca realizar, una\r\nmayor cobertura a las personas, categorizando la proridad \r\ncon respecto a la atencion que buscan.\r\n\r\n__________________________________________________________\n\nCreditos:\n\nEl programa de edición de información de asegurados en una \nbase de datos MySQL ha sido meticulosamente desarrollado por IT Innovators Groups, \nuna compañía dedicada a la innovación tecnológica y soluciones \ninformáticas avanzadas. Este software, concebido para optimizar \nla gestión de datos de asegurados, fue creado con la visión \ny liderazgo de Brayan Alberto Reyes Mendoza y Manuel Esteban Guzmán\n Gómez, quienes aportaron su expertise en el diseño de interfaces gráficas\n intuitivas y eficientes, así como en la implementación de lógicas \nrobustas de actualización y consulta de datos.\n" + //
						"\n" + //
						"Utilizando Java y JDBC, IT Innovators Groups ha integrado \nfuncionalidades avanzadas que permiten a los usuarios buscar información \ndetallada por medio de la cédula de identidad del asegurado, \ny actualizar campos como nombre, comunidad, consulta médica, sexo \ny edad de manera precisa y segura. Este enfoque técnico y orientado \na la usabilidad refleja el compromiso de la compañía por ofrecer \nsoluciones que no solo cumplan con los estándares más exigentes de la \nindustria, sino que también mejoren la eficiencia operativa y la \nexperiencia del usuario.");
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