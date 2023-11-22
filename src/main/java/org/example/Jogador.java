package org.example;

public abstract class Jogador {
    private int id;
    protected String nome;
    private double tempoJogo;
    private double nota;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempoJogo() {
        return tempoJogo;
    }

    public void setTempoJogo(double tempoJogo) {
        this.tempoJogo = tempoJogo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double calcularDesempenho() {
        double valor = this.nota + (this.tempoJogo / 90);

        // Formatando para duas casas decimais
        valor = Math.round(valor * 100.0) / 100.0;

        return valor;
    }

    public abstract String avaliarDesempenho();

    public String getTipo(){
        return "Jogador";
    }

    public String getInfo(){
        return getTipo() + "{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", nota desempenho=" + this.calcularDesempenho() +
                '}';
    }
}
