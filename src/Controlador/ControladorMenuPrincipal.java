/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author gherrada22
 * @Linkedin gherrada22
 * @Github gherrada22
 */
public class ControladorMenuPrincipal{

    private final VistaMenuPrincipal vistaMenuPrincipal;
    private final VistaConversorMoneda vistaConversorMoneda;
    private final VistaFrasesIdiomas vistaFrasesIdiomas;
    private final VistaCalculadoraDescuento vistaCalculadoraDescuento;
    private final VistaCalculadoraBasica vistaCalculadoraBasica;

    public ControladorMenuPrincipal(VistaMenuPrincipal vistaMenuPrincipal, 
            VistaConversorMoneda vistaConversorMoneda, VistaFrasesIdiomas vistaFrasesIdiomas, 
            VistaCalculadoraDescuento vistaCalculadoraDescuento, VistaCalculadoraBasica vistaCalculadoraBasica) {
        
        this.vistaMenuPrincipal = vistaMenuPrincipal;
        this.vistaConversorMoneda = vistaConversorMoneda;
        this.vistaFrasesIdiomas = vistaFrasesIdiomas;
        this.vistaCalculadoraDescuento = vistaCalculadoraDescuento;
        this.vistaCalculadoraBasica = vistaCalculadoraBasica;
    }

    public void manejarBotonMenuPrincipal() {
        vistaMenuPrincipal.botonMoneda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hacer visible la ventana del conversor:
                vistaConversorMoneda.setVisible(true);

                // Ocultar la ventana principal:
                vistaMenuPrincipal.setVisible(false);
            }
        });

        vistaMenuPrincipal.botonFraseIdioma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hacer visible la ventana del conversor:
                vistaFrasesIdiomas.setVisible(true);

                // Ocultar la ventana principal:
                vistaMenuPrincipal.setVisible(false);
            }
        });

        vistaMenuPrincipal.botonDescuento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hacer visible la ventana del conversor:
                vistaCalculadoraDescuento.setVisible(true);

                // Ocultar la ventana principal:
                vistaMenuPrincipal.setVisible(false);
            }
        });

        vistaMenuPrincipal.botonCalculadora.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hacer visible la ventana del conversor:
                vistaCalculadoraBasica.setVisible(true);

                // Ocultar la ventana principal:
                vistaMenuPrincipal.setVisible(false);
            }
        });
    }
}
