public class Arara {

    // Atributos
    private int cabides;
    private double comprimento;
    private String material;

    // Construtor
    public Arara(int cabides, double comprimento, String material) {
        this.cabides = cabides;
        this.comprimento = comprimento;
        this.material = material;
    }

    // Métodos da classe
    public void pendurar() {
        if (cabides > 0) {
            cabides--;
            System.out.println("Roupa pendurada. Cabides restantes: " + cabides);
        } else {
            System.out.println("Não há cabides disponíveis na arara.");
        }
    }

    public void organizar() {
        System.out.println("Arara de " + comprimento + " m organizada por tipo de roupa.");
    }

    public void limpar() {
        System.out.println("Arara de " + material + " limpa.");
    }

    // Métodos de acesso (getters e setters)
    public int getCabides() {
        return cabides;
    }

    public void setCabides(int cabides) {
        this.cabides = cabides;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
