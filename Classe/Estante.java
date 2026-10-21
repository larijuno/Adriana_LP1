public class Estante {

    // Atributos
    private double tamanho;
    private int divisorias;
    private String danos;

    // Construtor
    public Estante(double tamanho, int divisorias, String danos) {
        this.tamanho = tamanho;
        this.divisorias = divisorias;
        this.danos = danos;
    }

    // Métodos da classe
    public void ajustar(int novasDivisorias) {
        this.divisorias = novasDivisorias;
        System.out.println("Estante ajustada para " + divisorias + " divisórias.");
    }

    public void separarRoupas() {
        System.out.println("Roupas separadas em " + divisorias + " divisórias, na estante de " + tamanho + " m.");
    }

    public void reparar() {
        System.out.println("Danos reparados: " + danos + ".");
        this.danos = "nenhum";
    }

    // Métodos de acesso (getters e setters)
    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public int getDivisorias() {
        return divisorias;
    }

    public void setDivisorias(int divisorias) {
        this.divisorias = divisorias;
    }

    public String getDanos() {
        return danos;
    }

    public void setDanos(String danos) {
        this.danos = danos;
    }
}
