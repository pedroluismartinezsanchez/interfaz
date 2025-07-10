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
public class VentanaUsuario extends JFrame{
     
    
    public VentanaUsuario() {
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
        JLabel logo = new JLabel("Bienvenido");
        logo.setForeground(Color.WHITE);
        logo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        logo.setBounds(40, 20, 300, 60);
        mainPanel.add(logo);

        // Título Vetery Apps
        JLabel titulo1 = new JLabel("Vetery");
        titulo1.setForeground(Color.WHITE);
        titulo1.setFont(new Font("Segoe UI", Font.PLAIN, 48));
        titulo1.setBounds(500, 120, 200, 60);
        mainPanel.add(titulo1);

        JLabel titulo2 = new JLabel("Apps");
        titulo2.setForeground(Color.MAGENTA);
        titulo2.setFont(new Font("Segoe UI Black", Font.PLAIN, 48));
        titulo2.setBounds(500, 170, 200, 60);
        mainPanel.add(titulo2);

        // Botón Ingresar
        JButton btnMascotas = new JButton("Mascotas");
        btnMascotas.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btnMascotas.setForeground(Color.WHITE);
        btnMascotas.setBounds(60, 120, 200, 60);
        btnMascotas.setContentAreaFilled(true);
        btnMascotas.setFocusPainted(false);
        btnMascotas.setBorderPainted(false);
        btnMascotas.setOpaque(true);
        btnMascotas.setBackground(new Color(204, 0, 204)); 
        mainPanel.add(btnMascotas);
        
        JButton btn1 = new JButton("Salir");
        btn1.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btn1.setForeground(Color.WHITE);
        btn1.setBounds(60, 190, 200, 60);
        btn1.setContentAreaFilled(true);
        btn1.setFocusPainted(false);
        btn1.setBorderPainted(false);
        btn1.setOpaque(true);
        btn1.setBackground(new Color(204, 0, 204)); 
        mainPanel.add(btn1);
        
        btn1.addActionListener(e -> {
        VentanaPrincipal inicio = new VentanaPrincipal();
        inicio.setVisible(true);
        dispose(); // Esta línea cierra la ventana actual
        });

        
        
        add(mainPanel);
        setVisible(true);
    }
}
