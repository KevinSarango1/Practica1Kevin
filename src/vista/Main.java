/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ed.cola.Cola;
import controlador.ed.lista.ListaEnlazada;
import controlador.ed.lista.exception.PosicionException;
import controlador.ed.lista.exception.VacioException;
import controlador.ed.pila.Pila;
import modelo.Sucursal;

/**
 *
 * @author Kevin
 */
public class Main {

    public static void main(String[] args) {
        Pila<Integer> pila= new Pila(5);
          Cola<Integer> cola= new Cola(5);
        try {
            pila.push(5);
            pila.push(56);
            pila.push(5);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
/*
            ListaEnlazada<Sucursal> lista= new ListaEnlazada<>();
            try {
                 Sucursal s1 = new Sucursal();
            s1.setId(lista.size()+1);
            s1.setNombre("Alyce");
            lista.insertar(s1);
            lista.imprimir();
            s1 = new Sucursal();
            s1.setId(lista.size()+1);
            s1.setNombre("Marylin");
            lista.insertar(s1);
            lista.imprimir();
            lista.insertarPosicion(s1, 0);

        } catch (VacioException ex) {
                System.out.println(ex.getMessage());
        } catch(PosicionException ex){
                System.out.println(ex.getMessage());
    }
    }

    }
*/