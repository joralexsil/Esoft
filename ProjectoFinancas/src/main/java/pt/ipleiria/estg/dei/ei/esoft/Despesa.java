package pt.ipleiria.estg.dei.ei.esoft;

import java.util.Date;

public class Despesa {

    //int id, valor double, data Date, String descricao
    int id;
    double valor;
    SeletorDatas data;
    String descricao;

    public Despesa(int id) {
        this.id = id;
        valor = 0;
        data = new SeletorDatas(0,0,0);
        descricao = "";
    }


    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setData(SeletorDatas data) {
        this.data.setAno(data.getAno());
        this.data.setMes(data.getMes());
        this.data.setDia(data.getDia());
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    //
}