
package classes;

public class NodoMassa {

    private Massa informacao;
    private NodoMassa proximo;
    
    public NodoMassa(Massa informacao){
        this.setInformacao(informacao);
    }
    
////////////////////////////////
    
    public void setInformacao(Massa informacao) {

        this.informacao = informacao == null ? new Massa() : informacao;
    }

    public void setProximo(NodoMassa proximo) {
        this.proximo = proximo;
    }
    
////////////////////////////////
    
    public Massa getInformacao() {
        return this.informacao;
    }

    public NodoMassa getProximo() {
        return this.proximo;
    }
    
////////////////////////////////
    
    @Override
    public String toString() {
        return this.informacao.toString();
    }
    
////////////////////////////////    
}
