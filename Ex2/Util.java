package Ex2;

import javax.naming.InitialContext;
import javax.swing.JOptionPane;

public class Util {

        static Lista<Produto> listaP= new Lista<Produto>();

    public static void cadastrarP() {
        String dt_validade, nome;
        int qt_estoque;

        nome=JOptionPane.showInputDialog("Insira o nome do produto:");
        dt_validade=JOptionPane.showInputDialog("Insira a data de validade (AAAA/MM/DD):");
        qt_estoque=Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto:"));
        Produto produto=new Produto(nome, dt_validade, qt_estoque);
        if(listaP.pesquisar(produto)!=null){
            JOptionPane.showMessageDialog(null, "Este produto já foi cadastrado");
        } else {
            listaP.inserir(produto);
            JOptionPane.showMessageDialog(null, "O produto foi cadastrado! :)");
        }
    }

    public static void listarP() {
        No<Produto> aux=listaP.inicio;
        for(int i=0; i<listaP.total;i++){
            JOptionPane.showMessageDialog(null, aux.dado.toString());
            aux=aux.dir;
        }
        
    }

    public static void venderP() {
        int valor;
        No<Produto> aux=listaP.inicio;
        String nome;
        boolean achou=false;

        nome=JOptionPane.showInputDialog("Insira o nome do produto");
        while(aux!=null){
        if(aux.dado.getNome().equalsIgnoreCase(nome)){
            Produto produto=aux.dado;
            valor=Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade a ser vendida:"));
            produto.diminuirEstoque(valor);
            if(produto.getQt_estoque()==0){
                listaP.remover(produto);
            }
            achou=true;
            break;
        }
        aux=aux.dir;
    }
        if(achou==false){
            JOptionPane.showMessageDialog(null, "Este produto não foi cadastrado ou esgotou");
        }

        
    }
   
}
