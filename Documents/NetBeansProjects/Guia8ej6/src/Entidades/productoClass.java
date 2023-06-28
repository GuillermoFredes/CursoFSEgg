/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class productoClass {

    ArrayList<String> productos;
    private String tipoproducto;
    private double precio;

    public productoClass() {
    }

    public productoClass(ArrayList<String> productos, String tipoproducto, double precio) {
        this.productos = productos;
        this.tipoproducto = tipoproducto;
        this.precio = precio;
    }

    public ArrayList<String> getProductos() {
        return productos;
    }

    public String getTipoproducto() {
        return tipoproducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setProductos(ArrayList<String> productos) {
        this.productos = productos;
    }

    public void setTipoproducto(String tipoproducto) {
        this.tipoproducto = tipoproducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.productos);
        hash = 29 * hash + Objects.hashCode(this.tipoproducto);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
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
        final productoClass other = (productoClass) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.tipoproducto, other.tipoproducto)) {
            return false;
        }
        if (!Objects.equals(this.productos, other.productos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "productoClass{" + "productos=" + productos + ", tipoproducto=" + tipoproducto + ", precio=" + precio + '}';
    }

}
