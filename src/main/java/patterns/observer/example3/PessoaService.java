package patterns.observer.example3;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {

    private EventManagerPessoa event;
    private List<Pessoa> pessoas;

    public PessoaService () {
        this.pessoas = new ArrayList<>();
        this.event = new EventManagerPessoa(List.of("addNewPessoa", "existPessoa"));
    }

    public void addPessoa(String name) {
        if (pessoas.size() == 0) {
            Pessoa newPessoa = new Pessoa(name);
            pessoas.add(newPessoa);
            this.event.adicionaPessoa("addNewPessoa", new CriadoPessoaLogger());
            this.event.notificar("addNewPessoa", newPessoa.getName());
            return;
        }

        for (Pessoa pessoa1 : pessoas) {
            if (pessoa1.getName().equals(name)) {
                this.event.pessoaExistente("existPessoa", new PessoaExistenteLogger());
                this.event.notificar("existPessoa", pessoa1.getName());
                return;
            }
        }

        Pessoa newPessoa = new Pessoa(name);
        this.pessoas.add(newPessoa);
        this.event.adicionaPessoa("addNewPessoa", new CriadoPessoaLogger());
        this.event.notificar("addNewPessoa", newPessoa.getName());
    }
}
