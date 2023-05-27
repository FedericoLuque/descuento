/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea06;

/**
 *
 * @author lucky
 */
public class Facturacion {
    
    public void aplicarDescuento(double precioProducto, int numProductos){     double Total;
    if(numProductos>3)
        precioProducto-=DESCUENTO_POR_CANTIDAD;
            if (numProductos!=0){
            Total = precioProducto*0.8;
            salidaPorConsola(Total);
        }else {
            Total = precioProducto*0.95;
            salidaPorConsola(Total);
        }   
    }
    public static final int DESCUENTO_POR_CANTIDAD = 5;

    private void salidaPorConsola(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
}

