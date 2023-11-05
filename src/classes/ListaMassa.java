
package classes;

public class ListaMassa {
    
    private NodoMassa primeiro;
    private NodoMassa ultimo;
    
    public ListaMassa(){
        this.inicializar();
    }

    public NodoMassa getPrimeiro() {
        return primeiro;
    }

    public NodoMassa getUltimo() {
        return ultimo;
    }
    
    //Inicializar
    private void inicializar(){
        
        this.primeiro = null; 
        this.ultimo = null;
    }
    
    //Ver se está vázia
    public boolean estaVazia(){
        
        return this.primeiro == null;
    }

    private void incluirFinal(NodoMassa novo){
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
    
    private void incluirInicio(NodoMassa novo) {
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
    
    //INCLUIR NO MEIO - ENTRE UM ELEMENTO E OUTRO
    //INCLUIR ORDENADAMENTE

    public void incluirOrdenado(NodoMassa novo){
        if (estaVazia()){
            this.primeiro = novo;
            this.ultimo = novo;
           
            this.ultimo.setProximo(null);
           
            return; 
        }

        if (novo.getInformacao().getMassa().compareTo(this.primeiro.getInformacao().getMassa()) <= 0){

            this.incluirInicio(novo);
            return;
        }
        
        if (novo.getInformacao().getMassa().compareTo(this.ultimo.getInformacao().getMassa()) >= 0){
            this.incluirFinal(novo);
            return;
        }
        
        NodoMassa anterior = this.primeiro; 
        NodoMassa sucessor = this.primeiro.getProximo(); 
        
        while (novo.getInformacao().getMassa().compareTo(sucessor.getInformacao().getMassa()) >= 0){
            anterior = anterior.getProximo();
            sucessor = sucessor.getProximo();
        }
        novo.setProximo(sucessor);
        anterior.setProximo(novo); 
    }
//////////////////////////////////////////////////////////////////////////////////////////
    
    //Remover (início, final, intermediário)
    
    //Remover início
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
        NodoMassa percorre = this.primeiro;
        while (!percorre.getProximo().equals(this.ultimo)){
            percorre = percorre.getProximo();
        }
        percorre.setProximo(null);
        this.ultimo = percorre;
        System.gc();
    }
    
    //Remover elemento intermediário
    public boolean removerOrdenado(String remover){

        NodoMassa retorno = this.procura(remover);
        
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

        NodoMassa anterior = this.primeiro;
        while (!anterior.getProximo().equals(retorno)){
            anterior = anterior.getProximo();
        }
        anterior.setProximo(retorno.getProximo());
        retorno = null;
        System.gc();
        return true;
    }
    
    //Procurar
    public NodoMassa procura(String busca){
        NodoMassa percorre = this.primeiro;
        while((percorre != null) && (!percorre.getInformacao().getMassa().equals(busca))){
            percorre = percorre.getProximo();
        }

        return percorre;
    }
    
//////////////////////////////////////////////////////////////////////////////////////////
    
}
