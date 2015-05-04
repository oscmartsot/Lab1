package Presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaPresentacio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPresentacio frame = new PantallaPresentacio();
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
	public PantallaPresentacio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGestioInmigrant = new JButton("Gestió");
		btnGestioInmigrant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gestioImPremut();
			}
		});
		btnGestioInmigrant.setBounds(51, 65, 117, 29);
		contentPane.add(btnGestioInmigrant);
		
		JButton btnGestioAmfitrio = new JButton("Gestió");
		btnGestioAmfitrio.setBounds(263, 65, 117, 29);
		contentPane.add(btnGestioAmfitrio);
		
		JLabel lblInmigrant = new JLabel("Inmigrant");
		lblInmigrant.setBounds(72, 37, 61, 16);
		contentPane.add(lblInmigrant);
		
		JLabel lblAmfitri = new JLabel("Amfitrió");
		lblAmfitri.setBounds(299, 37, 61, 16);
		contentPane.add(lblAmfitri);
		
		JButton btnHistorialInmigrant = new JButton("Historial");
		btnHistorialInmigrant.setBounds(51, 102, 117, 29);
		contentPane.add(btnHistorialInmigrant);
		
		JButton btnHistorialAmfitrio = new JButton("Historial");
		btnHistorialAmfitrio.setBounds(263, 102, 117, 29);
		contentPane.add(btnHistorialAmfitrio);
	}
	
	private void gestioImPremut(){
		new PantallaGestioInmigrant(this);
	}
}
