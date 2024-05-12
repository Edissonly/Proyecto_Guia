/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author fabia
 */
public class RolCompetencia {

    private int idRolCompetencia;
    private Competencia idCompetencia;
    private Rol idRol;

    public RolCompetencia() {
    }

    public RolCompetencia(int idRolCompetencia, Competencia idCompetencia, Rol idRol) {
        this.idRolCompetencia = idRolCompetencia;
        this.idCompetencia = idCompetencia;
        this.idRol = idRol;
    }

    public int getIdRolCompetencia() {
        return idRolCompetencia;
    }

    public void setIdRolCompetencia(int idRolCompetencia) {
        this.idRolCompetencia = idRolCompetencia;
    }

    public Competencia getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Competencia idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public Rol getIdRol() {
        return idRol;
    }

    public void setIdRol(Rol idRol) {
        this.idRol = idRol;
    }

    @Override
    public String toString() {
        return "RolCompetencia{" + "idRolCompetencia=" + idRolCompetencia + ", idCompetencia=" + idCompetencia + ", idRol=" + idRol + '}';
    }

}
