/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author gherrada22
 * @Linkedin gherrada22
 * @Github gherrada22
 */
public class ControladorCalculadoraBasica implements ActionListener {

    private final VistaCalculadoraBasica vistaCalculadoraBasica;
    private final VistaMenuPrincipal vistaMenuPrincipal;
    private final CalculadoraBasica calculadoraBasica;

    private double operando;
    private char operacion;

    public ControladorCalculadoraBasica(VistaCalculadoraBasica vistaCalculadoraBasica,
            VistaMenuPrincipal vistaMenuPrincipal, CalculadoraBasica calculadoraBasica) {

        this.vistaCalculadoraBasica = vistaCalculadoraBasica;
        this.vistaMenuPrincipal = vistaMenuPrincipal;
        this.calculadoraBasica = calculadoraBasica;

        this.vistaCalculadoraBasica.botonCero.addActionListener(this);
        this.vistaCalculadoraBasica.botonDosCeros.addActionListener(this);
        this.vistaCalculadoraBasica.botonPunto.addActionListener(this);
        this.vistaCalculadoraBasica.botonIgual.addActionListener(this);
        this.vistaCalculadoraBasica.botonUno.addActionListener(this);
        this.vistaCalculadoraBasica.botonDos.addActionListener(this);
        this.vistaCalculadoraBasica.botonTres.addActionListener(this);
        this.vistaCalculadoraBasica.botonCuatro.addActionListener(this);
        this.vistaCalculadoraBasica.botonCinco.addActionListener(this);
        this.vistaCalculadoraBasica.botonSeis.addActionListener(this);
        this.vistaCalculadoraBasica.botonSiete.addActionListener(this);
        this.vistaCalculadoraBasica.botonOcho.addActionListener(this);
        this.vistaCalculadoraBasica.botonNueve.addActionListener(this);
        this.vistaCalculadoraBasica.botonMas.addActionListener(this);
        this.vistaCalculadoraBasica.botonMenos.addActionListener(this);
        this.vistaCalculadoraBasica.botonPor.addActionListener(this);
        this.vistaCalculadoraBasica.botonEntre.addActionListener(this);
        this.vistaCalculadoraBasica.botonClear.addActionListener(this);

        // Agregar el código del botón "Volver" aquí:
        this.vistaCalculadoraBasica.botonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana actual:
                vistaCalculadoraBasica.dispose();

                // Hacer visible la vista del menú principal:
                vistaMenuPrincipal.setVisible(true);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaCalculadoraBasica.botonUno) {
            
            String textoActual = vistaCalculadoraBasica.textPantallaCalculadora.getText();
            String textonuevo = textoActual + "1";
            vistaCalculadoraBasica.textPantallaCalculadora.setText(textonuevo);
        }

        if (e.getSource() == vistaCalculadoraBasica.botonDos) {

            String textoActual = vistaCalculadoraBasica.textPantallaCalculadora.getText();
            String textonuevo = textoActual + "2";
            vistaCalculadoraBasica.textPantallaCalculadora.setText(textonuevo);
        }

        if (e.getSource() == vistaCalculadoraBasica.botonTres) {

            String textoActual = vistaCalculadoraBasica.textPantallaCalculadora.getText();
            String textonuevo = textoActual + "3";
            vistaCalculadoraBasica.textPantallaCalculadora.setText(textonuevo);
        }

        if (e.getSource() == vistaCalculadoraBasica.botonCuatro) {

            String textoActual = vistaCalculadoraBasica.textPantallaCalculadora.getText();
            String textonuevo = textoActual + "4";
            vistaCalculadoraBasica.textPantallaCalculadora.setText(textonuevo);
        }

        if (e.getSource() == vistaCalculadoraBasica.botonCinco) {

            String textoActual = vistaCalculadoraBasica.textPantallaCalculadora.getText();
            String textonuevo = textoActual + "5";
            vistaCalculadoraBasica.textPantallaCalculadora.setText(textonuevo);
        }

        if (e.getSource() == vistaCalculadoraBasica.botonSeis) {

            String textoActual = vistaCalculadoraBasica.textPantallaCalculadora.getText();
            String textonuevo = textoActual + "6";
            vistaCalculadoraBasica.textPantallaCalculadora.setText(textonuevo);
        }

        if (e.getSource() == vistaCalculadoraBasica.botonSiete) {

            String textoActual = vistaCalculadoraBasica.textPantallaCalculadora.getText();
            String textonuevo = textoActual + "7";
            vistaCalculadoraBasica.textPantallaCalculadora.setText(textonuevo);
        }

        if (e.getSource() == vistaCalculadoraBasica.botonOcho) {

            String textoActual = vistaCalculadoraBasica.textPantallaCalculadora.getText();
            String textonuevo = textoActual + "8";
            vistaCalculadoraBasica.textPantallaCalculadora.setText(textonuevo);
        }

        if (e.getSource() == vistaCalculadoraBasica.botonNueve) {

            String textoActual = vistaCalculadoraBasica.textPantallaCalculadora.getText();
            String textonuevo = textoActual + "9";
            vistaCalculadoraBasica.textPantallaCalculadora.setText(textonuevo);
        }

        if (e.getSource() == vistaCalculadoraBasica.botonCero) {

            String textoActual = vistaCalculadoraBasica.textPantallaCalculadora.getText();
            String textonuevo = textoActual + "0";
            vistaCalculadoraBasica.textPantallaCalculadora.setText(textonuevo);
        }

        if (e.getSource() == vistaCalculadoraBasica.botonDosCeros) {

            String textoActual = vistaCalculadoraBasica.textPantallaCalculadora.getText();
            String textonuevo = textoActual + "00";
            vistaCalculadoraBasica.textPantallaCalculadora.setText(textonuevo);
        }

        if (e.getSource() == vistaCalculadoraBasica.botonPunto) {

            String textoActual = vistaCalculadoraBasica.textPantallaCalculadora.getText();
            String textonuevo = textoActual + ".";
            vistaCalculadoraBasica.textPantallaCalculadora.setText(textonuevo);
        }

        if (e.getSource() == vistaCalculadoraBasica.botonMas) {
            // Obtener el valor numérico que se muestra en la pantalla:
            double valor = Double.parseDouble(vistaCalculadoraBasica.textPantallaCalculadora.getText());

            // Guardar el primer operando y la operación a realizar:
            operando = valor;
            operacion = '+';

            // Limpiar la pantalla de la calculadora para mostrar el siguiente número:
            vistaCalculadoraBasica.textPantallaCalculadora.setText("");
        }

        if (e.getSource() == vistaCalculadoraBasica.botonMenos) {
            // Obtener el valor numérico que se muestra en la pantalla:
            double valor = Double.parseDouble(vistaCalculadoraBasica.textPantallaCalculadora.getText());

            // Guardar el primer operando y la operación a realizar:
            operando = valor;
            operacion = '-';

            // Limpiar la pantalla de la calculadora para mostrar el siguiente número:
            vistaCalculadoraBasica.textPantallaCalculadora.setText("");
        }

        if (e.getSource() == vistaCalculadoraBasica.botonPor) {
            // Obtener el valor numérico que se muestra en la pantalla:
            double valor = Double.parseDouble(vistaCalculadoraBasica.textPantallaCalculadora.getText());

            // Guardar el primer operando y la operación a realizar:
            operando = valor;
            operacion = '*';

            // Limpiar la pantalla de la calculadora para mostrar el siguiente número:
            vistaCalculadoraBasica.textPantallaCalculadora.setText("");
        }

        if (e.getSource() == vistaCalculadoraBasica.botonEntre) {
            // Obtener el valor numérico que se muestra en la pantalla:
            double valor = Double.parseDouble(vistaCalculadoraBasica.textPantallaCalculadora.getText());

            // Guardar el primer operando y la operación a realizar:
            operando = valor;
            operacion = '/';

            // Limpiar la pantalla de la calculadora para mostrar el siguiente número:
            vistaCalculadoraBasica.textPantallaCalculadora.setText("");
        }

        if (e.getSource() == vistaCalculadoraBasica.botonIgual) {
            // Obtener el valor numérico que se muestra en la pantalla:
            double valor = Double.parseDouble(vistaCalculadoraBasica.textPantallaCalculadora.getText());

            try {
                // Realizar la operación adecuada según el operador guardado:
                switch (operacion) {
                    case '+' ->
                        calculadoraBasica.sumar(valor + operando);
                    case '-' ->
                        calculadoraBasica.restar(valor - operando);
                    case '*' ->
                        calculadoraBasica.multiplicar(valor * operando);
                    case '/' -> {
                        if (valor == 0) {
                            throw new ArithmeticException("No se puede dividir por 0");
                        } else {
                            calculadoraBasica.dividir(operando / valor);
                        }
                    }
                    default -> {
                    }
                }
              
                // Crear el objeto DecimalFormat para formatear el número:
                DecimalFormat df = new DecimalFormat("#.###");

                // Actualizar la pantalla de la calculadora con el resultado formateado:
                vistaCalculadoraBasica.textPantallaCalculadora.setText(df.format(calculadoraBasica.getMemoria()));

            } catch (ArithmeticException ex) {
                // Mostrar un mensaje de error al usuario:
                JOptionPane.showMessageDialog(vistaCalculadoraBasica, ex.getMessage(), "Error", 
                        JOptionPane.ERROR_MESSAGE);

                // Limpiar los operandos y la operación guardados para la siguiente operación:
                operando = 0;
                operacion = ' ';

                // Limpiar la pantalla de la calculadora:
                vistaCalculadoraBasica.textPantallaCalculadora.setText("");
            }

        }

        if (e.getSource() == vistaCalculadoraBasica.botonClear) {
            // Llamar al método "limpiar" de la calculadora para reiniciar la memoria a cero:
            calculadoraBasica.limpiar();

            // Limpiar la pantalla de la calculadora:
            vistaCalculadoraBasica.textPantallaCalculadora.setText("");
        }
    }
}


