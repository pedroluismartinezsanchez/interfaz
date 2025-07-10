/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseseis;

/**
 *
 * @author PEDRO LUIS MARTINEZ
 */
import javax.swing.*;
import java.awt.*;

public class IngresoUsuario extends JFrame {

    public IngresoUsuario() {
        setTitle("Ingresar  Usuario");
        setSize(800, 450);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Solo cierra esta ventana
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 15));
        panel.setBackground(new Color(32, 0, 42));

        
        JLabel lblNombre = new JLabel("Usuario: ");
        lblNombre.setForeground(Color.WHITE); // Color blanco
        lblNombre.setFont(new Font("Segoe UI", Font.BOLD, 16)); // Estilo elegante
        panel.add(lblNombre);
        
        JTextField txtNombre = new JTextField();
        panel.add(txtNombre);
        
        
        JLabel lblContrasena = new JLabel("Contraseña: ");
        lblContrasena.setForeground(Color.WHITE); // Color blanco
        lblContrasena.setFont(new Font("Segoe UI", Font.BOLD, 16)); // Estilo elegante
       
        panel.add(lblContrasena);
       
        JPasswordField txtPassword = new JPasswordField();
        panel.add(txtPassword);
       
        
        JButton btnIngresar = new JButton("Ingresar");
        btnIngresar.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btnIngresar.setBounds(500, 420, 200, 50);
        btnIngresar.setBackground(new Color(204, 0, 204)); 
        panel.add(btnIngresar);
        
       
        
        btnIngresar.addActionListener(e -> {
        VentanaUsuario ventanaUsuario = new VentanaUsuario();
        ventanaUsuario.setVisible(true);
        dispose(); 
        });
        add(panel);
    }
}

