package controlador.util;

import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author Kevin
 */
public class Utilidades {

    public static void imprimir(Object[] objs) {
        System.out.println("Lista de: " + objs.getClass().getSimpleName());
        for (Object o : objs) {
            System.out.println(o.toString());
        }
    }
    public static Double sumarVentas(Sucursal s){
        if(s.getVentas() !=null){
        Double ventas = 0.0;
        for(Venta v: s.getVentas()){
            ventas += v.getValor();
        }
        return ventas;
    }
        return 0.0;
    }
    public static Double mediaVentas(Sucursal s){
        Double suma = sumarVentas(s);
        if (suma ==0)
        return suma;
        else
            return suma/(s.getVentas().length);
        
    }
}
