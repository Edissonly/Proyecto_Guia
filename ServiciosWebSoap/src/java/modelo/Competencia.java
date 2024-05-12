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
public class Competencia {

    private int idCompetencia;
    private String nombre;
    private String descripcion;
    private ArrayList<RolCompetencia> listaRolCompetencia;

    public Competencia() {
    }

    public Competencia(int idCompetencia, String nombre, String descripcion) {
        this.idCompetencia = idCompetencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(int idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<RolCompetencia> getListaRolCompetencia() {
        return listaRolCompetencia;
    }

    public void setListaRolCompetencia(ArrayList<RolCompetencia> listaRolCompetencia) {
        this.listaRolCompetencia = listaRolCompetencia;
    }

    @Override
    public String toString() {
        return "Competencia{" + "idCompetencia=" + idCompetencia + ", nombre=" + nombre + ", descripcion=" + descripcion + ", listaRolCompetencia=" + listaRolCompetencia + '}';
    }

}
