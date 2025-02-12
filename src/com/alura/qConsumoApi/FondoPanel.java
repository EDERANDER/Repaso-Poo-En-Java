package com.alura.qConsumoApi;

import javax.swing.*;
import java.awt.*;

public class FondoPanel extends JPanel {
    private Image imagen;

    public FondoPanel(String rutaImagen) {
        this.imagen = new ImageIcon(rutaImagen).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

    }
}
