package patterns.staticfactorymethod;

import patterns.dynamicfactory.GeradorArquivo;
import patterns.dynamicfactory.PosProcessador;

public class GeradorPropriedades extends GeradorArquivo {

    private PosProcessador posProcessador;

    @Override
    public void setPosProcessador(PosProcessador posProcessador) {
        this.posProcessador = posProcessador;
    }
}
