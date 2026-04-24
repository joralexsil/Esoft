package pt.ipleiria.estg.dei.ei.esoft;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.util.Scanner;

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

    public void listar(){
        //correr
        //correr a lista e para cada elemento que vai ser uma despesa, escrever printf

        if(despesas.isEmpty()){
            System.out.println("Despesa nao encontrada");
            return;
        }

        System.out.println("\n ---------------- Lista Despesa ----------------");

        for(Despesa d : despesas){
            System.out.println("Despesa com o id: " + d.id);
            System.out.println("Valor: " + d.valor);
            System.out.println("Descricao: " + d.descricao);
            System.out.println("Data: " + d.data.mostrarData());
            System.out.println("-----------------------------------");
        }
    }

    public void exportarPDF(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza o nome do ficheiro (ex: despesas): ");
        String nomeFicheiro = sc.next() + ".pdf";

        //"listar" para um pdf. mas pedir o nome para guardar ficheiros
        try {
            // 1. Criar o escritor e o documento PDF
            PdfWriter writer = new PdfWriter(nomeFicheiro);
            PdfDocument pdf = new PdfDocument(writer);
            Document documento = new Document(pdf);

            // 2. Adicionar um título
            documento.add(new Paragraph("Relatório de Despesas").setBold().setFontSize(18));

            // 3. Criar uma tabela com 4 colunas (ID, Data, Valor, Descrição)
            float[] columnWidths = {50f, 100f, 100f, 250f};
            Table tabela = new Table(columnWidths);
            tabela.addCell("ID");
            tabela.addCell("Data");
            tabela.addCell("Valor");
            tabela.addCell("Descrição");

            // 4. Percorrer a lista e adicionar à tabela
            for (Despesa d : despesas) {
                tabela.addCell(String.valueOf(d.id));
                tabela.addCell(d.data.mostrarData());
                tabela.addCell(String.format("%.2f€", d.valor));
                tabela.addCell(d.descricao);
            }
            documento.add(tabela);
            documento.close();

            System.out.println("PDF '" + nomeFicheiro + "' gerado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao gerar PDF: " + e.getMessage());
        }
    }
}
