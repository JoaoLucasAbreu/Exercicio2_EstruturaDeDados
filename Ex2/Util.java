package Ex2;

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
            JOptionPane.showMessageDialog(null, "O produto já foi cadastrado");
        } else {
            listaP.inserir(produto);
            JOptionPane.showMessageDialog(null, "O produto foi cadastrado! :)");
        }
    }

    public static void listarP() {
        No<Produto> aux= listaP.inicio;
        for(int i=0; i<listaP.total;i++){
            
        }
        
    }

    public static void venderP() {
        
    }

   
}
