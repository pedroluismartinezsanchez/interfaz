/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseseis;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author PEDRO LUIS MARTINEZ
 */
public class RegistroFormulario extends JFrame{
    
    
   public  RegistroFormulario(){
   
        setTitle("Registro de Nuevo Usuario");
        setSize(800, 450);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Solo cierra esta ventana
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10,100));
        panel.setBackground(new Color(48, 25, 52));

        
        JLabel lblNombre = new JLabel("Nombre Completo: ");
        lblNombre.setForeground(Color.WHITE); // Color blanco
        lblNombre.setFont(new Font("Segoe UI", Font.BOLD, 16)); // Estilo elegante
        panel.add(lblNombre);
        
        JTextField txtNombre = new JTextField();
        panel.add(txtNombre);
        
        JLabel lblEmail = new JLabel("Correo Electronico: ");
        lblEmail.setForeground(Color.WHITE); // Color blanco
        lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 16)); // Estilo elegante
        panel.add(lblEmail);
        
        JTextField txtEmail = new JTextField();
        panel.add(txtEmail);
        
        
        JLabel lblContrasena = new JLabel("Contraseña: ");
        lblContrasena.setForeground(Color.WHITE); // Color blanco
        lblContrasena.setFont(new Font("Segoe UI", Font.BOLD, 16)); // Estilo elegante
       
        panel.add(lblContrasena);
       
        JPasswordField txtPassword = new JPasswordField();
        panel.add(txtPassword);
        
        JButton btnIngresar = new JButton("Ingresar");
        btnIngresar.setFont(new Font("Segoe UI", Font.BOLD, 18));
        
        btnIngresar.setBackground(new Color(204, 0, 204)); 
        
        panel.add(btnIngresar);

        btnIngresar.addActionListener(e -> {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
        dispose(); 
        });
        add(panel);
    }
   
   
}
