public class RecursoFerroviario {
    private Locomotiva locomotiva;
    private Vagao vagao;
    private Trem trem;
    private LinhaFerroviaria linha;
    private String tipoRecurso;

    public void setLocomotiva(Locomotiva locomotiva) {
        this.locomotiva = locomotiva;
    }
    public Locomotiva getLocomotiva() {
        return this.locomotiva;
    }
    public void setVagao(Vagao vagao) {
        this.vagao = vagao;
    }
    public Vagao getVagao() {
        return this.vagao;
    }
    public void setTrem(Trem trem) {
        this.trem = trem;
    }
    public Trem getTrem() {
        return this.trem;
    }
    public void setLinha(LinhaFerroviaria linha) {
        this.linha = linha;
    }
    public LinhaFerroviaria getLinha() {
        return this.linha;
    }
    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }
    public String getTipoRecurso() {
        return this.tipoRecurso;
    }

    RecursoFerroviario (Locomotiva locomotiva) {
        this.locomotiva = locomotiva;
        this.tipoRecurso = "Locomotiva";
    }
    RecursoFerroviario (Vagao vagao) {
        this.vagao = vagao;
        this.tipoRecurso = "Vagão";
    }
    RecursoFerroviario (Trem trem) {
        this.trem = trem;
        this.tipoRecurso = "Trem"; 
    }

    public String toString(){
        String str = "";

        str += "Linha: " + this.linha.getNumeroLinha() + 
        "\nTipo de recurso: " + this.tipoRecurso;
        return str;
    }
}
