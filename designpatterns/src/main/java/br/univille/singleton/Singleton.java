package br.univille.singleton;

public class Singleton {
    // parece com uma variável global
    private static Singleton instance;
    private String segredo;

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }
    public String getSegredo() {
        return segredo;
    }
    public void setSegredo(String segredo) {
        this.segredo = segredo;
    }
    private Singleton() {
        System.out.println("Singleton: Construtor");
    }
    public static Singleton getInstance(){
        System.out.println("Singleton: get Instance");
        if (instance == null){
            System.out.println("Singleton: NEW");
            instance = new Singleton();
        }
        return instance;
    }

}
