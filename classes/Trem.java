import java.util.ArrayList;
import java.util.Date;

public class Trem {
    private String prefixo;
    private Date dataFormacao;
    private Locomotiva locomotivaPrincipal;
    private Vagao vagaoPrincipal;
    private ArrayList<Locomotiva> locomotivas = new ArrayList<Locomotiva>();
    private ArrayList<Vagao> vagoes = new ArrayList<Vagao>();
    private Estacao estacaoOrigem;
    private Estacao estacaoDestino;
    private int qtdElementos;

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }
    public String getPrefixo() {
        return this.prefixo;
    }
    public void setDataFormacao(Date dataFormacao) {
        this.dataFormacao = dataFormacao;
    }
    public Date getDataFormacao() {
        return this.dataFormacao;
    }
    public void setLocomotivaPrincipal(Locomotiva locomotivaPrincipal) {
        this.locomotivaPrincipal = locomotivaPrincipal;
    }
    public Locomotiva getLocomotivaPrincipal() {
        return this.locomotivaPrincipal;
    }
    public void setVagaoPrincipal(Vagao vagaoPrincipal) {
        this.vagaoPrincipal = vagaoPrincipal;
    }
    public Vagao getVagaoPrincipal() {
        return this.vagaoPrincipal;
    }
    public void setLocomotivas(ArrayList<Locomotiva> locomotivas) {
        this.locomotivas = locomotivas;
    }
    public ArrayList<Locomotiva> getLocomotivas() {
        return this.locomotivas;
    }
    public void setVagoes(ArrayList<Vagao> vagoes) {
        this.vagoes = vagoes;
    }
    public ArrayList<Vagao> getVagoes() {
        return this.vagoes;
    }
    public void setEstacaoOrigem(Estacao estacaoOrigem) {
        this.estacaoOrigem = estacaoOrigem;
    }
    public Estacao getEstacaoOrigem() {
        return this.estacaoOrigem;
    }
    public void setEstacaoDestino(Estacao estacaoDestino) {
        this.estacaoDestino = estacaoDestino;
    }
    public Estacao getEstacaoDestino() {
        return this.estacaoDestino;
    }
    public void setQtdElementos(int qtdElementos) {
        this.qtdElementos = qtdElementos;
    }
    public int getQtdElementos() {
        return this.qtdElementos;
    }

    Trem(Locomotiva locomotivaPrincipal, Vagao vagaoPrincipal){
        this.locomotivaPrincipal = locomotivaPrincipal;
        this.vagaoPrincipal = vagaoPrincipal;
        this.vagoes.add(vagaoPrincipal);
        this.locomotivas.add(locomotivaPrincipal);
        qtdElementos+=2;
    }

    public String toString(){
        String str = "";
        str += "Prefixo: " + this.prefixo + 
        "\nData de Formação: " + this.dataFormacao +
        "\nLocomotiva Principal: \n ---- \n" + this.locomotivaPrincipal.toString() + "\n ---- " +
        "\nVagão Principal: \n ---- \n" + this.vagaoPrincipal.toString() + "\n ---- " +
        "\nLocomotivas: " + this.locomotivas.size() +
        "\nVagões: " + this.vagoes.size() +
        "\nEstação de Origem: " + this.estacaoOrigem.getSigla() +
        "\nEstação de Destino: " + this.estacaoDestino.getSigla();
        return str;
    }

    public void adicionarVagao(Vagao vagao){
        if(qtdElementos <= 150){
            vagoes.add(vagao);
            System.out.println("Vagão " + vagao.getNumSerie() + " adicionado");
            qtdElementos++;
        } else {
            System.out.println("Limite de elementos no trem excedido");
            System.out.println("Não foi possível adicionar o vagão: " + vagao.getNumSerie());
        }
    }
    
    public void adicionarLocomotiva(Locomotiva locomotiva){
        if(qtdElementos <= 150){
            locomotivas.add(locomotiva);
            System.out.println("Locomotiva " + locomotiva.getNumSerie() + " adicionada");
            qtdElementos++;
        } else {
            System.out.println("Limite de elementos no trem excedido");
            System.out.println("Não foi possível adicionar a locomotiva: " + locomotiva.getNumSerie());
        }
    }
    
    public void mostraNumElementos(){
        System.out.println("Número de elementos do trem " + this.prefixo + ": " + this.qtdElementos);
    }
    
    public void mostraQtdLocomotivas(){
        System.out.println("Número de locomotivas do trem " + this.prefixo + ": " + this.locomotivas.size());
    }
    
    public void mostraQtdVagoes(){
        System.out.println("Número de vagões do trem " + this.prefixo + ": " + this.vagoes.size());
    }
    
    public void definirEstacoes(Estacao estacaoOrigem, Estacao estacaoDestino){
        if(estacaoOrigem.equals(estacaoDestino) == true){
            System.out.println("Erro: as estações de origem e destino são as mesmas");
        } else {
            this.estacaoOrigem = estacaoOrigem;
            this.estacaoDestino = estacaoDestino;
            System.out.println("Estações de origem e destino definidas");
        }
    }
}