
package enums;

public enum Recheio {
    
    SR("Sem Recheio"),
    LC("Leite Condensado"),
    DL("Doce de Leite"),
    CC("Creme de Confeiteiro"),
    NU("Nutella"),
    FR("Frango com requeijão cremoso"),
    CE("Cenoura"),
    LI("Limão"),
    GC("Goiabada com coco");
    
    private String descricao;
    
/////////////////    
    
    private Recheio(String descricao) {
        this.descricao = descricao;
    }
    
/////////////////    
    
    @Override
    public String toString() {
        return this.descricao;
    }
    
/////////////////        
}
