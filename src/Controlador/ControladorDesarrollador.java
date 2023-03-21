/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.*;
import Vista.Ayuda.*;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFrame;
import javax.swing.JMenuItem;

/**
 *
 * @author gherrada22
 * @Linkedin gherrada22
 * @Github gherrada22
 */
public class ControladorDesarrollador {

    private VistaMenuPrincipal vistaMenuPrincipal;
    private VistaDesarrollador vistaDesarrollador;

    public ControladorDesarrollador(VistaMenuPrincipal vistaMenuPrincipal) {
        this.vistaMenuPrincipal = vistaMenuPrincipal;
        JMenuItem vistaDesarrollador = vistaMenuPrincipal.menuDesarrollador;
        vistaDesarrollador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarVistaDesarrollador();
            }
        });
    }

    public ControladorDesarrollador(VistaDesarrollador vistaDesarrollador) {
        this.vistaDesarrollador = vistaDesarrollador;
        asignarEventosABotones();
    }

    private void mostrarVistaDesarrollador() {
        VistaDesarrollador desarrollador = new VistaDesarrollador();
        desarrollador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        desarrollador.setLocationRelativeTo(null);
        desarrollador.setVisible(true);
        asignarEventosABotones(desarrollador);
    }

    private void asignarEventosABotones() {
        asignarEventosABotones(this.vistaDesarrollador);
    }

    private void asignarEventosABotones(VistaDesarrollador vista) {
        vista.botonLinkedin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirURLEnNavegador("https://www.linkedin.com/in/gherrada22");
            }
        });

        vista.botonGithub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirURLEnNavegador("https://github.com/gherrada22");
            }
        });
    }

    private void abrirURLEnNavegador(String url) {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI(url));
        } catch (IOException e) {
            // Manejar excepción
        } catch (URISyntaxException e) {
            // Manejar excepción
        }
    }
}
