
package classes;

public class ListaSonho {
    
    private NodoSonho primeiro;
    private NodoSonho ultimo;
    
    public ListaSonho(){
        this.inicializar();
    }

    public NodoSonho getPrimeiro() {
        return primeiro;
    }

    public NodoSonho getUltimo() {
        return ultimo;
    }

    private void inicializar(){
        this.primeiro = null; 
        this.ultimo = null;
    }
    
    public boolean estaVazia(){
        return this.primeiro == null;
    }
    
    private void incluirFinal(NodoSonho novo){
        if (estaVazia()){
            this.primeiro = novo;
            this.ultimo = novo;
            
            this.ultimo.setProximo(null);
            return;
        }
        
        novo.setProximo(null);

        this.ultimo.setProximo(novo);
        this.ultimo = novo;
    }
    
//////////////////////////////////////////////////////////////////////////////////////////
    //INCLUIR NO INÍCIO

    private void incluirInicio(NodoSonho novo) {
        if (estaVazia()){
            this.primeiro = novo;
            this.ultimo = novo;
            
            this.ultimo.setProximo(null);
            
            return; 
        }

        novo.setProximo(this.primeiro);
        
        this.primeiro = novo;
        
    }
    
//////////////////////////////////////////////////////////////////////////////////////////
    //INCLUIR NO MEIO 
    
    public void incluirOrdenado(NodoSonho novo){
        if (estaVazia()){
            this.primeiro = novo;
            this.ultimo = novo;
            
            this.ultimo.setProximo(null);
            
            return; 
        }

        if (novo.getInformacao().getNome().compareTo(this.primeiro.getInformacao().getNome()) <= 0){
        
            this.incluirInicio(novo);
            return;
        }
        
        if (novo.getInformacao().getNome().compareTo(this.ultimo.getInformacao().getNome()) >= 0){
            this.incluirFinal(novo);
            return;
        }
        
        NodoSonho anterior = this.primeiro; 
        NodoSonho sucessor = this.primeiro.getProximo(); 
        
        while (novo.getInformacao().getNome().compareTo(sucessor.getInformacao().getNome()) >= 0){
            anterior = anterior.getProximo();
            sucessor = sucessor.getProximo();
        }
        novo.setProximo(sucessor);
        anterior.setProximo(novo); 
    }
    
//////////////////////////////////////////////////////////////////////////////////////////
    //Remover (início, final, intermediário)
    
    private void removerInicio(){
        if (estaVazia()){
            return;
        }

        if (this.primeiro.equals(this.ultimo)){

            this.inicializar();
            System.gc();
            return;
        }
        
        this.primeiro = this.primeiro.getProximo();
        System.gc();
        return;
    }
    
    //Remover último
    private void removerFinal(){
        if (estaVazia()){
            return;
        }

        if (this.primeiro.equals(this.ultimo)){

            this.inicializar();
            System.gc();
            return;
        }
        //Encontrar o penúltimo
        NodoSonho percorre = this.primeiro;
        while (!percorre.getProximo().equals(this.ultimo)){
            percorre = percorre.getProximo();
        }
        percorre.setProximo(null);
        this.ultimo = percorre;
        System.gc();
    }
    
    //Remover elemento intermediário
    public boolean removerOrdenado(String remover){

        NodoSonho retorno = this.procura(remover);
     
        if (retorno == null){
            return false;
        }
        
        if (retorno.equals(this.primeiro)){
            this.removerInicio();
            return true;
        }
        
        if (retorno.equals(this.ultimo)){
            this.removerFinal();
            return true;
        }

        NodoSonho anterior = this.primeiro;
        while (!anterior.getProximo().equals(retorno)){
            anterior = anterior.getProximo();
        }
        anterior.setProximo(retorno.getProximo());
        retorno = null;
        System.gc();
        return true;
    }
    
    //Procurar
    public NodoSonho procura(String busca){
        NodoSonho percorre = this.primeiro;
        while((percorre != null) && (!percorre.getInformacao().getNome().equals(busca))){
            percorre = percorre.getProximo();
        }
        return percorre;
    }
    
//////////////////////////////////////////////////////////////////////////////////////////

}
