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
import java.util.TreeSet;


public class ProductoData {
    public static TreeSet<Producto> lista = new TreeSet();
         
       
    public static void guardarProducto (){
       
        
    lista.add(new Producto(123,"rojo",12.1,COMESTIBLE,5));
    lista.add(new Producto(121233,"roasdsajo",12.2131,COMESTIBLE,54));
    
    }
   
    
    public static void borrarProducto(Producto p){
        lista.remove(p);
    }
    
    
}
