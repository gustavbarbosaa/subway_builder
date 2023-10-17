package org.example.Pedido;

import lombok.Data;

import java.util.List;

@Data
public class Pedido {
    private String pao, recheio, extra;
    private List<String> molhos;

    public void setMolhos(List<String> molhos) {
        this.molhos = molhos;
    }
}
