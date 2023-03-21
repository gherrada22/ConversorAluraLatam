/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import javax.swing.JOptionPane;

/**
 *
 * @author gherrada22
 * @Linkedin gherrada22
 * @Github gherrada22
 */
public class ControladorCalculadoraDescuento implements ActionListener {

    private final VistaCalculadoraDescuento vistaCalculadoraDescuento;
    private final VistaMenuPrincipal vistaMenuPrincipal;
    private final CalcularDescuento calcularDescuento;

    public ControladorCalculadoraDescuento(VistaCalculadoraDescuento vistaCalculadoraDescuento,
            VistaMenuPrincipal vistaMenuPrincipal, CalcularDescuento calcularDescuento) {

        this.vistaCalculadoraDescuento = vistaCalculadoraDescuento;
        this.vistaCalculadoraDescuento.botonCalcular.addActionListener(this);
        this.vistaMenuPrincipal = vistaMenuPrincipal;
        this.calcularDescuento = calcularDescuento;

        // Botón "Volver":
        this.vistaCalculadoraDescuento.botonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana actual:
                vistaCalculadoraDescuento.dispose();

                // Hacer visible la vista del menú principal:
                vistaMenuPrincipal.setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        double ingresarPrecio = 0.0;
        double ingresarPorcentajeDescuento = 0.0;
        
        String precioIngresadoTexto = vistaCalculadoraDescuento.textPrecioOriginal.getText();
        String porcentajeDescuentoIngresadoTexto = vistaCalculadoraDescuento.textPorcentajeDeDescuento.getText();
        
        try {

            ingresarPrecio = Double.parseDouble(precioIngresadoTexto);
            ingresarPorcentajeDescuento = Double.parseDouble(porcentajeDescuentoIngresadoTexto);

            if (ingresarPrecio < 0 || ingresarPorcentajeDescuento < 0) {
                throw new Exception("Debe ingresar un valor positivo");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vistaCalculadoraDescuento, "Debe ingresar un valor numérico válido");
            return;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vistaCalculadoraDescuento, ex.getMessage());
            return;
        }

        ingresarPrecio = Double.parseDouble(precioIngresadoTexto);
        ingresarPorcentajeDescuento = Double.parseDouble(porcentajeDescuentoIngresadoTexto);

        double precioFinal = 0.0;
        double cantidadAhorrada = 0.0;

        precioFinal = calcularDescuento.calcular(ingresarPrecio, ingresarPorcentajeDescuento);
        cantidadAhorrada = calcularDescuento.cantidadAhorrada(ingresarPrecio, ingresarPorcentajeDescuento);

        String precioFinalTexto = String.format("%.2f", precioFinal);
        vistaCalculadoraDescuento.textPrecioFinal.setText(precioFinalTexto);

        String cantidadAhorradaTexto = String.format("%.2f", cantidadAhorrada);
        vistaCalculadoraDescuento.textCantidadAhorrada.setText(cantidadAhorradaTexto);

        //Limpiar campos de texto:
        vistaCalculadoraDescuento.textPrecioOriginal.setText("");
        vistaCalculadoraDescuento.textPorcentajeDeDescuento.setText("");

    }
}
