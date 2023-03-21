/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.*;
import Vista.Idiomas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author gherrada22
 * @Linkedin gherrada22
 * @Github gherrada22
 */
public class ControladorFrasesIdiomas {

    private final VistaFrasesIdiomas vistaFrasesIdiomas;
    private final VistaMenuPrincipal vistaMenuPrincipal;
    private final VistaFrances vistaFrances;
    private final VistaIngles vistaIngles;
    private final VistaItaliano vistaItaliano;
    private final VistaPortugues vistaPortugues;

    public ControladorFrasesIdiomas(VistaFrasesIdiomas vistaFrasesIdiomas, 
            VistaMenuPrincipal vistaMenuPrincipal, VistaFrances vistaFrances, 
            VistaIngles vistaIngles, VistaItaliano vistaItaliano, VistaPortugues vistaPortugues) {
        
        this.vistaFrasesIdiomas = vistaFrasesIdiomas;
        this.vistaMenuPrincipal = vistaMenuPrincipal;
        this.vistaFrances = vistaFrances;
        this.vistaIngles = vistaIngles;
        this.vistaItaliano = vistaItaliano;
        this.vistaPortugues = vistaPortugues;

        // Botón "Volver":
        this.vistaFrasesIdiomas.botonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana actual:
                vistaFrasesIdiomas.dispose();

                // Hacer visible la vista del menú principal:
                vistaMenuPrincipal.setVisible(true);
            }
        });
    }

    public void manejarBotonIdiomas() {
        vistaFrasesIdiomas.botonFrances.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hacer visible la ventana del conversor:
                vistaFrances.setVisible(true);

                // Ocultar la ventana principal:
                vistaFrasesIdiomas.setVisible(false);
            }
        });

        vistaFrasesIdiomas.botonIngles.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hacer visible la ventana del conversor:
                vistaIngles.setVisible(true);

                // Ocultar la ventana principal:
                vistaFrasesIdiomas.setVisible(false);
            }
        });

        vistaFrasesIdiomas.botonItaliano.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hacer visible la ventana del conversor:
                vistaItaliano.setVisible(true);

                // Ocultar la ventana principal:
                vistaFrasesIdiomas.setVisible(false);
            }
        });

        vistaFrasesIdiomas.botonPortugues.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hacer visible la ventana del conversor:
                vistaPortugues.setVisible(true);

                // Ocultar la ventana principal:
                vistaFrasesIdiomas.setVisible(false);
            }
        });
    }
}
