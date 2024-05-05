package Vista;

import java.awt.EventQueue;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
public class Interfaz extends JFrame implements Runnable{
	
	String hora, minutos, segundos;
	Thread hilo;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNomEmplea;
	private JPasswordField txtContraseña;
	String Nombre, Contra, h;
	JLabel ibhora = new JLabel("00:00:00");
	
	

    
public static String fecha() {
		
		Date fecha = new Date();
		SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/YYYY");
		return formatofecha.format(fecha);
		
		
	}
public void hora() {
	
	Calendar calendario = new GregorianCalendar();
	Date horaactual= new Date();
	calendario.setTime(horaactual);
	hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
    minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
    segundos =calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);

}
	

	
	public Interfaz() {
		
		JPanel PanelMenu = new JPanel();
		JPanel PanelSesion = new JPanel();
	
		PanelSesion.setVisible(false);
		PanelMenu.setVisible(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 518);
		contentPane = new JPanel();
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 854, 481);
		contentPane.add(desktopPane);
		
		
		PanelSesion.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PanelSesion.setBounds(493, 31, 268, 355);
		desktopPane.add(PanelSesion);
		PanelSesion.setLayout(null);
		
		JLabel Tnombre = new JLabel("Nombre de Empledo");
		Tnombre.setBounds(55, 138, 176, 23);
		PanelSesion.add(Tnombre);
		Tnombre.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		Tnombre.setForeground(new Color(0, 0, 0));
		
		txtNomEmplea = new JTextField();
		txtNomEmplea.setBounds(55, 171, 161, 19);
		PanelSesion.add(txtNomEmplea);
		txtNomEmplea.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setForeground(Color.BLACK);
		lblContrasea.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblContrasea.setBounds(55, 200, 176, 23);
		PanelSesion.add(lblContrasea);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(55, 233, 161, 19);
		PanelSesion.add(txtContraseña);
		
		JLabel lblInicioDeSesio = new JLabel("Inicio De Sesion");
		lblInicioDeSesio.setForeground(Color.BLACK);
		lblInicioDeSesio.setFont(new Font("Malgun Gothic", Font.BOLD, 23));
		lblInicioDeSesio.setBounds(48, 69, 183, 42);
		PanelSesion.add(lblInicioDeSesio);
		
		JButton btnIngresarSesion = new JButton("Ingresar");
		btnIngresarSesion.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				
				
				if("Progra2".equals(txtContraseña.getText())) {
					
					PanelMenu.setVisible(true);
					PanelSesion.setVisible(false);
					
					
					
				}
				else {
					
					txtContraseña.setText(null);
					txtNomEmplea.setText(null);
					JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
					
				}
				
				
				
				
				
			}
		});
		btnIngresarSesion.setBounds(96, 285, 85, 21);
		PanelSesion.add(btnIngresarSesion);
		
		JPanel PanelFondo = new JPanel();
		PanelFondo.setLayout(null);
		PanelFondo.setBackground(Color.WHITE);
		PanelFondo.setBounds(0, 0, 877, 587);
		desktopPane.add(PanelFondo);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnIniciarSesion.setVisible(false);
				JOptionPane.showMessageDialog(null,"Nombre de usuario: ingrese su nombre \nContraseña: Progra2");
				PanelSesion.setVisible(true);
			}
		});
		
		
		ibhora.setForeground(Color.WHITE);
		ibhora.setBounds(765, 439, 78, 13);
		PanelFondo.add(ibhora);
		
		JLabel LHora = new JLabel("Hora:");
		LHora.setForeground(Color.WHITE);
		LHora.setBounds(710, 439, 45, 13);
		PanelFondo.add(LHora);
		
		JLabel Lfecha = new JLabel("Fecha:");
		Lfecha.setForeground(new Color(255, 255, 255));
		Lfecha.setBounds(710, 416, 45, 13);
		PanelFondo.add(Lfecha);
		
		JLabel ibfecha = new JLabel("DD/MM/YYYY");
		ibfecha.setForeground(Color.WHITE);
		ibfecha.setBounds(765, 416, 78, 13);
		PanelFondo.add(ibfecha);
		btnIniciarSesion.setBackground(new Color(255, 255, 255));
		btnIniciarSesion.setBounds(97, 446, 119, 21);
		PanelFondo.add(btnIniciarSesion);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(23, 405, 292, 4);
		PanelFondo.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Hospital Enrrique Baltodano Briceño");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(24, 414, 354, 13);
		PanelFondo.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenidos");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 58));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(24, 347, 292, 57);
		PanelFondo.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Interfaz.class.getResource("/image/images.jpg")));
		lblNewLabel.setBounds(0, 0, 877, 484);
		PanelFondo.add(lblNewLabel);
		
		
		PanelMenu.setLayout(null);
		PanelMenu.setBounds(0, 0, 861, 21);
		desktopPane.add(PanelMenu);
		
		JButton btnCambiarDatos = new JButton("Cambiar Datos");
		btnCambiarDatos.setBackground(Color.WHITE);
		btnCambiarDatos.setBounds(425, 0, 150, 21);
		PanelMenu.add(btnCambiarDatos);
		
		JButton btnCerrarPrograma = new JButton("Cerrar Programa");
		btnCerrarPrograma.setBackground(new Color(255, 0, 0));
		btnCerrarPrograma.setBounds(713, 0, 140, 21);
		PanelMenu.add(btnCerrarPrograma);
		
		JButton btnComoUtilizar = new JButton("Como Utilizar");
		btnComoUtilizar.setBackground(Color.WHITE);
		btnComoUtilizar.setBounds(573, 0, 140, 21);
		PanelMenu.add(btnComoUtilizar);
		
		JButton btnInformacionGeneral = new JButton("Informacion General");
		btnInformacionGeneral.setBackground(Color.WHITE);
		btnInformacionGeneral.setBounds(278, 0, 150, 21);
		PanelMenu.add(btnInformacionGeneral);
		
		JButton btnMostrarRegistro = new JButton("Mostrar Registro");
		btnMostrarRegistro.setBackground(Color.WHITE);
		btnMostrarRegistro.setBounds(139, 0, 140, 21);
		PanelMenu.add(btnMostrarRegistro);
		
		JButton btnIngresarM = new JButton("Ingresar Usuario");
		btnIngresarM.setBackground(Color.WHITE);
		btnIngresarM.setBounds(0, 0, 140, 21);
		PanelMenu.add(btnIngresarM);
		
		hilo = new Thread(this);
		hilo.start();
		setVisible(true);
		this.setLocationRelativeTo(null);
		ibfecha.setText(fecha());
		
	}
	
	
		
		
		
		
		
	
	@Override
	public void run() {
Thread current = Thread.currentThread();
		
		while(current==hilo) {
	
			hora();
			ibhora.setText(hora+":"+minutos+":"+segundos);
			
		}
		
	}
}




