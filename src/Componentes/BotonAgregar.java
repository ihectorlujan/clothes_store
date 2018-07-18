/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author iHector Lujan
 */
public class BotonAgregar extends JButton {
    
    public BotonAgregar(){
        setText("Agregar");
        setBackground(new Color(0,204,51));
        
        // Eventos del boton.        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(new Color(0,204,102));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(new Color(0,204,102));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(new Color(0,204,51));
            }
        });
    }    
    
    public static void main(String[] args) {
        
    }
}
