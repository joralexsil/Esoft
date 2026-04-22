package pt.ipleiria.estg.dei.ei.esoft;

import java.util.Date;

public class Despesa {

    //int id, valor double, data Date, String descricao
    int id;
    double valor;
    Date data;
    String descricao;

    public Despesa(int id) {
        this.id = id;
        valor = 0;
        data = new Date();
        descricao = "";
    }

}