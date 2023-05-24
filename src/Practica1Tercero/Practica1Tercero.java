/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica1Tercero;

import controlador.SucursalControl;
import controlador.util.Utilidades;



/**
 *
 * @author USUARIO
 */
public class Practica1Tercero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     SucursalControl sc = new SucursalControl();
        try {
            sc.getSucursales().setId(1);
            sc.getSucursales().setNombre("Alberto");
            sc.registrar();
            sc.guardarVentas(1, 20.00);
            Utilidades.imprimir(sc.getSucursales().getVentas());
            sc.setSucursales(null);
            sc.getSucursales().setId(2);
            sc.getSucursales().setNombre("Paul");
            sc.registrar();
            sc.setSucursales(null);
            sc.getSucursales().setId(3);
            sc.getSucursales().setNombre("Marylin");
            sc.registrar();
            sc.setSucursales(null);
            sc.getSucursales().setId(4);
            sc.getSucursales().setNombre("Jose");
            sc.registrar();
            sc.setSucursales(null);
            
            sc.getColaI().imprimir();
            //Utilidades.imprimir2(sc.getColaI());
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }

}
