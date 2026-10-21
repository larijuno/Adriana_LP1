public class Estatua {

    // Atributos
    private String origem;
    private int idade;
    private double peso;

    // Construtor
    public Estatua(String origem, int idade, double peso) {
        this.origem = origem;
        this.idade = idade;
        this.peso = peso;
    }

    // Métodos da classe
    public void exportar(String destino) {
        System.out.println("Estátua de origem " + origem + " exportada para " + destino + ".");
    }

    public void analisar() {
        System.out.println("Análise: estátua de " + origem + " com " + idade + " anos de idade.");
    }

    public void pesar() {
        System.out.println("A estátua pesa " + peso + " kg.");
    }

    // Métodos de acesso (getters e setters)
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
