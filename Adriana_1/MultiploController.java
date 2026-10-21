public class MultiploController {

    private final Multiplo model;
    private final MultiploView view;

    public MultiploController(Multiplo model, MultiploView view) {
        this.model = model;
        this.view = view;
        view.addVerificarListener(e -> verificar());
    }

    private void verificar() {
        try {
            int num1 = Integer.parseInt(view.getNum1().trim());
            int num2 = Integer.parseInt(view.getNum2().trim());
            view.setResultado(model.verificar(num1, num2));
        } catch (NumberFormatException ex) {
            view.mostrarErro("Digite apenas números inteiros nos dois campos.");
        }
    }

    public void iniciar() {
        view.setVisible(true);
    }
}
