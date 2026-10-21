public class CameloController {

    private final Camelo model;
    private final CameloView view;

    public CameloController(Camelo model, CameloView view) {
        this.model = model;
        this.view = view;
        view.addDividirListener(e -> dividir());
    }

    private void dividir() {
        int qtd;
        try {
            qtd = Integer.parseInt(view.getQtd().trim());
        } catch (NumberFormatException ex) {
            view.mostrarErro("Digite a quantidade de camelos como um número inteiro.");
            return;
        }
        if (qtd <= 0) {
            view.mostrarErro("A quantidade de camelos deve ser maior que zero.");
            return;
        }

        model.dividir(qtd);

        String quebraLinha = System.lineSeparator();
        view.setResultado(
                "O irmão mais velho receberá " + model.getIrmao1() + " camelos" + quebraLinha +
                "O irmão do meio receberá " + model.getIrmao2() + " camelos" + quebraLinha +
                "O irmão mais novo receberá " + model.getIrmao3() + " camelos" + quebraLinha + quebraLinha +
                "Sobra para o matemático " + model.getSobra() + " camelo(s)");
    }

    public void iniciar() {
        view.setVisible(true);
    }
}
