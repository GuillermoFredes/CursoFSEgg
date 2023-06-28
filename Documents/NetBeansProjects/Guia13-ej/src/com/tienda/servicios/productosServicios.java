package com.tienda.servicios;

import com.tienda.persistencia.productosDAO;
import java.util.ArrayList;
import java.util.Collection;
import com.tienda.entidades.productos;
import com.tienda.entidades.fabricante;
import com.tienda.servicios.fabricanteServicio;
import com.tienda.servicios.productosServicios;



public class productosServicios {
    private productosDAO dao;

    public productosServicios(productosDAO dao) {
        this.dao = dao;
    }
    

    public Collection<Producto> ListarProducto()throws Exception{
        try {
            
            String ABM = "SELECT codigo, nombre, precio, codigo_fabricante FROM producto";
            consultarBase(ABM);
            
            Producto nuevoProducto = null;
            Collection<Producto> arraryProducto = new ArrayList();
            while (resultado.next()) {
                nuevoProducto = new Producto();
                nuevoProducto.setCodigo(resultado.getInt(1));
                nuevoProducto.setNombre(resultado.getString(2));
                nuevoProducto.setPrecio(resultado.getDouble(3));
                nuevoProducto.setFabricante(resultado.getInt(4));
                arraryProducto.add(nuevoProducto);
            }
            desconectarBase();
            return arraryProducto;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
        throw new Exception ("Error de sistema");
        }
    }
    }
    
    

