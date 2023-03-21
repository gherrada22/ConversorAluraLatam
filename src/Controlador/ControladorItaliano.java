/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Idiomas.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author gherrada22
 * @Linkedin gherrada22
 * @Github gherrada22
 */
public class ControladorItaliano {

    private final VistaItaliano vistaItaliano;
    private final VistaFrasesIdiomas vistaFrasesIdiomas;

    public ControladorItaliano(VistaItaliano vistaItaliano, VistaFrasesIdiomas vistaFrasesIdiomas) {
        this.vistaItaliano = vistaItaliano;
        this.vistaFrasesIdiomas = vistaFrasesIdiomas;

        // Botón "Volver":
        this.vistaItaliano.botonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana actual (VistaItaliano):
                vistaItaliano.dispose();

                // Hacer visible la vista de frases de idiomas:
                vistaFrasesIdiomas.setVisible(true);
            }
        });
    }
}
