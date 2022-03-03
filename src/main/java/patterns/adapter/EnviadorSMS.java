package patterns.adapter;

public interface EnviadorSMS {

    void enviarSMS(String destino, String origem, String[] args) throws Exception;
}
