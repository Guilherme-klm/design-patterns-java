package patterns.adapter;

public class EnviaSMS implements EnviadorSMS{

    @Override
    public void enviarSMS(String destino, String origem, String[] args) throws Exception {
        System.out.println("Classe Envia SMS");
    }
}
