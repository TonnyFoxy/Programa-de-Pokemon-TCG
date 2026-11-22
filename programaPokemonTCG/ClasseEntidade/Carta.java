package ClasseEntidade;

import java.util.Objects;

public abstract class Carta {
    private String nome;
    private String colecao;
    private String code;
    private String raridade;
    private String rotacao;
    private int quantidade;

    public Carta(){
        this.nome = "";
        this.colecao = "";
        this.code = "";
        this.raridade = "";
        this.rotacao = "";
        this.quantidade = 0;
    }
    public Carta(String nome, String colecao, String code, String raridade, String rotacao, int quantidade){
        this.nome = nome;
        this.colecao = colecao;
        this.code = code;
        this.raridade = raridade;
        this.rotacao = rotacao;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getColecao() {
        return this.colecao;
    }
    public void setColecao(String colecao) {
        this.colecao = colecao;
    }
    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getRaridade() {
        return this.raridade;
    }
    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }
    public String getRotacao() {
        return this.rotacao;
    }
    public void setRotacao(String rotacao) {
        this.rotacao = rotacao;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override 
    public String toString() {
        return "Carta "+ this.nome +
        " | Coleção: "+ this.colecao + " ("+ this.code+") "+ this.raridade + 
        " | Rotação: "+ this.rotacao +
        " | Quantidade: "+ this.quantidade;
    }

    @Override 
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
        if (obj==null || this.getClass() != obj.getClass()) {
            return false;
        }
        Carta outraCarta = (Carta) obj;
        return Objects.equals(this.nome, outraCarta.nome) && Objects.equals(this.colecao, outraCarta.colecao) && Objects.equals(this.code, outraCarta.code);
    }
    @Override 
    public int hashCode() {
        return Objects.hash(this.nome, this.colecao, this.code);
    }
}