package Ex2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String exit;
        

        do {
            exit = JOptionPane.showInputDialog(menu());
        
            switch (exit) {
                case "1":
                    Util.reservar();
                    break;
                case "2":
                    Util.pesquisar();
                    break;
                case "3":
                 Util.imprimirReserva();
                    break;
                case "4":
                  Util.imprimirEspera();
                    break;
                case "5":
                  Util.cancelar();
                    break;
                case "6":
                    break;
                default:
                   JOptionPane.showMessageDialog(null,"Essa opção não existe");
                    break;
            }
        }while (!exit.equals("6"));

        
       
    }

    public static void menu() {
        
    }

}
