package patterns.observer.example3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManagerPessoa {

    private Map<String, List<Observador>> listeners = new HashMap<>();

    public EventManagerPessoa(List<String> eventos) {
        for (String event : eventos) {
            this.listeners.put(event, new ArrayList<>());
        }
    }

    public void adicionaPessoa(String eventType, Observador observador) {
        var event = listeners.get(eventType);
        if (event.size() == 0) {
            event.add(observador);
        }
    }

    public void pessoaExistente(String eventType, Observador observador) {
        var event = listeners.get(eventType);
        if (event.size() == 0) {
            event.add(observador);
        }
    }

    public void notificar(String eventType, String nomePessoa) {
        var eventList = listeners.get(eventType);
        eventList.forEach(listener -> listener.notifyEvent(nomePessoa));
    }
}
