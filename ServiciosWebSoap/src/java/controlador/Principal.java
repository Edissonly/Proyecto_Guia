/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import modelo.Clasificacion;
import modelo.Competencia;
import modelo.Factura;
import modelo.ItemFactura;
import modelo.Persona;
import modelo.Producto;
import modelo.Proveedores;
import modelo.Rol;
import modelo.RolCompetencia;
import modelo.TipoPago;
import modelo.Usuario;
import modelo.UsuarioRol;

/**
 *
 * @author fabia
 */
public class Principal {

    public ArrayList<Persona> listaPersona = new ArrayList();
    public ArrayList<TipoPago> listatipopago = new ArrayList();
    public ArrayList<Factura> listaFactura = new ArrayList();
    public ArrayList<Clasificacion> listaClasificacion = new ArrayList();
    public ArrayList<Proveedores> listaProveedor = new ArrayList();
    public ArrayList<Competencia> listaCompetencia = new ArrayList();
    public ArrayList<Producto> listaProducto = new ArrayList();
    public ArrayList<ItemFactura> listaItem = new ArrayList();
    public ArrayList<Usuario> listaUsuario = new ArrayList();
    public ArrayList<Rol> listaRol = new ArrayList();
    public ArrayList<UsuarioRol> listaUsuRol = new ArrayList();
    public ArrayList<RolCompetencia> listaRolCompetencia = new ArrayList();

    public static void main(String[] args) {
        Principal miObjeto = new Principal();
        miObjeto.CrearDatos();
    }

    public String[] Diccionario(String palabra) {
        Map<String, String[]> diccionario = new HashMap<>();
        diccionario.put("java", new String[]{"Lenguaje de programación de alto nivel", "Usado para desarrollar aplicaciones y sistemas", "Posee una amplia biblioteca estándar", "Permite la programación concurrente"});
        diccionario.put("python", new String[]{"Lenguaje de programación de alto nivel", "Interpretado y de script, con semántica dinámica", "Posee una sintaxis sencilla que favorece la legibilidad del código", "Soporta múltiples paradigmas de programación, incluyendo estructurada, orientada a objetos, y funcional", "Ampliamente utilizado en ciencia de datos, inteligencia artificial, y desarrollo web"});
        diccionario.put("amor", new String[]{"Expresa Sentimiento"});
        diccionario.put("nike", new String[]{"Es una empresa multinacional estadounidense dedicada al diseño, desarrollo, fabricación y comercialización de calzado, ropa."});
        diccionario.put("rosa", new String[]{"Es una flor de color rojo de la familia de las rosáceas, muy apreciada por su belleza y su perfume."});
        diccionario.put("vida", new String[]{"Es la capacidad de los seres humanos, animales y plantas para funcionar y desarrollarse en el mundo."});
        diccionario.put("casa", new String[]{"Es un edificio o estructura, generalmente de tamaño pequeño a mediano, que sirve como vivienda para una persona, familia o grupo de personas."});
        diccionario.put("perro", new String[]{"Es un mamífero carnívoro de la familia de los cánidos, subordinado al hombre desde hace unos 14 000 años."});
        diccionario.put("gato", new String[]{"Es un pequeño mamífero carnívoro de la familia Felidae. Los gatos han sido domesticados por el hombre desde hace unos 9500 años."});
        diccionario.put("mochila", new String[]{"Es un tipo de bolso que se lleva en la espalda, sujeto con dos bandas que pasan por encima de los hombros."});
        return diccionario.get(palabra);
    }

    public void CrearDatos() {

        ///Personas///
        Persona p1 = new Persona(1, "Edisson", "Leon", "0107971244", "0992349676", "edisonleon@gmail.com");
        Persona p2 = new Persona(2, "Pedro", "Lopez", "0104148770", "0987913264", "pedrolopez@gmail.com");
        Persona p3 = new Persona(3, "Rosa", "Lojano", "0107971265", "0991901213", "rosalojano@gmail.com");
        listaPersona.add(p1);
        listaPersona.add(p2);
        listaPersona.add(p3);

        ///Tipo de Pago///
        TipoPago tp1 = new TipoPago(0, "Efectivo", "Dinero Corriente");
        TipoPago tp2 = new TipoPago(0, "Credito", "Dinero por Cuotas");
        TipoPago tp3 = new TipoPago(0, "Tranferencia", "Dinero por Deposito");
        listatipopago.add(tp1);
        listatipopago.add(tp2);
        listatipopago.add(tp3);

        ///Factura///
        Factura fact1 = new Factura(1, "0107971244001", p1, new Date(), tp1, 0.98, 50);
        Factura fact2 = new Factura(2, "0104148770001", p2, new Date(), tp2, 0, 0);
        Factura fact3 = new Factura(3, "0107971265001", p3, new Date(), tp3, 0, 0);
        listaFactura.add(fact1);
        listaFactura.add(fact2);
        listaFactura.add(fact3);

        ///Clasificacion///
        Clasificacion clasi1 = new Clasificacion(1, "Electrónicos");
        Clasificacion clasi2 = new Clasificacion(2, "Ropa");
        Clasificacion clasi3 = new Clasificacion(3, "Alimentos");
        listaClasificacion.add(clasi1);
        listaClasificacion.add(clasi2);
        listaClasificacion.add(clasi3);

        ///Proveedores///
        Proveedores prov1 = new Proveedores(1, "0107971244001", "0992349676", "Ecuador", "prove1@gmail.com", "Dolar");
        Proveedores prov2 = new Proveedores(1, "0107971244001", "0992349676", "España", "prove2@gmail.com", "Euros");
        Proveedores prov3 = new Proveedores(1, "0107971244001", "0992349676", "Bolivia", "prove3@gmail.com", "Bolivares");
        listaProveedor.add(prov1);
        listaProveedor.add(prov2);
        listaProveedor.add(prov3);

        ///Competencia///
        Competencia compe1 = new Competencia(1, "Ventas", "Capacidad para vender productos de manera efectiva");
        Competencia compe2 = new Competencia(2, "Negociación", "Habilidad para negociar precios y condiciones de venta");
        Competencia compe3 = new Competencia(3, "Atención al cliente", "Proporcionar un excelente servicio al cliente durante y después de la venta");
        listaCompetencia.add(compe1);
        listaCompetencia.add(compe2);
        listaCompetencia.add(compe3);

        ///Producto///
        Producto pro1 = new Producto(1, 10, 12, "Lavadora", clasi1, prov1, true);
        Producto pro2 = new Producto(2, 15, 18, "Blusa", clasi2, prov2, true);
        Producto pro3 = new Producto(3, 20, 25, "Galletas", clasi3, prov3, true);
        listaProducto.add(pro1);
        listaProducto.add(pro2);
        listaProducto.add(pro3);

        ///Item Factura///
        ItemFactura item1 = new ItemFactura(1, fact3, pro1, 10, 6, 5.80);
        ItemFactura item2 = new ItemFactura(2, fact2, pro2, 0, 12, 11.80);
        ItemFactura item3 = new ItemFactura(3, fact3, pro3, 0, 3, 2.80);
        ItemFactura item4 = new ItemFactura(4, fact1, pro1, 0, 7, 6.80);
        listaItem.add(item1);
        listaItem.add(item2);
        listaItem.add(item3);
        listaItem.add(item4);

        /// Crear Roles ///
        Rol rol1 = new Rol("Adminstrador", true);
        Rol rol2 = new Rol("Vendedor", true);
        Rol rol3 = new Rol("Empleado", true);
        listaRol.add(rol1);
        listaRol.add(rol2);
        listaRol.add(rol3);

        /// Crear Usuarios ///
        Usuario usu1 = new Usuario(p1, "edisson", "1234");
        listaUsuRol = new ArrayList<>();
        listaUsuRol.add(new UsuarioRol(usu1, rol1));
        listaUsuRol.add(new UsuarioRol(usu1, rol2));
        listaUsuRol.add(new UsuarioRol(usu1, rol3));
        usu1.setListaUsuarioRol(listaUsuRol);

        Usuario usu2 = new Usuario(p1, "jose", "1234");
        listaUsuRol = new ArrayList<>();
        listaUsuRol.add(new UsuarioRol(usu2, rol2));
        listaUsuRol.add(new UsuarioRol(usu2, rol3));
        usu2.setListaUsuarioRol(listaUsuRol);

        listaUsuario.add(usu1);
        listaUsuario.add(usu2);

        /// ROL Competencia ///
        RolCompetencia rolcom1 = new RolCompetencia(1, compe1, rol1);
        RolCompetencia rolcom2 = new RolCompetencia(2, compe2, rol2);
        RolCompetencia rolcom3 = new RolCompetencia(3, compe3, rol3);
        listaRolCompetencia.add(rolcom1);
        listaRolCompetencia.add(rolcom2);
        listaRolCompetencia.add(rolcom3);

    }

    public String MostrarDatos(String cedula) {
        String mensaje = "";
        CrearDatos();
        for (int m = 0; m < listaFactura.size(); m++) {
            if (listaFactura.get(m).getIdPersona().getDni().equals(cedula)) {
                System.out.println("Su factura es: \n" + listaFactura.get(m).toString());
                for (int i = 0; i < listaUsuario.size(); i++) {
                    Persona perso = listaUsuario.get(i).getIdPersona();
                    if (perso.getDni().equals(cedula)) {
                        int usuario = listaUsuario.get(i).getIdUsuario();
                        for (int j = 0; j < listaUsuRol.size(); j++) {
                            if (listaUsuRol.get(j).getIdUsuario().getIdUsuario() == usuario) {
                                int rolusuario = listaUsuRol.get(j).getIdRol().getIdRol();
                                for (int k = 0; k < listaRolCompetencia.size(); k++) {
                                    if (listaRolCompetencia.get(k).getIdRol().getIdRol() == rolusuario) {
                                        Competencia compe = listaRolCompetencia.get(k).getIdCompetencia();
                                        System.out.println("Competencias asignadas son: " + compe.getNombre());
                                        mensaje = "Su factura es: \n" + listaFactura.get(m).toString() + "\n" + "Competencias asignadas son: \n" + compe.getNombre();
                                    }
                                }
                            }

                        }
                    }
                }
            }
        }
        return mensaje;
    }

}
