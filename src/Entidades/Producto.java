
package Entidades;

import Data.Rubro;
import java.util.Objects;

/**
 *
 * @author Sutara
 */
public class Producto {
    
    
    private int codigo;
    private String descripcion;
    private double precio;
    private Rubro rubro;
    private int stock;

    public Producto() {}

    
    public Producto( int codigo, String descripcion, double precio,Rubro rubro, int stock) {
      
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rubro = rubro;
        this.stock = stock;
    }

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    @Override
    public String toString() {
        return ", codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", rubro=" + rubro + ", stock=" + stock + '}';
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codigo;
        hash = 89 * hash + Objects.hashCode(this.descripcion);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.rubro);
        hash = 89 * hash + this.stock;
        return hash;
    }

   

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        
        return true;
    }
     
    
}
