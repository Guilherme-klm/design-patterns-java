package patterns.adapter;

public class EnviaSMSDiferenciado implements EnviadorSMS{
    @Override
    public void enviarSMS(String destino, String origem, String[] args) throws Exception {
        System.out.println("Envia SMS Diferenciado");
    }
}
