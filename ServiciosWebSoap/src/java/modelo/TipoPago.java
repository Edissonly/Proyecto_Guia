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
public class TipoPago {

    private int idTipoPago;
    private String tipo;
    private String descripcion;
    private ArrayList<Factura> listaFactura;

    public TipoPago() {
    }

    public TipoPago(int ifTipoPago, String tipo, String descripcion) {
        this.idTipoPago = ifTipoPago;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public int getIfTipoPago() {
        return idTipoPago;
    }

    public void setIfTipoPago(int ifTipoPago) {
        this.idTipoPago = ifTipoPago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(ArrayList<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

    @Override
    public String toString() {
        return "TipoPago{" + "idTipoPago=" + idTipoPago + ", tipo=" + tipo + ", descripcion=" + descripcion + ", listaFactura=" + listaFactura + '}';
    }

}
