/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author fabia
 */
public class Factura {

    private int idFactura;
    private String ruc;
    private Persona idPersona;
    private Date fecha;
    private TipoPago idTipoPago;
    private double descuento;
    private double total;

    ////revisar agregacion y compocicion en java
    public Factura() {
    }

    public Factura(int idFactura, String ruc, Persona idPersona, Date fecha, TipoPago idTipoPago, double descuento, double total) {
        this.idFactura = idFactura;
        this.ruc = ruc;
        this.idPersona = idPersona;
        this.fecha = fecha;
        this.idTipoPago = idTipoPago;
        this.descuento = descuento;
        this.total = total;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TipoPago getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(TipoPago idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", ruc=" + ruc + ", idPersona=" + idPersona + ", fecha=" + fecha + ", idTipoPago=" + idTipoPago + ", descuento=" + descuento + ", total=" + total + '}';
    }
    
}
