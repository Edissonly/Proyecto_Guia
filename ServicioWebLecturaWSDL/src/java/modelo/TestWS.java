/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.controladorLogin;
import java.util.List;
import sw.ConversionSW;
import sw.ConversionSW_Service;
import sw.Usuario;
import sw.UsuarioRol;
import vista.vistaLogin;

/**
 *
 * @author fabia
 */
public class TestWS {

    public static void main(String[] args) {
        ConversionSW_Service servicio = new ConversionSW_Service();
        ConversionSW cliente = servicio.getConversionSWPort();
//        System.out.println("Resultado 1: " + cliente.hello("Edisson"));
//        System.out.println("Resultado 2: " + cliente.euroAdolar(100));
//        System.out.println("Resultado 3: " + cliente.consulta("0107971244"));
//        System.out.println("Resultado 3: " + cliente.consulta("0104148770"));
//        Usuario u= cliente.validarDatos("jose", "1234");
//        List<UsuarioRol>listaUsuarioRols=u.getListaUsuarioRol();
//        for (UsuarioRol usuarioRol:listaUsuarioRols) {
//            System.out.println(usuarioRol.getIdRol().getRol());          
//        } 
        vistaLogin vista = new vistaLogin();
        controladorLogin controlador = new controladorLogin(vista);
        controlador.iniciaControl();
    }
}