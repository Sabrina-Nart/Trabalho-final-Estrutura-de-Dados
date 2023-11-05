
package enums;

public enum Venda {
    
    UN("Unidade"),
    KG("Kilograma");
    
    private String descricao;
    
/////////////////
    
    private Venda(String descricao) {
        this.descricao = descricao;
    }
    
/////////////////
    
    @Override
    public String toString() {
        return this.descricao;
    }
    
/////////////////    
}
