package patterns.observer.example3;

public class PessoaExistenteLogger implements Observador{

    @Override
    public void notifyEvent(String name) {
        System.out.println("Opa! Esta pessoa ja existe! Nome: " + name);
    }
}
