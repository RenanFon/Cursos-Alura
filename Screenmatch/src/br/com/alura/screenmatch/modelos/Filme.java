package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String Diretor;

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        this.Diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) obterMediaDasAvaliacoes() / 2;
    }
}
