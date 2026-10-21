public class Trilha {

    // Atributos
    private double largura;
    private double distancia;
    private String regras;

    // Construtor
    public Trilha(double largura, double distancia, String regras) {
        this.largura = largura;
        this.distancia = distancia;
        this.regras = regras;
    }

    // Métodos da classe
    public void medir() {
        System.out.println("A trilha tem " + distancia + " km de distância e " + largura + " m de largura.");
    }

    public void andar(double km) {
        if (km > distancia) {
            km = distancia;
        }
        System.out.println("Você caminhou " + km + " km de " + distancia + " km.");
    }

    public void acampar() {
        System.out.println("Acampando na trilha. Regras: " + regras + ".");
    }

    // Métodos de acesso (getters e setters)
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }
}
