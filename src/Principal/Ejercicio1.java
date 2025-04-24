package Principal;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio1 extends JFrame{
	
	public Ejercicio1() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500,500);
		setLocation(350,350);
		setTitle("Contactos ");
		
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(42, 50, 53, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(42, 80, 53, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Tel�fono");
		lblTelefono.setBounds(42, 110, 53, 14);
		getContentPane().add(lblTelefono);
		
		JLabel lblFechanac = new JLabel("Fecha Nac.");
		lblFechanac.setBounds(42, 140, 53, 14);
		getContentPane().add(lblFechanac);
		
		JLabel lblDatosIngre = new JLabel("Los datos ingresados fueron: ");
		lblDatosIngre.setBounds(32, 250, 400, 100);
		getContentPane().add(lblDatosIngre);
		
		
		JFormattedTextField frmtdtxtfldNombre = new JFormattedTextField();
		frmtdtxtfldNombre.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent nom1) {
		        char nom = nom1.getKeyChar();
		        if (!Character.isLetter(nom)) {
		        	nom1.consume();  
		        }
		    }
		});
		frmtdtxtfldNombre.setBounds(169, 50, 140, 20);
		getContentPane().add(frmtdtxtfldNombre);
		
		JFormattedTextField frmtdtxtfldApellido = new JFormattedTextField();
		frmtdtxtfldApellido.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent ape1) {
		        char ape = ape1.getKeyChar();
		        if (!Character.isLetter(ape) ) {
		        	ape1.consume();  
		        } 
		    }
		});
		frmtdtxtfldApellido.setBounds(169, 80, 140, 20);
		getContentPane().add(frmtdtxtfldApellido);
		
		JFormattedTextField frmtdtxtfldTelefono = new JFormattedTextField();
		frmtdtxtfldTelefono.setBounds(169, 110, 140, 20);
		getContentPane().add(frmtdtxtfldTelefono);
		
		JFormattedTextField frmtdtxtfldFechaN = new JFormattedTextField();
		frmtdtxtfldFechaN.setBounds(169, 140, 140, 20);
		getContentPane().add(frmtdtxtfldFechaN);
		
		JButton btnMostrar = new JButton("Mostrar");
        btnMostrar.setBounds(220, 170, 89, 30);
        getContentPane().add(btnMostrar);
	
	
	
	 btnMostrar.addActionListener(e -> {
        
     
             String datos = "Nombre: " + frmtdtxtfldNombre.getText() 
                     + " | Apellido: " + frmtdtxtfldApellido.getText()
                     + " | Teléfono: " + frmtdtxtfldTelefono.getText()
                     + " | Fecha Nac.: " + frmtdtxtfldFechaN.getText();

             lblDatosIngre.setText("Los datos ingresados fueron: " + datos);

             // Limpiar campos
             frmtdtxtfldNombre.setText("");
             frmtdtxtfldApellido.setText("");
             frmtdtxtfldTelefono.setText("");
             frmtdtxtfldFechaN.setText("");
         
        
     });
	}
}
