package Ex2;

import javax.swing.JOptionPane;

public class Produto {
    private String nome;
    private String dt_validade;
    private int qt_estoque;

    public Produto(){

    }
    
    public Produto(String nome, String dt_validade, int qt_estoque){
        this.nome = nome;
        this.dt_validade = dt_validade;
        this.qt_estoque = qt_estoque;
    }
    
    public void setDt_validade(String dt_validade) {
        this.dt_validade = dt_validade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQt_estoque(int qt_estoque) {
        this.qt_estoque = qt_estoque;
    }

    public String getDt_validade() {
        return dt_validade;
    }
    public String getNome() {
        return nome;
    }
    public int getQt_estoque() {
        return qt_estoque;
    }
    
    public void diminuirEstoque(int valor){
        if(valor>qt_estoque){
            JOptionPane.showMessageDialog(null, "Estoque insuficiente("+qt_estoque+")");
        }
        qt_estoque=qt_estoque-valor;
        }


    @Override
    public String toString() {
        return "{Nome: " + getNome() +" |Data de Validade(AAAA/MM/DD): "+ getDt_validade() +" | Estoque: "+getQt_estoque() +"}";
    }

}
