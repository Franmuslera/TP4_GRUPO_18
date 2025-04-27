package Principal;

import javax.swing.*;
import java.awt.event.*;

public class Ejercicio2 extends JFrame {

    public Ejercicio2() {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Esto hara que se cierre solo la ventana.

        setSize(500, 500);
        setLocation(350, 350);
        setTitle("Notas del Estudiante");

        getContentPane().setLayout(null);

        JLabel lblNota1 = new JLabel("Nota Parcial 1:");
        lblNota1.setBounds(42, 50, 100, 14);
        getContentPane().add(lblNota1);

        JLabel lblNota2 = new JLabel("Nota Parcial 2:");
        lblNota2.setBounds(42, 90, 100, 14);
        getContentPane().add(lblNota2);

        JLabel lblNota3 = new JLabel("Nota Parcial 3:");
        lblNota3.setBounds(42, 130, 100, 14);
        getContentPane().add(lblNota3);

        JLabel lblTP = new JLabel("Trabajo Práctico:");
        lblTP.setBounds(42, 170, 100, 14);
        getContentPane().add(lblTP);

        JLabel lblResultado = new JLabel("Notas del Estudiante:");
        lblResultado.setBounds(32, 270, 400, 100);
        getContentPane().add(lblResultado);

      
        JFormattedTextField txtNota1 = new JFormattedTextField();
        txtNota1.setBounds(170, 50, 140, 20);
        getContentPane().add(txtNota1);

        JFormattedTextField txtNota2 = new JFormattedTextField();
        txtNota2.setBounds(170, 90, 140, 20);
        getContentPane().add(txtNota2);

        JFormattedTextField txtNota3 = new JFormattedTextField();
        txtNota3.setBounds(170, 130, 140, 20);
        getContentPane().add(txtNota3);

     
        JComboBox<String> comboTP = new JComboBox<>();
        comboTP.addItem("Aprobado");
        comboTP.addItem("Desaprobado");
        comboTP.setBounds(170, 170, 140, 20);
        getContentPane().add(comboTP);

        // Btn Calcular
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 220, 100, 30);
        getContentPane().add(btnCalcular);

        // event btn Calcular
        btnCalcular.addActionListener(e -> {
            try {
                double nota1 = Double.parseDouble(txtNota1.getText());
                double nota2 = Double.parseDouble(txtNota2.getText());
                double nota3 = Double.parseDouble(txtNota3.getText());
                String tpEstado = (String) comboTP.getSelectedItem();

                double promedio = (nota1 + nota2 + nota3) / 3;
                String condicion = "";

                if ("Desaprobado".equals(tpEstado)) {
                    condicion = "Libre";
                } else if (nota1 < 6 || nota2 < 6 || nota3 < 6) {
                    condicion = "Libre";
                } else if (nota1 >= 8 && nota2 >= 8 && nota3 >= 8) {
                    condicion = "Promocionado";
                } else if (nota1 >= 6 && nota2 >= 6 && nota3 >= 6) {
                    condicion = "Regular";
                }

                lblResultado.setText("<html>Notas del Estudiante:<br>Promedio: " + String.format("%.2f", promedio) +
                        "<br>Condición: " + condicion + "</html>");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Debe ingresar números válidos en todas las notas.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
   
        // Btn Nuevo.
        JButton btnNuevo = new JButton("Nuevo");
        btnNuevo.setBounds(210,220,100,30);
        getContentPane().add(btnNuevo);
        
        //Evento para boton nuevo.
        btnNuevo.addActionListener(e ->{
        	txtNota1.setText("");
        	txtNota2.setText("");
        	txtNota3.setText("");
        	comboTP.setSelectedIndex(0);
        	lblResultado.setText("Notas del estudiante:");
        });
        
        // Boton Salir
        JButton btnSalir=new JButton("Salir");
        btnSalir.setBounds(320,220,100,30);
        getContentPane().add(btnSalir);
        
        //Evento boton salir.
        btnSalir.addActionListener(e ->{
        	dispose();
        });
        	
        	
        }
            
    }
    

