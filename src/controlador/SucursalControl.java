/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.ed.cola.Cola;
import controlador.ed.cola.ColaI;
import controlador.ed.lista.exception.exception.TopeException;
import controlador.exception.EspacioException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.EnumMes;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author Kevin
 */
public class SucursalControl {
    //private Sucursal[] sucursales;
    private ColaI<Sucursal> cola = new ColaI<>(4);
    private Sucursal sucursales;
    private Venta venta;

    /*public SucursalControl() {
        sucursales = new Sucursal[4];
    }*/

    public ColaI<Sucursal> getColaI() {
        return cola;
    }

    public void setColaI(ColaI<Sucursal> cola) {
        this.cola = cola;
    }

    public Sucursal getSucursales() {
        if (sucursales == null) {
            this.sucursales = new Sucursal();
        }
        return sucursales;
    }

    public void setSucursales(Sucursal sucursales) {
        this.sucursales = sucursales;
    }

    
    /**
     * @return the venta
     */
    public Venta getVenta() {
        if (venta == null) {
            this.venta = new Venta();
        }
        return venta;
    }

    /**
     * @param venta the venta to set
     */
    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public boolean registrar() throws EspacioException {
        int pos = cola.size();//maximo de la cola, importante usar size y no gettope
        if (pos >= 4) {
            throw new EspacioException();
        }

        sucursales.setVentas(new Venta[EnumMes.values().length]);

        for (int i = 0; i < EnumMes.values().length; i++) {
            Venta v = new Venta();
            v.setId(i + 1);
            v.setMes(EnumMes.values()[i]);
            v.setValor(0.0);
            sucursales.getVentas()[i] = v;
        }

        try {
            cola.queue(sucursales);
        } catch (TopeException ex) {
            Logger.getLogger(SucursalControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        sucursales = null;
        return true;
    }

    public boolean guardarVentas(Integer posVenta, Double valor) throws EspacioException {
        if (sucursales != null) {
            if (posVenta >= 0 && posVenta < sucursales.getVentas().length) {
                sucursales.getVentas()[posVenta].setValor(valor);
                return true;
            } else {
                throw new EspacioException();
            }
        } else {
            throw new NullPointerException("Debe seleccionar una sucursal");
        }
    }
}