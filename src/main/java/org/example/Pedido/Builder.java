package org.example.Pedido;

import java.util.List;

public interface Builder <K, T> {
    K recheio(String recheio);
    K molhos(List<String> molhos);
    K extra(String extra);

    T createPedido();
}
