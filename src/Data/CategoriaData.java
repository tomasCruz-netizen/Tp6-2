/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entidades.Categoria;
import java.util.ArrayList;

/**
 *
 * @author Sutara
 */
public class CategoriaData {
    
    private ArrayList <Categoria> obtenerCategoria (){
        ArrayList<Categoria> lista = new ArrayList();
        
        lista.add(new Categoria(1,"Fiambre"));
        lista.add(new Categoria(2,"Lacteos"));
        lista.add(new Categoria(3,"Almacen"));
        lista.add(new Categoria(4,"Perfumeria"));
        
        
    return lista;
    }
    
}
