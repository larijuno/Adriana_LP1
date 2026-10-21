public class Desenho {

    // Atributos
    private String textura;
    private String material;
    private String modelo;

    // Construtor
    public Desenho(String textura, String material, String modelo) {
        this.textura = textura;
        this.material = material;
        this.modelo = modelo;
    }

    // Métodos da classe
    public void aplicar(String novaTextura) {
        this.textura = novaTextura;
        System.out.println("Textura " + textura + " aplicada ao desenho em " + material + ".");
    }

    public void alternar(String novoMaterial) {
        this.material = novoMaterial;
        System.out.println("Material alternado para " + material + ".");
    }

    public void referenciar() {
        System.out.println("Desenho baseado no modelo de referência: " + modelo + ".");
    }

    // Métodos de acesso (getters e setters)
    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
