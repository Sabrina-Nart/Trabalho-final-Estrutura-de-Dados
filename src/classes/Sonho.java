
package classes;

import enums.Venda;
import enums.Recheio;

public class Sonho {

    private String nome;
    private Recheio recheio;
    private Venda venda;
    private double valor;   
 
    public Sonho() {
        this.setNome("Sonho de Padaria");
        this.setRecheio(Recheio.CC);
        this.setVenda(Venda.KG);
        this.setValor(2.00);
    }
    
    public Sonho(String nome, Recheio recheio, Venda venda, double valor) {
        this.setNome(nome);
        this.setRecheio(recheio);
        this.setVenda(venda);
        this.setValor(valor);
    }
    
///////////////// 
    
    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "Sonho de Padaria" : nome.toUpperCase();
    }

    public void setRecheio(Recheio recheio) {
        this.recheio = recheio;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
///////////////// 
    
    public String getNome() {
        return this.nome;
    }

    public Recheio getRecheio() {
        return this.recheio;
    }

    public Venda getVenda() {
        return this.venda;
    }

    public double getValor() {
        return this.valor <= 0 ? 1.00 : valor;
    }
    
///////////////// 
    
    @Override
    public String toString() {
        return nome;
    }

/////////////////     
}
