import java.util.ArrayList;
import java.util.List;

class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.nome + " adicionado ao estoque.");
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println(produto.nome + " removido do estoque.");
    }

    public void exibirPrecosComDesconto(double porcentagem) {
        for (Produto produto : produtos) {
            produto.exibirInformacoes();
            System.out.println("Preço com desconto: R$ " + produto.calcularDesconto(porcentagem));
            System.out.println();
        }
    }
}

