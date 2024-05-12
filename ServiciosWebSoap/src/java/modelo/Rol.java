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
public class Rol {

    private int idRol;
    private String rol;
    private boolean estado;
    private ArrayList<UsuarioRol> listaUsuarioRol;
    private ArrayList<RolCompetencia> listaRolCompetencia;

    public Rol() {
    }

    public Rol(String rol, boolean estado) {
        this.rol = rol;
        this.estado = estado;
    }

    public Rol(Rol r) {
        this.idRol = r.idRol;
        this.rol = r.rol;
        this.estado = r.estado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<UsuarioRol> getListaUsuarioRol() {
        return listaUsuarioRol;
    }

    public void setListaUsuarioRol(ArrayList<UsuarioRol> listaUsuarioRol) {
        this.listaUsuarioRol = listaUsuarioRol;
    }

    public ArrayList<RolCompetencia> getListaRolCompetencia() {
        return listaRolCompetencia;
    }

    public void setListaRolCompetencia(ArrayList<RolCompetencia> listaRolCompetencia) {
        this.listaRolCompetencia = listaRolCompetencia;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

}
