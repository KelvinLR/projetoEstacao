import java.util.ArrayList;

public class Estacao {
    private String sigla;
    private String descricao;
    private ArrayList<LinhaFerroviaria> linhas = new ArrayList<LinhaFerroviaria>();

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getSigla() {
        return this.sigla;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setLinhas(ArrayList<LinhaFerroviaria> linhas) {
        this.linhas = linhas;
    }
    public ArrayList<LinhaFerroviaria> getLinhas() {
        return this.linhas;
    }

    public String toString(){
        String str = "";
        str += "Sigla: " + this.sigla +
        "\nDescrição: " + this.descricao +
        "\nLinhas: " + this.linhas.size();
        return str;
    }

    public void addLinhas(LinhaFerroviaria linha){
        this.linhas.add(linha);
        System.out.println("Linha " + linha.getNumeroLinha() + " adicionada!");
    }

    public void mostraLinhas(){
        System.out.println("Detalhes das linhas da estação " + this.sigla + ": " + this.linhas);
    }
}
