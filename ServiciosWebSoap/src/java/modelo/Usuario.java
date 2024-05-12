/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author fabia
 */
public class Usuario {

    private int idUsuario;
    private Persona idPersona;
    private String usuario;
    private String contrasena;
    private ArrayList<UsuarioRol> listaUsuarioRol;

    public Usuario() {
    }

    public Usuario(Usuario u) {
        this.idUsuario = u.idUsuario;
        this.usuario = u.usuario;
        this.contrasena = u.contrasena;
        this.listaUsuarioRol = u.getListaUsuarioRol();
    }

    public Usuario(Persona idPersona, String usuario, String contrasena) {
        this.idPersona = idPersona;
        this.usuario = usuario;
        this.contrasena = contrasena;     
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList<UsuarioRol> getListaUsuarioRol() {
        return listaUsuarioRol;
    }

    public void setListaUsuarioRol(ArrayList<UsuarioRol> listaUsuarioRol) {
        this.listaUsuarioRol = listaUsuarioRol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", idPersona=" + idPersona + ", usuario=" + usuario + ", contrasena=" + contrasena + ", listaUsuarioRol=" + listaUsuarioRol + '}';
    }

}
