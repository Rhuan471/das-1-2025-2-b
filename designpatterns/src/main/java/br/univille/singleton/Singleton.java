package br.univille.singleton;

public class Singleton {
    // parece com uma variável global
    private static Singleton instance;

    private Singleton() {
        
    }
    public Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
