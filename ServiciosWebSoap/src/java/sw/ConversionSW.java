/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw;

import controlador.Principal;
import java.util.Arrays;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Usuario;

/**
 *
 * @author fabia
 */
@WebService(serviceName = "ConversionSW")
public class ConversionSW {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "euroAdolar")
    public Double euroAdolar(@WebParam(name = "euros") double euros) {
        //TODO write your implementation code here:
        return euros * 1.15;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consulta")
    public String consulta(@WebParam(name = "cedula") String cedula) {
        Principal prin = new Principal();
        return prin.MostrarDatos(cedula);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validarDatos")
    public Usuario credenciales(@WebParam(name = "") String usuario, @WebParam(name = "") String password) {
        Principal prin = new Principal();
        prin.CrearDatos();
        Usuario usuenco = null;
        for (Usuario us : prin.listaUsuario) {
            if (usuario.equals(us.getUsuario()) && password.equals(us.getContrasena())) {
                usuenco = us;
            }
        }
        return usuenco;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "diccionario")
    public String diccionario(@WebParam(name = "palabra") String palabra) {
        Principal prin = new Principal();
        String[] definicion = prin.Diccionario(palabra);
        if (definicion == null) {
            return null;
        }
        return String.join("\n", definicion);
    }

}
