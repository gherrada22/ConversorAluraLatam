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
public class ControladorFrances {

    private VistaFrances vistafrances;
    private VistaFrasesIdiomas vistaFrasesIdiomas;

    public ControladorFrances(VistaFrances vistafrances, VistaFrasesIdiomas vistaFrasesIdiomas) {
        this.vistafrances = vistafrances;
        this.vistaFrasesIdiomas = vistaFrasesIdiomas;

        // Botón "Volver":
        this.vistafrances.botonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana actual:
                vistafrances.dispose();

                // Hacer visible la vista del menú principal:
                vistaFrasesIdiomas.setVisible(true);
            }
        });
    }
}
