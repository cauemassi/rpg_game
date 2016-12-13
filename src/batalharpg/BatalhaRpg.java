
package batalharpg;

import java.util.Scanner;
import personagens.Personagem;

public class BatalhaRpg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    
    /** Decidi desativar essa parte e usar forms JFrame
    @SuppressWarnings("empty-statement")
    public void criaPersonagem() {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int op;
        String confirma = "";
            
        System.out.println("Digite o nome do seu personagem");
        nome = entrada.next();
        do {
            System.out.println("Escolha a classe");
            System.out.println("1-Guerreiro");
            System.out.println("2-Mago");
            System.out.println("3-Bárbaro");
            System.out.println("4-Ladino");
            op  = entrada.nextInt();
            
            if(op <1 || op >4) {
                System.out.println("Opção inválida! Digite uma opção entre 1 e 4!");
            }
            
        } while(op <1 || op >4);
        
        switch(op) {
            case 1: System.out.println("Você escolheu guerreiro. Confirma? (S/N)");
            
            do {
                if("S".equals(confirma) || "s".equals(confirma)) {                
                    //TODO criar guerreiro
                    break;
                } else {
                    if("N".equals(confirma) || "n".equals(confirma)) {
                        System.out.println("Operação cancelada!");
                        break;
                    } else { 
                    System.out.println("Opção inválida! Digite S ou N");    
                    }
                }
            }
            while(!"S".equals(confirma) || !"s".equals(confirma) || !"N".equals(confirma) || !"n".equals(confirma));
            
            case 2: System.out.println("Você escolheu mago. Confirma? (S/N)");
            
            do {
                if("S".equals(confirma) || "s".equals(confirma)) {                
                    //TODO criar mago
                    break;
                } else {
                    if("N".equals(confirma) || "n".equals(confirma)) {
                        System.out.println("Operação cancelada!");
                        break;
                    } else { 
                    System.out.println("Opção inválida! Digite S ou N");    
                    }
                }
            }
            while(!"S".equals(confirma) || !"s".equals(confirma) || !"N".equals(confirma) || !"n".equals(confirma));

            case 3: System.out.println("Você escolheu ladino. Confirma? (S/N)");
            
            do {
                if("S".equals(confirma) || "s".equals(confirma)) {                
                    //TODO criar ladino
                    break;
                } else {
                    if("N".equals(confirma) || "n".equals(confirma)) {
                        System.out.println("Operação cancelada!");
                        break;
                    } else { 
                    System.out.println("Opção inválida! Digite S ou N");    
                    }
                }
            }
            while(!"S".equals(confirma) || !"s".equals(confirma) || !"N".equals(confirma) || !"n".equals(confirma));
            
            case 4: System.out.println("Você escolheu l. Confirma? (S/N)");
            
            do {
                if("S".equals(confirma) || "s".equals(confirma)) {                
                    //TODO criar ladino
                    break;
                } else {
                    if("N".equals(confirma) || "n".equals(confirma)) {
                        System.out.println("Operação cancelada!");
                        break;
                    } else { 
                    System.out.println("Opção inválida! Digite S ou N");    
                    }
                }
            }
            while(!"S".equals(confirma) || !"s".equals(confirma) || !"N".equals(confirma) || !"n".equals(confirma));
                        
        }
        
            
    } **/

}
