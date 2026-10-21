public class Manequim {

    // Atributos
    private String cor;
    private String marca;
    private String modelo;

    // Construtor
    public Manequim(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos da classe
    public void escolher(String novoModelo) {
        this.modelo = novoModelo;
        System.out.println("Manequim escolhido: modelo " + modelo + ", marca " + marca + ", cor " + cor + ".");
    }

    public void comprar() {
        System.out.println("Manequim " + marca + " " + modelo + " (" + cor + ") comprado!");
    }

    public void posar(String pose) {
        System.out.println("O manequim " + modelo + " está posando: " + pose + ".");
    }

    // Métodos de acesso (getters e setters)
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
