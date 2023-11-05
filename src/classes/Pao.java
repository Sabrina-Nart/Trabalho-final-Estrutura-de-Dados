
package classes;

import enums.Venda;

public class Pao {
    
    private String nome;
    private Massa massa;
    private Venda venda;
    private double valor;

    public Pao() {
        this.setNome("Pão Francês");
        this.setMassa(null);
        this.setVenda(Venda.KG);
        this.setValor(2.00);
    }
    
    public Pao(String nome, Massa massa, Venda venda, double valor) {
        this.setNome(nome);
        this.setMassa(massa);
        this.setVenda(venda);
        this.setValor(valor);
    }
    
///////////////// 
    
    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "Pão Francês" : nome.toUpperCase();
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public void setValor(double valor) {
        this.valor = valor <= 0 ? 1.00 : valor;
    }
    
///////////////// 
    
    public String getNome() {
        return this.nome;
    }

    public Massa getMassa() {
        return this.massa;
    }

    public Venda getVenda() {
        return this.venda;
    }

    public double getValor() {
        return this.valor;
    }
    
/////////////////    
    
    @Override
    public String toString() {
        return nome;
    }

/////////////////        
}
