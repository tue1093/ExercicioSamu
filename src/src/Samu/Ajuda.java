package Samu;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ajuda {
    private String descricao;
    private String autor;
    private int apoio;
    private int id;
    private ArrayList<MensagemApoio> mensagens;
    private int contadorMensagens;

    public Ajuda(String descricao, String nome, int id) {
        this.descricao = descricao;
        autor = nome;
        this.id = id;
        mensagens = new ArrayList<>();
    }

    public void incrementaApoio(){
        apoio++;
    }

    @Override
    public String toString() {
        return descricao + " - " + autor + " - " + apoio;
    }

    public String exibirMensagens() {
        return mensagens.toString();
    }

    public void adicionaMensagem(String descricao, String autor) {
        MensagemApoio m = new MensagemApoio(descricao, autor);

        if (mensagens.size() < 5) {
            mensagens.add(m);
        }
    }


}