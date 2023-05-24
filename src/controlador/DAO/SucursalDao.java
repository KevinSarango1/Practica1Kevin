/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.DAO;


import java.io.IOException;
import modelo.EnumMes;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author linux
 */
public class SucursalDao extends AdaptadorDAO<Sucursal> {
    private Sucursal sucursal;
    public SucursalDao() {
        super(Sucursal.class);
    }
    public Sucursal getSucursal(){
        if (this.sucursal==null) 
            this.sucursal=new Sucursal();
        return sucursal;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    public void guardar() throws IOException{
    this.guardar(sucursal);
}
    public void modificar(Integer pos) throws IOException{
        this.modificar(sucursal,pos);
    }
    
    public Integer generateId(){
        return listar().size()+1;
    }
    public static void main(String[] args){
        SucursalDao sd=new SucursalDao();
        sd.getSucursal().setNombre("Juan");
        sd.getSucursal().setId(sd.generateId());
        Venta v= new Venta();
        v.setMes(EnumMes.MAYO);
        v.setValor(500.0);
        sd.getSucursal().getVentas();
        try{
            sd.guardar(sd.getSucursal());
            System.out.println(sd.listar());
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }   
}
