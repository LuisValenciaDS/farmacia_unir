
package com.farmacia;

import com.farmacia.igu.Pedidos;

public class Farmacia {

    public static void main(String[] args) {
        Pedidos pedidos = new Pedidos (); /* Crea el objeto pedidos*/
        pedidos.setVisible(true);   /* Hacer interfaz grafica visible*/
        pedidos.setLocationRelativeTo(null);  /* Interfaz grafica en medio*/
    }
}
