package Main;

import Controlador.*;
import Modelo.*;
import Vista.*;
import Vista.Idiomas.*;

/**
 *
 * @author gherrada22
 * @Linkedin gherrada22
 * @Github gherrada22
 */
public class Main {

    public static void main(String[] args) {
        
        // Instancias de las vistas:
        VistaMenuPrincipal vistaMenuPrincipal = new VistaMenuPrincipal();
        VistaConversorMoneda vistaConversorMoneda = new VistaConversorMoneda();
        VistaFrasesIdiomas vistaFrasesIdiomas = new VistaFrasesIdiomas();
        VistaFrances vistaFrances = new VistaFrances();
        VistaIngles vistaIngles = new VistaIngles();
        VistaItaliano vistaItaliano = new VistaItaliano();
        VistaPortugues vistaPortugues = new VistaPortugues();
        VistaCalculadoraDescuento vistaCalculadoraDescuento = new VistaCalculadoraDescuento();
        VistaCalculadoraBasica vistaCalculadoraBasica = new VistaCalculadoraBasica();

        // Instancias de las clases del modelo:
        ConvertirMoneda convertir = new ConvertirMoneda();
        CalcularDescuento calcularDescuento = new CalcularDescuento();
        CalculadoraBasica calculadoraBasica = new CalculadoraBasica();

        // Instancias de los controladores:
        ControladorConversorMoneda controladorConversorMoneda = new ControladorConversorMoneda(vistaConversorMoneda,
                convertir, vistaMenuPrincipal);
        ControladorMenuPrincipal controladorMenuPrincipal = new ControladorMenuPrincipal(vistaMenuPrincipal, 
                vistaConversorMoneda, vistaFrasesIdiomas, vistaCalculadoraDescuento, vistaCalculadoraBasica);
        ControladorFrasesIdiomas controladorFrasesIdiomas = new ControladorFrasesIdiomas(vistaFrasesIdiomas, 
                vistaMenuPrincipal, vistaFrances, vistaIngles, vistaItaliano, vistaPortugues);
        ControladorFrances controladorFrances = new ControladorFrances(vistaFrances, vistaFrasesIdiomas);
        ControladorIngles controladorIngles = new ControladorIngles(vistaIngles, vistaFrasesIdiomas);
        ControladorItaliano controladorItaliano = new ControladorItaliano(vistaItaliano, vistaFrasesIdiomas);
        ControladorPortugues controladorPortugues = new ControladorPortugues(vistaPortugues, vistaFrasesIdiomas);
        ControladorCalculadoraDescuento controladorCalculadoraDescuento = new ControladorCalculadoraDescuento(
                vistaCalculadoraDescuento, vistaMenuPrincipal, calcularDescuento);
        ControladorCalculadoraBasica controladorCalculadoraBasica = new ControladorCalculadoraBasica(
                vistaCalculadoraBasica, vistaMenuPrincipal, calculadoraBasica);
        ControladorAcercaDe controladorMenuAcercaDe = new ControladorAcercaDe(vistaMenuPrincipal);
        ControladorDesarrollador controladorDesarrollador = new ControladorDesarrollador(vistaMenuPrincipal);
        ControladorSalir controladorSalir = new ControladorSalir();

        // Controladores como escuchadores de eventos (actionListener):
        vistaMenuPrincipal.menuSalir.addActionListener(controladorSalir);

        // Mostrar la vista principal:
        vistaMenuPrincipal.setVisible(true);

        // Manejar las acciones de los controladores:
        controladorMenuPrincipal.manejarBotonMenuPrincipal();
        controladorFrasesIdiomas.manejarBotonIdiomas();

        // Ocultar la vista del conversor:
        vistaConversorMoneda.setVisible(false);
    }

}
