/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.modeloTablaSucursal;

import controlador.util.Utilidades;
import javax.swing.table.AbstractTableModel;
import modelo.Venta;

/**
 *
 * @author USUARIO
 */
public class ModeloTablaVenta extends AbstractTableModel {

    private Venta[] datos = new Venta[12];

    public Venta[] getVenta() {
        return getDatos();
    }

    public void setVenta(Venta[] datos) {
        this.setDatos(datos);
    }

    @Override
    public int getColumnCount() {
        return 2;

    }

    @Override
    public int getRowCount() {
        return getDatos().length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Venta s = getDatos()[i];
        switch (i1) {
            case 0:
                return (s != null) ? s.getMes().toString() : "NO DEFINIDO";
            case 1:
                return (s != null) ? s.getValor() : 0.0;
  
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "MES";
            case 1:
                return "VALOR";

            default:
                return null;
        }

    }

    /**
     * @return the datos
     */
    public Venta[] getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(Venta[] datos) {
        this.datos = datos;
    }
}
