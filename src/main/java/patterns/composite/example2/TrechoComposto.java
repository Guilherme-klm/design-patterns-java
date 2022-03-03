package patterns.composite.example2;

public class TrechoComposto implements TrechoAereo {

    private TrechoAereo primeiro;
    private TrechoAereo segundo;
    private double taxaConexcao;

    public TrechoComposto(TrechoAereo primeiro, TrechoAereo segundo, double taxaConexcao) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.taxaConexcao = taxaConexcao;
        if (!primeiro.getDestino().equals(segundo.getOrigem())) {
            throw new RuntimeException("O destino do primeiro não é igual a origem do segundo");
        }
    }

    @Override
    public String getOrigem() {
        return primeiro.getOrigem();
    }

    @Override
    public String getDestino() {
        return segundo.getDestino();
    }

    @Override
    public double getPreco() {
        return primeiro.getPreco() + segundo.getPreco() + taxaConexcao;
    }
}
