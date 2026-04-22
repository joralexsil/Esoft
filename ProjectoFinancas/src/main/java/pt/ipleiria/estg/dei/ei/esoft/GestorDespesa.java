package pt.ipleiria.estg.dei.ei.esoft;

import java.util.LinkedList;

public class GestorDespesa {
    private LinkedList<Despesa> despesas;

    public GestorDespesa() {
        this.despesas = new LinkedList<>();
    }
        //vai ter uma linekd list de objetos do tipo Despesa

    public void registar(Despesa despesa){

        //fazer um for ate encontrar uma despesa com o mesmo id da despesa passada por referencia se for igual nao
        //resgista se for igual faz add a linked list

        int id = despesa.id;


        despesas.add(despesa);

    }

    public void editar(int id, Despesa despesa){

        //fazer um for ate encontrar uma despesa com o mesmo id da despesa passada por referencia se for igual
        //subistiur essa despesa por a despesa passada por referencia
    }

    public void remover(int id){

        //fazer um for ate encontrar uma despesa com o mesmo id da despesa passada por referencia se for igual  remove
        // caso contrario manda uma mensagem a dizer que nao existe a despesa a remover.


    }
}
