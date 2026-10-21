public class Mascara {

    // Atributos
    private String cor;
    private String modelo;
    private String cultura;

    // Construtor
    public Mascara(String cor, String modelo, String cultura) {
        this.cor = cor;
        this.modelo = modelo;
        this.cultura = cultura;
    }

    // Métodos da classe
    public void personalizar(String novaCor) {
        this.cor = novaCor;
        System.out.println("Máscara " + modelo + " personalizada na cor " + cor + ".");
    }

    public void talhar() {
        System.out.println("Máscara " + modelo + " talhada à mão.");
    }

    public void representar() {
        System.out.println("Esta máscara representa a cultura " + cultura + ".");
    }

    // Métodos de acesso (getters e setters)
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }
}
