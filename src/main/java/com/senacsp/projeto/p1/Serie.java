package com.senacsp.projeto.p1;

public class Serie {
    private String titulo;
    private String genero;
    private  int anoLancamento;

    public Serie(){
        //construto vazio como padrão
    }

    public Serie(String titulo, String genero, int anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getanoLancamento() {
        return anoLancamento;
    }

    public void setanoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

  
}
