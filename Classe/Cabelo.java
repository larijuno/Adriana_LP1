public class Cabelo {

    // Atributos
    private String cor;
    private double tamanho;
    private String curvatura;

    // Construtor
    public Cabelo(String cor, double tamanho, String curvatura) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.curvatura = curvatura;
    }

    // Métodos da classe
    public void pintar(String novaCor) {
        this.cor = novaCor;
        System.out.println("Cabelo pintado de " + cor + ".");
    }

    public void cortar(double cm) {
        tamanho = Math.max(0, tamanho - cm);
        System.out.println("Cabelo cortado. Novo tamanho: " + tamanho + " cm.");
    }

    public void modelar(String novaCurvatura) {
        this.curvatura = novaCurvatura;
        System.out.println("Cabelo modelado com curvatura " + curvatura + ".");
    }

    // Métodos de acesso (getters e setters)
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getCurvatura() {
        return curvatura;
    }

    public void setCurvatura(String curvatura) {
        this.curvatura = curvatura;
    }
}
