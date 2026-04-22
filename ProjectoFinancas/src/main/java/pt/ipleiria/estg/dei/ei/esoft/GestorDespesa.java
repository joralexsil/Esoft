package pt.ipleiria.estg.dei.ei.esoft;

import java.util.LinkedList;

public class GestorDespesa {
    private LinkedList<Despesa> despesas;

    public GestorDespesa() {
        this.despesas = new LinkedList<>();
    }
//vai ter uma linekd list de objetos do tipo Despesa

    public void registar(Despesa despesa){
        //regista despesa: data, valor e descricao
        int id = despesa.id;


        despesas.add(despesa);

    }

    public void editar(int id){
        //edita a despesa
    }

    public void remover(int id){

    }
}
