/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.modeloTablaSucursal;

import controlador.ed.cola.Cola;
import controlador.ed.cola.ColaI;
import controlador.ed.lista.exception.PosicionException;
import controlador.ed.lista.exception.VacioException;
import controlador.util.Utilidades;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import modelo.Sucursal;

/**
 *
 * @author USUARIO
 */
public class ModeloTablaSucursal extends AbstractTableModel {

    //private Sucursal[] datos = new Sucursal[4];
    private ColaI<Sucursal> cola = new ColaI<>(4);

    /*public Sucursal[] getDatos() {
        return datos;
    }

    public void setCola(Sucursal[] datos) {
        this.cola = cola;
    }*/
    public ColaI<Sucursal> getColaI() {
        return cola;
    }

    public void setColaI(ColaI<Sucursal> cola) {
        this.cola = cola;
    }

    @Override
    public int getColumnCount() {
        return 3;

    }

    @Override
    public int getRowCount() {
        return cola.size();
    }

    @Override
    public Object getValueAt(int i, int i1) {
        //Sucursal s = null;
        try {
            
            if (cola.isEmpty()) {
            return "009";
            }
           Sucursal s = cola.get(i);
        
        switch (i1) {
            case 0:
                return (s != null) ? s.getNombre() : "NO DEFINIDO";
            case 1:
                return (s != null) ? Utilidades.sumarVentas(s) : 0.0;
            case 2:
                return (s != null) ? Utilidades.mediaVentas(s) : 0.0;
            default:
                return "-0-";
        }
        } catch (VacioException | PosicionException ex) {
return "----";
        }

    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "SUCURSAL";
            case 1:
                return "VENTA ANUAL";
            case 2:
                return "VENTA PROMEDIO";
            default:
                return null;
        }

    }
}