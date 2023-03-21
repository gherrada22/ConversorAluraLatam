/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.*;
import Vista.Ayuda.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenuItem;

/**
 *
 * @author gherrada22
 * @Linkedin gherrada22
 * @Github gherrada22
 */
public class ControladorAcercaDe {
    private final VistaMenuPrincipal vistaMenuPrincipal;
    

    public ControladorAcercaDe(VistaMenuPrincipal vistaMenuPrincipal) {
        this.vistaMenuPrincipal = vistaMenuPrincipal;
        // Obtener el JMenuItem "menuAcercaDe" de la vista "vistaMenuPrincipal":
        JMenuItem vistaAcercaDe = vistaMenuPrincipal.menuAcercaDe;
        
        // Agregar el ActionListener al JMenuItem:
        vistaAcercaDe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear instancia de la ventana acerca de:
                VistaAcercaDe vistaAcercaDe = new VistaAcercaDe();
                vistaAcercaDe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vistaAcercaDe.setLocationRelativeTo(null);

                // Hacer visible la ventana acerca de:
                vistaAcercaDe.setVisible(true);
            }
        });
    }   
}

