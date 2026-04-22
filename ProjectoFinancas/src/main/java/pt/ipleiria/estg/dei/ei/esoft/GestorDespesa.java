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
        for(Despesa d :despesas){
            if(d.id == despesa.id){
                System.out.println("Erro: Já existe uma despesa registada com o ID " + despesa.id + ".");
                return;
            }
        }

        //resgista se for igual faz add a linked list
        despesas.add(despesa);
        System.out.println("Despesa com ID " + despesa.id + " registada com sucesso!");
    }

    public void editar(int id, Despesa despesa){

        //fazer um for ate encontrar uma despesa com o mesmo id da despesa passada por referencia se for igual
        //subistiur essa despesa por a despesa passada por referencia

        for(Despesa despesa1 : despesas){
            if(despesa1.id == id){
                despesa1.valor = despesa.valor;
                despesa1.descricao = despesa.descricao;
                despesa1.data = despesa.data;

                System.out.println("despesa editad com sucesso");
                return;
            }
        }

        System.out.println("Despesa nao encontrada");
    }

    public void remover(int id){
        //guardar a despesa caso se encontre
        Despesa despesaARemover = null;

        //fazer um for ate encontrar uma despesa com o mesmo id da despesa passada por referencia se for igual  remove
        for (Despesa d : despesas) {
            if (d.id == id) {
                despesaARemover = d;
                break;
            }
        }

        // caso contrario manda uma mensagem a dizer que nao existe a despesa a remover.
        if (despesaARemover != null) {
            despesas.remove(despesaARemover);
            System.out.println("Despesa com o id " + id + " removida com sucesso!");
        } else {
            System.out.println("Não é possível remover a despesa com o id" + id + " porque não existe!");
        }
    }
}
