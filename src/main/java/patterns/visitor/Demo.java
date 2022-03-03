package patterns.visitor;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("NOME");
        cliente.setCpf("CPF");
        cliente.setDataCadastro("DATA");

        Item item = new Item();
        item.setProduto("PRODUTO");
        item.setDataCompra("DATA COMPRA");
        item.setValor("VALOR");

        List<Item> items = Arrays.asList(item);

        Relatorio r = new ComprasCliente(cliente, items);

        FormatoVisitante fv = new VisitanteHTML();
        String resultado = (String) r.gerarRelatorio(fv);
        System.out.println(resultado);
    }
}
