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
        if(qt_estoque<=0){
            JOptionPane.showMessageDialog(null, "O produto não pode ser cadastrado sem estoque");
        }else{
        Produto produto=new Produto(nome, dt_validade, qt_estoque);
        if(listaP.pesquisar(produto)!=null){
            JOptionPane.showMessageDialog(null, "Este produto já foi cadastrado");
        } else {
            listaP.inserir(produto);
            JOptionPane.showMessageDialog(null, "O produto foi cadastrado! :)");
        }
    }
    }

    public static void listarP() {

        Lista<Produto> copia= new Lista<Produto>();
        No<Produto> aux=listaP.inicio;
        while(aux!=null){
            copia.inserir(aux.dado);
            aux=aux.dir;
        }

        for(int i=0; i<listaP.total;i++){
            aux=copia.inicio; 
            No<Produto> aux2=aux.dir;      
            while(aux2!=null){
                if(aux.dado.getDt_validade().compareTo(aux.dir.dado.getDt_validade())>=0){
                    aux=aux2;
                }      
                aux2=aux2.dir;
            }
        
            JOptionPane.showMessageDialog(null, aux.dado.toString());
            copia.remover(aux.dado);
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
