package patterns.observer.example3;

public class CriadoPessoaLogger implements Observador {

    @Override
    public void notifyEvent(String name) {
        System.out.println("Nova pessoa foi criado! Nome: " + name);
    }
}
