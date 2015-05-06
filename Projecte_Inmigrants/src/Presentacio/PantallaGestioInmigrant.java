package Presentacio;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PantallaGestioInmigrant extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public PantallaGestioInmigrant(PantallaPresentacio pantalla) {
	
		pantalla.dispose();
		this.setVisible(true);
		setTitle("Gestió Inmigrant");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(155, 86, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassaport = new JLabel("Passaport");
		lblPassaport.setBounds(82, 92, 61, 16);
		contentPane.add(lblPassaport);
		
		JButton btnEndavant = new JButton("Endavant");
		btnEndavant.setBounds(115, 140, 117, 29);
		contentPane.add(btnEndavant);
		
		JLabel lblIntrodueixUnPasaport = new JLabel("Introdueix un pasaport vàlid");
		lblIntrodueixUnPasaport.setBounds(82, 34, 207, 16);
		contentPane.add(lblIntrodueixUnPasaport);
	}
	
	private void altaImigrant(){
		
	}

}
