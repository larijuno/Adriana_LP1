public class Parede {

    // Atributos
    private double altura;
    private String material;
    private String textura;

    // Construtor
    public Parede(double altura, String material, String textura) {
        this.altura = altura;
        this.material = material;
        this.textura = textura;
    }

    // Métodos da classe
    public void definir(double novaAltura) {
        this.altura = novaAltura;
        System.out.println("Altura da parede definida em " + altura + " m.");
    }

    public void escolher(String novoMaterial) {
        this.material = novoMaterial;
        System.out.println("Material escolhido para a parede: " + material + ".");
    }

    public void moldar() {
        System.out.println("Parede de " + material + " moldada com textura " + textura + ".");
    }

    // Métodos de acesso (getters e setters)
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }
}
