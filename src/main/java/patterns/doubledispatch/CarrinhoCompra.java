package patterns.doubledispatch;

public class CarrinhoCompra {

    public void adicionarProduto(Produto produto) {
        produto.adicionaPropriedade(this);
    }

    public void adicionaPropriedade(String prop, Long value) {

    }
}
