package Samu;

import java.util.ArrayList;
import java.util.Arrays;

public class Tema {
    private String nome;
    private int id;
    private ArrayList<Ajuda> ajudas;
    private int contadorAjudas;

    public Tema(String nome, int id) {
        this.nome = nome;
        this.id = id;
        ajudas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public void adicionaAjuda(Ajuda ajuda){
        if (ajudas.size() < 10) {
            ajudas.add(ajuda);//atencao para gerencia de arrays
        }
    }

    public int contarAjudas(){
        return contadorAjudas;
    }

    public String toString(){
        return nome + "\n"+
                ajudas.toString();
    }

}