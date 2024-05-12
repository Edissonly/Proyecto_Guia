/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class UsuarioRol {

    private int idUsuarioRol;
    private Usuario idUsuario;
    private Rol idRol;

    public UsuarioRol() {
    }

    public UsuarioRol(Usuario idUsuario, Rol idRol) {
        this.idUsuario = new Usuario(idUsuario);
        this.idRol = new Rol(idRol);
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Rol getIdRol() {
        return idRol;
    }

    public void setIdRol(Rol idRol) {
        this.idRol = idRol;
    }

}
