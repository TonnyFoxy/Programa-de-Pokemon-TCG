package ClasseEntidade;

public class TreinadorCarta extends Carta {
    private CategoriaTreinador treinador;
    private boolean aceSpec;

    public TreinadorCarta() {
        super();
        this.treinador = null;
        this.aceSpec = false;
    }

    public TreinadorCarta(String nome, CategoriaTreinador treinador, boolean aceSpec, String rotacao, String colecao, String code, String raridade, int quantidade) {
        super(nome, colecao, code, raridade, rotacao, quantidade);
        this.treinador = treinador;
        this.aceSpec = aceSpec;
    }

    public CategoriaTreinador getTreinador() {
        return this.treinador;
    }
    public void setTreinador(CategoriaTreinador treinador) {
        this.treinador = treinador;
    }
    public boolean isAceSpec() {
        return this.aceSpec;
    }
    public void setAceSpec(boolean aceSpec) {
        this.aceSpec = aceSpec;
    }

    @Override 
    public String toString() {
        String textoAceSpec = "";
        if (this.aceSpec) {
            textoAceSpec = " / ACE SPEC";
        }
        return "Nome: "+ this.getNome() +
        " | Treinador: "+ this.treinador + textoAceSpec +
        " | Rotação: "+ this.getRotacao() +
        " | Coleção: "+ this.getColecao() +
        " | Quantidade: "+ this.getQuantidade();
    }

}