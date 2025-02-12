package com.alura.qConsumoApi;

import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JWindow {
    private static final int DURATION = 3000; // Duración de la pantalla de inicio en milisegundos
    private static final int WIDTH = 900;
    private static final int HEIGHT = 645;

    public SplashScreen() {
        ImageIcon originalIcon = new ImageIcon("src/com/alura/qConsumoApi/pexels-scottwebb-430205.jpg");

        // Escalar la imagen al tamaño deseado
        Image scaledImage = originalIcon.getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JLabel label = new JLabel(scaledIcon);
        getContentPane().add(label, BorderLayout.CENTER);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
    }

    public void showSplash() {
        setVisible(true);
        try {
            Thread.sleep(DURATION); // Mostrar la pantalla de inicio durante la duración especificada
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setVisible(false);
    }
}
