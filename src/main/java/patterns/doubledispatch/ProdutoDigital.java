package patterns.doubledispatch;

public class ProdutoDigital implements Produto{

    @Override
    public void adicionaPropriedade(CarrinhoCompra carrinhoCompra) {
        carrinhoCompra.adicionaPropriedade("PRECO", 1L);
        carrinhoCompra.adicionaPropriedade("DOWNLOAD", 2000L);
    }
}
