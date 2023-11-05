
package classes;

public class NodoSonho {

    private Sonho informacao;
    private NodoSonho proximo;
    
    public NodoSonho(Sonho informacao){
        this.setInformacao(informacao);
    }
    
////////////////////////////////
    
    public void setInformacao(Sonho informacao) {

        this.informacao = informacao == null ? new Sonho() : informacao;
    }

    public void setProximo(NodoSonho proximo) {
        this.proximo = proximo;
    }
    
////////////////////////////////
    
    public Sonho getInformacao() {
        return this.informacao;
    }

    public NodoSonho getProximo() {
        return this.proximo;
    }
    
////////////////////////////////
    
    @Override
    public String toString() {
        return this.informacao.toString();
    }
    
}
