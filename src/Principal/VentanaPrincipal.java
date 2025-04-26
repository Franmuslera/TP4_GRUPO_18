package Principal;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame{
	
	
	public VentanaPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(350,350);
		setTitle("Menu Principal ");
		setLayout(null);
		
		
		
		JLabel lblGrupoN = new JLabel("GRUPO NRO: 18");
		lblGrupoN.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGrupoN.setBounds(50, 20, 250, 90);
		getContentPane().add(lblGrupoN);
		
		JButton boton1 = new JButton("Ejercicio 1");
		boton1.setBounds(150, 100, 150, 50);
		getContentPane().add(boton1);
		boton1.addActionListener(new EventoBoton1());
		
		JButton boton2 = new JButton("Ejercicio 2");
		boton2.addActionListener(new EventoBoton2());
		boton2.setBounds(150, 200, 150, 50);
		getContentPane().add(boton2);
		
		JButton boton3 = new JButton("Ejercicio 3");
		boton3.setBounds(150, 300, 150, 50);
		getContentPane().add(boton3);
		
		//EVENTOS DE LOS CONTROLES
//		btnEjercicio_1.addActionListener(new e_boton1());
//		btnEjercicio_2.addActionListener(new e_boton2());
//		btnEjercicio_3.addActionListener(new e_boton3());

		
	}
	
	class EventoBoton1  implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Ejercicio1 ejercicio1 = new Ejercicio1();
			ejercicio1.setVisible(true);

		}
		
	}
	  class EventoBoton2 implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	            Ejercicio2 ejercicio2 = new Ejercicio2();
	            ejercicio2.setVisible(true);
	        }
	    }

}
