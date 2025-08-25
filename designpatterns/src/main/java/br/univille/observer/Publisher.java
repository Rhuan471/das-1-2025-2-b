package br.univille.observer;

import java.util.ArrayList;
import java.util.List;

//A interface do Publicador, que é o objeto a ser "observado".

interface Publisher {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers();
}


//A interface do Assinante, que define o método de atualização.

interface Subscriber {
    void update(ConcretePublisher publisher);
}


//Publicador concreto que implementa a interface do Publicador.

class ConcretePublisher implements Publisher {
    private int state = 0;
    private final List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        System.out.println("Publisher: Adicionando assinante...");
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        System.out.println("Publisher: Removendo assinante...");
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        System.out.println("Publisher: Notificando assinantes...");
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    public void someBusinessLogic() {
        System.out.println("\nPublisher: Estou fazendo algo importante.");
        this.state = this.state + 1;
        System.out.println("Publisher: Meu estado mudou para: " + this.state);
        notifySubscribers();
    }

    public int getState() {
        return state;
    }
}


//Um assinante concreto que implementa a interface do Assinante.

class ConcreteSubscriber implements Subscriber {
    @Override
    public void update(ConcretePublisher publisher) {
        System.out.println("Assinante: Recebi uma atualização. O estado do publicador é " + publisher.getState());
    }
}

