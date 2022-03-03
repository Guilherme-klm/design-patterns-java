package patterns.observer.example1;

public class Executavel {

    public static void main(String[] args) throws InterruptedException {
        GraficoBarras graficoBarras = new GraficoBarras();
        AcoesLogger acoesLogger = new AcoesLogger();
        CarteiraAcoes carteiraAcoes = new CarteiraAcoes();
        carteiraAcoes.addObservador(graficoBarras);
        carteiraAcoes.addObservador(acoesLogger);

        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("COMP02", 200);
        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("EMP34", 400);
        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("ACDF89", 300);
        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("EMP34", -200);
        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("COMP02", 150);
    }
}
