public class ViagemController {

    private final Viagem model;
    private final ViagemView view;

    public ViagemController(Viagem model, ViagemView view) {
        this.model = model;
        this.view = view;
        view.addCalcularListener(e -> calcular());
    }

    private void calcular() {
        double km, preco;
        try {
            km = Tema.lerNumero(view.getKm());
            preco = Tema.lerNumero(view.getPreco());
        } catch (NumberFormatException ex) {
            view.mostrarErro("Digite apenas números (ex.: 650 e 5,89).");
            return;
        }
        if (km <= 0 || preco <= 0) {
            view.mostrarErro("Distância e preço do combustível devem ser maiores que zero.");
            return;
        }

        model.calcular(km, preco);

        StringBuilder sb = new StringBuilder();
        sb.append("Combustível necessário: ").append(Tema.decimal(model.getLitros())).append(" L\n");
        sb.append("Custo da viagem: ").append(Tema.moeda(model.getGasto())).append("\n");
        if (model.temDesconto()) {
            sb.append("\nDesconto de 5% (viagem acima de 500 km): -")
              .append(Tema.moeda(model.getDesconto())).append("\n");
            sb.append("TOTAL COM DESCONTO: ").append(Tema.moeda(model.getTotal()));
        } else {
            sb.append("\nTOTAL: ").append(Tema.moeda(model.getTotal()));
        }
        view.setResultado(sb.toString());
    }

    public void iniciar() {
        view.setVisible(true);
    }
}
