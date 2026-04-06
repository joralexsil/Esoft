package pt.ipleiria.estg.dei.ei.esoft;

public class Despesa {
    private String nome;
    private Categoria categoria;
    private double orcamento;
    private double real;


    // construtor

    public Despesa(String nome, Object categoria, Orcamento orcamento, double real) {

    }

    //getters, setters

    public double getDiferenca() {
        return real - orcamento;
    }

    public double getDiferencaPercentagem() {
        return (orcamento != 0) ? (getDiferenca() / orcamento) * 100 : 0;
    }
}