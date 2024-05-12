/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import sw.ConversionSW;
import sw.ConversionSW_Service;
import sw.Usuario;
import vista.vistaLogin;
import vista.vistaPrincipal;

/**
 *
 * @author fabia
 */
public class controladorLogin {

    ConversionSW_Service servicio = new ConversionSW_Service();
    ConversionSW cliente = servicio.getConversionSWPort();
    static vistaLogin vista;
    static String usuario = "";

    public controladorLogin(vistaLogin vista) {
        this.vista = vista;
        vista.setVisible(true);
    }

    public void iniciaControl() {
        vista.getBtnLogin().addActionListener(i -> buscarusuario());
    }

    public void buscarusuario() {
        String usuario = vista.getTxtUsuario().getText();
        String contrasena = vista.getTxtContra().getText();

        if (usuario.isEmpty() && contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLENAR LOS CAMPOS SOLICITADOS");
        } else {
            Usuario usuarioValidado = cliente.validarDatos(usuario, contrasena);
            if (usuarioValidado != null) {
                JOptionPane.showMessageDialog(null, "Bienvenido al Sistema ");
                vistaPrincipal vistapri = new vistaPrincipal();
                controladorPrincipal controlador = new controladorPrincipal(vistapri);
                controlador.iniciaControl();
                vista.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "USUARIO NO EXISTENTE ");
            }
        }
    }

}
