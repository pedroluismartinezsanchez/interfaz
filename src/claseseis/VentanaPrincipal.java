/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseseis;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author PEDRO LUIS MARTINEZ
 */
public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        setTitle("Vetery Apps");
        setSize(800, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal con fondo personalizado
        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Fondo degradado o imagen
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(0, 0, new Color(32, 0, 42), getWidth(), getHeight(), new Color(102, 0, 102));
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        mainPanel.setLayout(null);

        // Logo o nombre de la empresa
        JLabel logo = new JLabel("PeterCompañía");
        logo.setForeground(Color.WHITE);
        logo.setFont(new Font("Segoe UI", Font.BOLD, 12));
        logo.setBounds(20, 10, 200, 30);
        mainPanel.add(logo);

        // Título Vetery Apps
        JLabel titulo1 = new JLabel("Vetery");
        titulo1.setForeground(Color.WHITE);
        titulo1.setFont(new Font("Segoe UI", Font.PLAIN, 48));
        titulo1.setBounds(60, 120, 200, 60);
        mainPanel.add(titulo1);

        JLabel titulo2 = new JLabel("Apps");
        titulo2.setForeground(Color.MAGENTA);
        titulo2.setFont(new Font("Segoe UI Black", Font.PLAIN, 48));
        titulo2.setBounds(200, 120, 200, 60);
        mainPanel.add(titulo2);

        // Botón Ingresar
        JButton btnIngresar = new JButton("INGRESAR");
        btnIngresar.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btnIngresar.setForeground(Color.WHITE);
        btnIngresar.setBounds(500, 120, 200, 50);
        btnIngresar.setContentAreaFilled(true);
        btnIngresar.setFocusPainted(false);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setOpaque(true);
        btnIngresar.setBackground(new Color(204, 0, 204)); 
        mainPanel.add(btnIngresar);
        
        
        btnIngresar.addActionListener(e -> {
        IngresoUsuario registroUsuario = new IngresoUsuario();
        registroUsuario.setVisible(true);
        dispose(); // Esta línea cierra la ventana actual
        });

        // Botón Registrarme
        JButton btnRegistro = new JButton("REGISTRARME");
        btnRegistro.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        btnRegistro.setForeground(Color.WHITE);
        btnRegistro.setBackground(new Color( 45,34,23));
        btnRegistro.setBounds(500, 190, 200, 40);
        btnRegistro.setContentAreaFilled(true);
        btnRegistro.setFocusPainted(true);
        btnRegistro.setBorderPainted(true);
        mainPanel.add(btnRegistro);

        btnRegistro.addActionListener(e -> {
        RegistroFormulario registroFormulario = new RegistroFormulario();
        registroFormulario.setVisible(true);
        dispose(); // Esta línea cierra la ventana actual
        });
        
        add(mainPanel);
        setVisible(true);
    }

}
