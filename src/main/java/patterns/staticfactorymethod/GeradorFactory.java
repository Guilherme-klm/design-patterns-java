package patterns.staticfactorymethod;

import patterns.dynamicfactory.Compactador;
import patterns.dynamicfactory.GeradorArquivo;
import patterns.dynamicfactory.GeradorArquivoXML;
import patterns.dynamicfactory.PosProcessador;

public abstract class GeradorFactory {

    public static final String ZIP = "ZIP";
    public static final String CRYPTO = "CRYPTO";

    public static GeradorArquivo criarGeradorXML(String... processadores) {
        GeradorArquivo g = new GeradorArquivoXML();
        g.setPosProcessador(criarProcessador(processadores));
        return g;
    }

    public static GeradorArquivo criarGeradorPropriedades (String... processadores) {
        GeradorArquivo g = new GeradorPropriedades();
        g.setPosProcessador(criarProcessador(processadores));
        return g;
    }

    private static PosProcessador criarProcessador(String... processadores) {
        if (processadores.length > 1) {
            PosProcessadorComposto pp = new PosProcessadorComposto();
            for (String proc : processadores) {
                pp.add(criarProcessador(proc));
            }
        } else if (processadores[0].equals(ZIP)) {
            return new Compactador();
        } else if (processadores[0].equals(CRYPTO)) {
            return new Criptografador();
        }
        return null;
    }
}
