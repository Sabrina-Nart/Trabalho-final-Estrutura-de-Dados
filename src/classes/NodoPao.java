
package classes;

public class NodoPao {

    private Pao informacao;
    private NodoPao proximo;
    
    public NodoPao(Pao informacao){
        this.setInformacao(informacao);
    }
    
////////////////////////////////
    
    public void setInformacao(Pao informacao) {

        this.informacao = informacao == null ? new Pao() : informacao;
    }
    
    public void setProximo(NodoPao proximo) {
        this.proximo = proximo;
    }
    
////////////////////////////////
    
    public Pao getInformacao() {
        return this.informacao;
    }

    public NodoPao getProximo() {
        return this.proximo;
    }
    
////////////////////////////////
    
    @Override
    public String toString() {
        return this.informacao.toString();
    }
    
}
