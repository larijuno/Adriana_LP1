import java.util.ArrayList;
import java.util.List;

public class CompraController {

    private final Compra model;
    private final CompraView view;

    public CompraController(Compra model, CompraView view) {
        this.model = model;
        this.view = view;

        List<String> categorias = new ArrayList<>();
        List<List<String>> rotulos = new ArrayList<>();
        for (int c = 0; c < model.getQuantidadeCategorias(); c++) {
            categorias.add(model.getCategoria(c));
            List<String> linha = new ArrayList<>();
            for (Compra.Item item : model.getOpcoes(c)) {
                linha.add(item.descricao() + "  |  " + Tema.moeda(item.preco()));
            }
            rotulos.add(linha);
        }
        view.montarCatalogo(categorias, rotulos);

        view.addAlteracaoListener(this::atualizarSubtotais);
        view.addFinalizarListener(e -> finalizar());
        view.addLimparListener(e -> view.limpar());
    }

    private void atualizarSubtotais() {
        for (int i = 0; i < view.getQuantidadeLinhas(); i++) {
            double sub = model.subtotal(i, view.getOpcao(i), view.getQuantidade(i));
            view.setSubtotal(i, Tema.moeda(sub));
        }
    }

    private void finalizar() {
        StringBuilder sb = new StringBuilder();
        double total = 0;
        boolean vazio = true;

        sb.append("======= CUPOM DO CAIXA =======\n\n");
        for (int i = 0; i < view.getQuantidadeLinhas(); i++) {
            int qtd = view.getQuantidade(i);
            if (qtd > 0) {
                Compra.Item item = model.getOpcoes(i).get(view.getOpcao(i));
                double sub = model.subtotal(i, view.getOpcao(i), qtd);
                total += sub;
                vazio = false;

                sb.append(item.descricao()).append("\n");
                sb.append("  ").append(qtd).append(" x ").append(Tema.moeda(item.preco()))
                  .append(" = ").append(Tema.moeda(sub)).append("\n");
            }
        }

        if (vazio) {
            view.mostrarErro("Adicione pelo menos um item ao carrinho.");
            return;
        }

        sb.append("\n------------------------------\n");
        sb.append("Total: ").append(Tema.moeda(total)).append("\n");
        if (model.temDesconto(total)) {
            sb.append("Desconto de 10%: -").append(Tema.moeda(total - model.valorFinal(total))).append("\n");
        } else {
            sb.append("Sem desconto (até R$ 100,00)\n");
        }
        sb.append("\nTOTAL A PAGAR: ").append(Tema.moeda(model.valorFinal(total)));

        view.setRecibo(sb.toString());
    }

    public void iniciar() {
        view.setVisible(true);
    }
}
