package app;

public class Time {
    private String nome;
    private String categoria;
    private int anoCriacao = 0;
    private int qntSocios = 0;
    private String historico = "indefinido";

    public Time(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public int getQntSocios() {
        return qntSocios;
    }

    public String getHistorico() {
        return historico;
    }

    

    
}
