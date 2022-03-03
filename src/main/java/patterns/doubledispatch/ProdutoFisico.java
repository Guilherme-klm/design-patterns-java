package patterns.doubledispatch;

public class ProdutoFisico implements Produto {

    @Override
    public void adicionaPropriedade(CarrinhoCompra carrinhoCompra) {
        carrinhoCompra.adicionaPropriedade("PREÇO", 300L);
        carrinhoCompra.adicionaPropriedade("VOLUME", 10L);
        carrinhoCompra.adicionaPropriedade("PESO", 1L);
    }
}
