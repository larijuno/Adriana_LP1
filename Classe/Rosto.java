public class Rosto {

    // Atributos
    private String formato;
    private String pose;
    private String expressao;

    // Construtor
    public Rosto(String formato, String pose, String expressao) {
        this.formato = formato;
        this.pose = pose;
        this.expressao = expressao;
    }

    // Métodos da classe
    public void definir(String novoFormato) {
        this.formato = novoFormato;
        System.out.println("Formato do rosto definido: " + formato + ".");
    }

    public void posar(String novaPose) {
        this.pose = novaPose;
        System.out.println("Rosto posando de " + pose + ".");
    }

    public void escolher(String novaExpressao) {
        this.expressao = novaExpressao;
        System.out.println("Expressão escolhida: " + expressao + ".");
    }

    // Métodos de acesso (getters e setters)
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getPose() {
        return pose;
    }

    public void setPose(String pose) {
        this.pose = pose;
    }

    public String getExpressao() {
        return expressao;
    }

    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }
}
