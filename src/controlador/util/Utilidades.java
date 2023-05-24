package controlador.util;

import controlador.ed.cola.ColaI;
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
    
     /*public static void imprimir2(ColaI<Sucursal> objs) {
        System.out.println("Lista de: " + objs.getClass().getSimpleName());
        for (Object o : objs) {
            System.out.println(o.toString());
        }
    }*/
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
    
     public static void ordenarVentas_obtenerMAYOR_MENOR(Sucursal s){
        int cont = 0;
        Venta[] v = s.getVentas();
        Venta v_aux = new Venta();
        
        //ordenar metodo burbuja
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j].getValor() > v[j + 1].getValor()) {
                     v_aux = v[j];
                    v[j] = v[j + 1];
                     v[j + 1] = v_aux;
                }
                cont++;
            }
        }  
        
        for (int i = 0; i < 12; i++) {
             System.out.println(" v[i] "+  v[i].getValor());
         }
         System.out.println("\n");
         System.out.println("Menor Valor\n");
         System.out.println("Sucursal: "+s.getNombre()+" Mes: "+v[0].getMes() +", y Monto: "+v[0].getValor());
         
          System.out.println("\n");
         System.out.println("Mayor Valor\n");
         System.out.println("Sucursal: "+s.getNombre()+" Mes: "+v[11].getMes() +", y Monto: "+v[11].getValor());
    }
}
