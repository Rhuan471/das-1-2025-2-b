package br.univille.observer;

import javax.swing.GroupLayout;

public class Cliente {
    public static void main(String[] args) {
        var grupoFamilia = new ConcretePublisher();

        var zezinho = new ConcreteSubscriber();
        var huguinho = new ConcreteSubscriber();
        var tia = new ConcreteSubscriber();

        grupoFamilia.subscribe(zezinho);
        grupoFamilia.subscribe(huguinho);
        grupoFamilia.subscribe(tia);

        
        grupoFamilia.setState(123);
    //BOTÃO ENVIAR
    grupoFamilia.notifySubscribers();
    }
}
