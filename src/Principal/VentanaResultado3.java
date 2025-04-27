package Principal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaResultado3 extends JFrame {

	private JPanel contenidoPanel;
	
	public VentanaResultado3(String resultado) {
        setTitle("Mensaje");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setBounds(100, 100, 450, 150);
        contenidoPanel = new JPanel();

        setContentPane(contenidoPanel);
        contenidoPanel.setLayout(null);

        JLabel lblResultado = new JLabel(resultado);
        lblResultado.setBounds(10, 10, 400, 30);
        contenidoPanel.add(lblResultado);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
            }
        });
        btnAceptar.setBounds(160, 60, 100, 30);
        contenidoPanel.add(btnAceptar);
    }
	
}
