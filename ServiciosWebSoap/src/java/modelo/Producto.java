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
public class Producto {

    private int idProducto;
    private int stock;
    private double precioUnitario;
    private String unidad;
    private Clasificacion idClasificacion;
    private Proveedores idProveedor;
    private boolean iva;

    public Producto() {
    }

    public Producto(int idProducto, int stock, double precioUnitario, String unidad, Clasificacion idClasificacion, Proveedores idProveedor, boolean iva) {
        this.idProducto = idProducto;
        this.stock = stock;
        this.precioUnitario = precioUnitario;
        this.unidad = unidad;
        this.idClasificacion = idClasificacion;
        this.idProveedor = idProveedor;
        this.iva = iva;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Clasificacion getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(Clasificacion idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    public Proveedores getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedores idProveedor) {
        this.idProveedor = idProveedor;
    }

    public boolean isIva() {
        return iva;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", stock=" + stock + ", precioUnitario=" + precioUnitario + ", unidad=" + unidad + ", idClasificacion=" + idClasificacion + ", idProveedor=" + idProveedor + ", iva=" + iva + '}';
    }

}
