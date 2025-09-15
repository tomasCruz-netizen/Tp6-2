/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
//NO ME COPUE
import static Data.ProductoData.lista;
import static Data.Rubro.COMESTIBLE;
import Entidades.Producto;
import java.util.Iterator;
import java.util.TreeSet;


public class ProductoData {
    public static TreeSet<Producto> lista = new TreeSet();
    
    
    
    
         
       
    public static void guardarProducto (Producto aux){
       lista.add(aux);
  
       
        
    }
   
    
    public static void borrarProducto(Producto p){
        Iterator <Producto> it = lista.iterator();
        while (it.hasNext()) {
            Producto next = it.next();
            if(next.getCodigo()== p.getCodigo())
                it.remove();
            
        }
        
    }
    
    
}
