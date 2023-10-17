package org.example;


import org.example.Pedido.PedidoBuilder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var molhos = Arrays.asList("Agridoce", "Maionese", "Mostarda");

        var pedido = new PedidoBuilder("9 Grãos")
                .recheio("Chedar")
                .molhos(molhos)
                .extra("Alface")
                .createPedido();
        System.out.println(pedido);
    }
}