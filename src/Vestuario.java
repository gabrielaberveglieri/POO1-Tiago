public class Vestuario extends Produto {
    public Vestuario(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        double desconto = preco * (porcentagem / 2) / 100;
        return preco - desconto;
    }
}

