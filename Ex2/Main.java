package Ex2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String exit;
        

        do {
            exit = JOptionPane.showInputDialog(menu());
        
            switch (exit) {
                case "1":
                    Util.cadastrarP();
                    break;
                case "2":
                    Util.listarP();
                    break;
                case "3":
                 Util.venderP();
                    break;
                case "4":
                    break;
                default:
                   JOptionPane.showMessageDialog(null,"Essa opção não existe");
                    break;
            }
        }while (!exit.equals("4"));

        
       
    }

    public static String menu() {
        String aux = "Escolha uma Opção: \n";
        aux += "1. Cadastrar Produtos \n";
        aux += "2. Listar Produtos \n";
        aux += "3. Vender Produto \n";
        aux += "4. Encerrar Aplicação";
        return aux;
    }

}
