/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.DAO;

import controlador.ed.lista.ListaEnlazada;
import java.io.IOException;

/**
 *
 * @author linux
 */
public interface InterfazDao <T>{
    //metodo que permite realizar el guardado
    
    public void guardar(T obj)throws IOException;
    //permite modificar los datos en un repositorio de datos
    public void modificar(T obj, Integer pos)throws IOException;
    public ListaEnlazada<T> listar();
    public T obtener(Integer id);
}
