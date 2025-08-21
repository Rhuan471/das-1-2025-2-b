package br.univille.singleton;

public class Cliente {
    public static void main(String[] args) {
        var segredo = "O inter só traz tristeza";

        var singleton = Singleton.getInstance();
        singleton.setSegredo(segredo);

        //mil milhões de anos depois....
        //varias e varias linhas de codigo depois
        System.out.println(
            Singleton.getInstance().getSegredo()
        );
    }
}
