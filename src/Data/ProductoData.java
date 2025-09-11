/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Producto;
import java.util.ArrayList;


public class ProductoData {
    private ArrayList<Producto> lista;
    
    public void guardarProducto (Producto pro){
        // Permite crear un id cuando se agrega un producto secuencial mente
        pro.setIdProducto(lista.size() +1 );
        lista.add(pro);
    }
    public ArrayList<Producto> obtenerProducto(){
    return lista;
    }
    public void borrarProducto(Producto p){
        lista.remove(p);
    }
    
    public void modificarProducto(Producto nuevoProducto){
      
        for (Producto producto : lista) {
            if(producto.getIdProducto()==nuevoProducto.getIdProducto()){
            producto.setCodigo(nuevoProducto.getCodigo());
            producto.setDescripcion(nuevoProducto.getDescripcion());
            producto.setPrecio(nuevoProducto.getPrecio());
            producto.setStock(nuevoProducto.getStock());
            
            break;
            }
        }
    }
}
