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

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public void setQntSocios(int qntSocios) {
        this.qntSocios = qntSocios;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
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

  public int calculaIdade(){
      return anoCriacao - 2019;
  }  
    

    
}
