package ClasseEntidade;

public class PokemonCarta extends Carta {
    private String tipoEspecial;
    private String tipagem;
    private int ps;
    private String estagio;
    private boolean habilidade;
    private boolean fullArt;

    public PokemonCarta() {
        super();
        this.tipoEspecial = "";
        this.tipagem = "";
        this.ps = 0;
        this.estagio = "";
        this.habilidade = false;
        this.fullArt = false;
    }
    public PokemonCarta(String nome, String tipoEspecial, boolean fullArt, String tipagem, int ps, String estagio, boolean habilidade, String rotacao, String colecao, String code, String raridade, int quantidade) {
        super(nome, colecao, code, raridade, rotacao, quantidade);
        this.tipoEspecial = tipoEspecial;
        this.tipagem = tipagem;
        this.ps = ps;
        this.estagio = estagio;
        this.habilidade = habilidade;
        this.fullArt = fullArt;
    }
    
    public String getTipoEspecial() {
        return this.tipoEspecial;
    }
    public void setTipoEspecial(String tipoEspecial) {
        this.tipoEspecial = tipoEspecial;
    }
    public String getTipagem() {
        return this.tipagem;
    }
    public void setTipagem(String tipagem) {
        this.tipagem = tipagem;
    }
    public int getPs() {
        return this.ps;
    }
    public void setPs(int ps) {
        this.ps = ps;
    }
    public String getEstagio() {
        return this.estagio;
    }
    public void setEstagio(String estagio) {
        this.estagio = estagio;
    }
    public boolean isHabilidade() {
        return this.habilidade;
    }
    public void setHabilidade(boolean habilidade) {
        this.habilidade = habilidade;
    }
    public boolean isFullArt() {
        return this.fullArt;
    }
    public void setFullArt(boolean fullArt) {
        this.fullArt = fullArt;
    }

    @Override 
    public String toString() {
        String textoEspecial = "";
        if (this.tipoEspecial != null && !this.tipoEspecial.isEmpty()) {
            textoEspecial = " / " + this.tipoEspecial;
        }

        String textoHabilidade = "";
        if (this.habilidade) {
            textoHabilidade = " | Habilidade: Sim"+ this.habilidade;
        }

        String textoFullArt = "";
        if (this.fullArt) {
            textoFullArt = " | FullArt: Sim"+ this.fullArt;
        }
        return "Pokémon: "+ this.getNome() + textoEspecial + textoFullArt +
        " | tipagem: "+ this.tipagem +
        " | PS: "+ this.ps +
        " | Estágio: "+ this.estagio + textoHabilidade +
        " | Rotação: "+ this.getRotacao() +
        " | Coleção: "+ this.getColecao() +" ("+ this.getCode() +") "+ this.getRaridade() +
        " | Quantidade: "+ this.getQuantidade();
    }
}