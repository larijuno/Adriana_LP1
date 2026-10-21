public class Arvore {

    // Atributos
    private int idade;
    private double altura;
    private String especie;

    // Construtor
    public Arvore(int idade, double altura, String especie) {
        this.idade = idade;
        this.altura = altura;
        this.especie = especie;
    }

    // Métodos da classe
    public void envelhecer() {
        idade++;
        System.out.println("A árvore ficou um ano mais velha: " + idade + " anos.");
    }

    public void crescer() {
        altura += 0.5;
        System.out.println("A árvore cresceu e agora tem " + altura + " m.");
    }

    public void analisar() {
        System.out.println("Análise: " + especie + ", " + idade + " anos, " + altura + " m de altura.");
    }

    // Métodos de acesso (getters e setters)
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
