package br.univille.observer;

class ConcreteSubscriber implements Subscriber {
    @Override
    public void update(ConcretePublisher publisher) {
        System.out.println("Assinante: Recebi uma atualização. O estado do publicador é " + publisher.getState());
    }
}

