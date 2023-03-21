/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author gherrada22
 * @Linkedin gherrada22
 * @Github gherrada22
 */
public class ControladorConversorMoneda implements ActionListener {

    private final VistaConversorMoneda vistaConversorMoneda;
    private final ConvertirMoneda convertir;
    private final VistaMenuPrincipal vistaMenuPrincipal;

    public ControladorConversorMoneda(VistaConversorMoneda vistaConversorMoneda,
            ConvertirMoneda convertir, VistaMenuPrincipal vistaMenuPrincipal) {
        
        this.vistaConversorMoneda = vistaConversorMoneda;
        this.convertir = convertir;
        this.vistaConversorMoneda.botonConvertir.addActionListener(this);
        this.vistaMenuPrincipal = vistaMenuPrincipal;

        // Botón "Volver":
        this.vistaConversorMoneda.botonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana actual:
                vistaConversorMoneda.dispose();

                // Hacer visible la vista del menú principal:
                vistaMenuPrincipal.setVisible(true);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        double ingresarValor = 0.0;
        String valorIngresadoTexto = vistaConversorMoneda.textIngresarValor.getText();

        try {
            
            ingresarValor = Double.parseDouble(valorIngresadoTexto);

            if (ingresarValor < 0) {
                throw new Exception("Debe ingresar un valor positivo");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vistaConversorMoneda, "Debe ingresar un valor numérico válido");
            return;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vistaConversorMoneda, ex.getMessage());
            return;
        }

        String moneda = (String) vistaConversorMoneda.comboMonedas.getSelectedItem();

        double resultado = 0.0;

        switch (moneda) {
            case "De Soles a Dólares" ->
                resultado = convertir.convertirSolesADolares(ingresarValor);
            case "De Soles a Euros" ->
                resultado = convertir.convertirSolesAEuros(ingresarValor);
            case "De Soles a Libras Esterlinas" ->
                resultado = convertir.convertirSolesALibrasEsterlinas(ingresarValor);
            case "De Soles a Yen Japonés" ->
                resultado = convertir.convertirSolesAYenJapones(ingresarValor);
            case "De Soles a Won Sul-Coreano" ->
                resultado = convertir.convertirSolesAWonSulCoreano(ingresarValor);
            case "De Dólares a Soles" ->
                resultado = convertir.convertirDolaresASoles(ingresarValor);
            case "De Euros a Soles" ->
                resultado = convertir.convertirEurosASoles(ingresarValor);
            case "De Libras Esterlinas a Soles" ->
                resultado = convertir.convertirLibrasEsterlinasASoles(ingresarValor);
            case "De Yen Japonés a Soles" ->
                resultado = convertir.convertirYenJaponesASoles(ingresarValor);
            case "De Won Sul-Coreano a Soles" ->
                resultado = convertir.convertirWonSulCoreanoASoles(ingresarValor);
        }

        String resultadoTexto = String.format("%.2f", resultado);
        vistaConversorMoneda.textResultado.setText(resultadoTexto);
        vistaConversorMoneda.textIngresarValor.setText("");
    }

}
