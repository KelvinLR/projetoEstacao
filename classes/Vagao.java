public class Vagao {
    private String numSerie;
    private String tipo;
    private double capacidadeCarga;
    private double comprimentoTesteiras;
    private double comprimentoEngates;

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }
    public String getNumSerie() {
        return numSerie;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    public double getCapacidadeCarga() {
        return this.capacidadeCarga;
    }
    public void setComprimentoTesteiras(double comprimentoTesteiras) {
        this.comprimentoTesteiras = comprimentoTesteiras;
    }
    public double getComprimentoTesteiras() {
        return this.comprimentoTesteiras;
    }
    public void setComprimentoEngates(double comprimentoEngates) {
        this.comprimentoEngates = comprimentoEngates;
    }
    public double getComprimentoEngates() {
        return this.comprimentoEngates;
    }

    public String toString(){
        String str = "";
        str += "Número de série: " + this.numSerie +
        "\nTipo: " + this.tipo + 
        "\nCapacidade de Carga: " + this.capacidadeCarga +
        "\nComprimento das Testeiras: " + this.comprimentoTesteiras +
        "\nComprimento dos Engates: " + this.comprimentoEngates;
        return str;      
    }

    Vagao () {}
    Vagao (String numSerie, String tipo, double capacidadeCarga, double comprimentoEngates, double comprimentoTesteiras) {
        this.numSerie = numSerie;
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
        this.comprimentoEngates = comprimentoEngates;
        this.comprimentoTesteiras = comprimentoTesteiras;
    }
}
