public class Main {
    public static void main(String[] args) {
        Produto tv = new Eletronico("TV LED", 2500.00);
        Produto camiseta = new Vestuario("Camiseta", 100.00);
        Produto celular = new Eletronico("Smartphone", 3000.00);

        Estoque estoque = new Estoque();
        estoque.adicionarProduto(tv);
        estoque.adicionarProduto(camiseta);
        estoque.adicionarProduto(celular);

        System.out.println("Pre;os com desconto de 10%:");
        estoque.exibirPrecosComDesconto(10);

        estoque.removerProduto(celular);
        System.out.println("Preços após remoção de um produto, com desconto de 20%: ");
        estoque.exibirPrecosComDesconto(20);

    }
}