/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static controlador.controladorLogin.vista;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JOptionPane;
import sw.ConversionSW;
import sw.ConversionSW_Service;
import vista.vistaLogin;
import vista.vistaPrincipal;

/**
 *
 * @author fabia
 */
public class controladorPrincipal {

    ConversionSW_Service servicio = new ConversionSW_Service();
    ConversionSW cliente = servicio.getConversionSWPort();
    vistaPrincipal vistapr;
    private String usuario = controladorLogin.usuario;

    public controladorPrincipal(vistaPrincipal vistapr) {
        this.vistapr = vistapr;
        vistapr.setVisible(true);
    }

    public void iniciaControl() {
        vistapr.getBtnbuscar().addActionListener(o -> metodo());
        vistapr.getBtnSalir().addActionListener(o -> salir());

    }

    public void metodo() {
        if (vistapr.getTxtpalabra().getText().isEmpty()) {
        } else {
            String definicion = cliente.diccionario(vistapr.getTxtpalabra().getText().toLowerCase());
            if (definicion != null) {
                JOptionPane.showMessageDialog(vistapr, "SIGNIFICADO DE: " + vistapr.getTxtpalabra().getText() + " es:"+ definicion.toString());
            } else {
                JOptionPane.showMessageDialog(vistapr, "LA PALABRA NO SE ENCONTRO EN EL DICCIONARIO");
            }
        }
    }

    public void salir() {
        vistaLogin vista = new vistaLogin();
        controladorLogin controlador = new controladorLogin(vista);
        controlador.iniciaControl();
        vistapr.dispose();

    }
}
