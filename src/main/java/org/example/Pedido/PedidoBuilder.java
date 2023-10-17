package org.example.Pedido;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class PedidoBuilder implements Builder<PedidoBuilder, Pedido> {
    private final String pao;
    private String recheio;
    private String molhos;
    private String extra;

    public PedidoBuilder(String pao) {
        this.pao = pao;
    }

    public PedidoBuilder recheio(String recheio) {
        this.recheio = recheio;
        return this;
    }

    public PedidoBuilder molhos(@NotNull List<String> molhos) {
        this.molhos = molhos.toString();
        return this;
    }

    public PedidoBuilder extra(String extra) {
        this.extra = extra;
        return this;
    }

    public Pedido createPedido() {
        var pedido = new Pedido();

        pedido.setPao(this.pao);
        pedido.setRecheio(this.recheio);
        pedido.setMolhos(Collections.singletonList(this.molhos));
        pedido.setExtra(this.extra);

        return pedido;
    }
}
