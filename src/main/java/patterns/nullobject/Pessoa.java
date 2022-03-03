package patterns.nullobject;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public int getIdade() {
        return idade;
    }
}
