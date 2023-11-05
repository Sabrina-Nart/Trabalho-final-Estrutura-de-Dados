
package classes;

public class Massa {
    
    private String massa;

    public Massa(){
        this.setMassa("Massa Doce");
    }
    
    public Massa(String massa) {
        this.setMassa(massa);
    }

    public void setMassa(String massa) {
        this.massa = massa.trim().isEmpty() ? "Massa Doce" : massa.toUpperCase();
    }
    
/////////////////    
    
    public String getMassa() {
        return this.massa;
    }
    
/////////////////    
    
    @Override
    public String toString() {
        return this.massa;
    }
       
/////////////////        
}
