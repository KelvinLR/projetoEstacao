import java.util.ArrayList;

public class LinhaFerroviaria {
    private int numeroLinha;
    private double extensao;
    private String descricao;
    private ArrayList<RecursoFerroviario> recursosFerroviarios = new ArrayList<RecursoFerroviario>();

    public void setNumeroLinha(int numeroLinha) {
        this.numeroLinha = numeroLinha;
    }
    public int getNumeroLinha() {
        return this.numeroLinha;
    }
    public void setExtensao(double extensao) {
        this.extensao = extensao;
    }
    public double getExtensao() {
        return this.extensao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setRecursosFerroviarios(ArrayList<RecursoFerroviario> recursosFerroviarios) {
        this.recursosFerroviarios = recursosFerroviarios;
    }
    public ArrayList<RecursoFerroviario> getRecursosFerroviarios() {
        return this.recursosFerroviarios;
    }

    public String toString(){
        String str = "";
        str += "Número da linha: " + this.numeroLinha + 
        "\nExtensão: " + this.extensao + 
        "\nDescrição: " + this.descricao +
        "\nRecursos Ferroviários: " + this.recursosFerroviarios.size();
        return str;
    }

    public void adicionarRecursos(RecursoFerroviario recursoFerroviario){
        System.out.println("Recurso " + recursoFerroviario.getTipoRecurso() + " adicionado na linha " + this.numeroLinha);
        recursosFerroviarios.add(recursoFerroviario);
    }

    public void mostraRecursos(){
        System.out.println("Detalhes dos recursos estacionados na linha " + this.numeroLinha + ": " + this.recursosFerroviarios);
    }
}
