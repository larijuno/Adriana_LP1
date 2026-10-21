public class Bicicleta {

    // Atributos
    private String cor;
    private int tamanho;
    private String marca;

    // Construtor
    public Bicicleta(String cor, int tamanho, String marca) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.marca = marca;
    }

    // Métodos da classe
    public void pintar(String novaCor) {
        this.cor = novaCor;
        System.out.println("Bicicleta " + marca + " pintada de " + cor + ".");
    }

    public void personalizar(String acessorio) {
        System.out.println("Bicicleta " + marca + " personalizada com " + acessorio + ".");
    }

    public void trocar(String peca) {
        System.out.println("Peça trocada: " + peca + " (bicicleta aro " + tamanho + ").");
    }

    // Métodos de acesso (getters e setters)
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
