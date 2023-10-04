public class Locomotiva {
    private String numSerie;
    private double capacidadeTracao;
    private double comprimento;

    public String getNumSerie(){
        return numSerie;
    }
    public void setNumSerie(String numSerie){
        this.numSerie = numSerie;
    }
    public double getCapacidadeTracao(){
        return capacidadeTracao;
    }
    public void setCapacidadeTracao(double capacidadeTracao){
        this.capacidadeTracao = capacidadeTracao;
    }
    public double getComprimento(){
        return comprimento;
    }
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

    public String toString(){
        String str = "";
        str += "Número de Série: " + this.numSerie 
        + "\nCapacidade de Tração: " + this.capacidadeTracao 
        + "\nComprimento: " + this.comprimento;
        return str;
    }
}

