public class Eletronico extends Produto {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        double desconto = preco * porcentagem / 100;
        return preco - desconto;
    }
}
