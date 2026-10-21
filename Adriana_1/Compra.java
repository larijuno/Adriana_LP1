import java.util.ArrayList;
import java.util.List;

//3-Compra com desconto
//Um supermercado oferece desconto de 10% para compras acima de R$ 100.
//Lucas foi comprar os seguintes itens:
//Arroz (tipo 1, 5 kg)
//Feijão (carioca ou preto, 1 kg a 2 kg)
//Óleo de soja (900 ml)
//Açúcar (refinado ou cristal, 1 kg)
//Café torrado e moído (250 g ou 500 g)
//Macarrão (espaguete ou parafuso, 500 g)
//Farinha de mandioca ou de trigo (1 kg ou 500 g)
//Fubá de milho (500 g)
//Molho ou extrato de tomate (300 g)
//Sal refinado (1 kg)
//Leia o valor da compra. Se o valor for maior que R$ 100, aplique o desconto;
//Caso contrário, mantenha o preço original.
// a listagem do caixa contendo item, quantidade, preço parcial e o valor final a ser pago da compra.

public class Compra {

    public record Item(String descricao, double preco) {}

    private static final double LIMITE_DESCONTO = 100;
    private static final double PERCENTUAL_DESCONTO = 10;

    private final List<String> categorias = new ArrayList<>();
    private final List<List<Item>> opcoes = new ArrayList<>();

    public Compra() {
        adicionar("Arroz",
                new Item("Arroz tipo 1 - 5 kg", 25));

        adicionar("Feijão",
                new Item("Feijão Carioca - 1 kg", 5),
                new Item("Feijão Preto - 1 kg", 6),
                new Item("Feijão Carioca - 2 kg", 9),
                new Item("Feijão Preto - 2 kg", 11));

        adicionar("Óleo de soja",
                new Item("Óleo de soja - 900 ml", 6));

        adicionar("Açúcar",
                new Item("Açúcar Refinado - 1 kg", 4),
                new Item("Açúcar Cristal - 1 kg", 5));

        adicionar("Café",
                new Item("Café torrado e moído - 250 g", 18),
                new Item("Café torrado e moído - 500 g", 32));

        adicionar("Macarrão",
                new Item("Macarrão Espaguete - 500 g", 6),
                new Item("Macarrão Parafuso - 500 g", 6));

        adicionar("Farinha",
                new Item("Farinha de trigo - 500 g", 5),
                new Item("Farinha de mandioca - 500 g", 5),
                new Item("Farinha de trigo - 1 kg", 9),
                new Item("Farinha de mandioca - 1 kg", 10));

        adicionar("Fubá de milho",
                new Item("Fubá de milho - 500 g", 4));

        adicionar("Tomate",
                new Item("Molho de tomate - 300 g", 3),
                new Item("Extrato de tomate - 300 g", 4));

        adicionar("Sal refinado",
                new Item("Sal refinado - 1 kg", 2));
    }

    private void adicionar(String categoria, Item... itens) {
        categorias.add(categoria);
        opcoes.add(List.of(itens));
    }

    int getQuantidadeCategorias() { return categorias.size(); }
    String getCategoria(int categoria) { return categorias.get(categoria); }
    List<Item> getOpcoes(int categoria) { return opcoes.get(categoria); }

    double subtotal(int categoria, int opcao, int quantidade) {
        return opcoes.get(categoria).get(opcao).preco() * quantidade;
    }

    boolean temDesconto(double total) {
        return total > LIMITE_DESCONTO;
    }

    double valorFinal(double total) {
        if (temDesconto(total)) {
            return total - ((total / 100) * PERCENTUAL_DESCONTO);
        }
        return total;
    }
}
