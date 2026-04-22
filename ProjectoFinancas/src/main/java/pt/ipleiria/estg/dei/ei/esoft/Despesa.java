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


    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    //
}