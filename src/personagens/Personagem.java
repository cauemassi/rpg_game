
package personagens;

public class Personagem {    
    public String nome;
    public int classe;

    //Atributos
    public int test_clase;
    public int constituicao;
    public int test_constituicao = constituicao*4;
    public int forca;
    public int test_forca = forca*4;
    public int destreza;
    public int test_destreza = destreza*4;
    public int agilidade;
    public int test_agilidade = agilidade*4;
    public int pontos_magia;
    public int pontos_vida = (forca+constituicao)/2 + (forca+constituicao)%2 ; 
    public int indice_protecao; //armadura
    public int bonus_forca; //TODO calcular bônus
    public int focus; //determina o dano do ataque do mago
    //Fim dos atributos
    
    int teste = 0;    
    
    public int atacar(){
        teste = rolarTeste(100);
        if (test_destreza<=teste) {
            /*Se o teste for menor ou igual à destreza, o acerto foi crítico.
            **O dano do acerto crítico é calculado duas vezes e o oponente não 
            **tem chance de ser defender ou esquivar.
            */ 
            if (teste<=destreza) {
               return 2; //Acerto crítico
            } else {
                return 1; //Acerto normal
            } 
        } else {
            return 0; //Errou o ataque!
        }
    }
    
    public boolean defender() {
        teste = rolarTeste(100);
        
        return teste<=test_destreza;
    }
    
    public boolean esquivar() {
        teste = rolarTeste(100);
        
        return teste<=test_agilidade;
    }
    
    public void usarItem() {
        //TODO poção de cura ou afins
    }
    
    public void usarMagia(){        
        //TODO magia para aumento de atributos, invisibilidade, etc;
    }
    
    public int rolarTeste(int faces){ //TODO verificar se a lógica está certa
        int resultado = (int)(Math.random()*faces) + 1;  
        return resultado;
    }
    
    public int calculaDano() {
        int dano = 0;
        switch(classe) {
            case 0: //bárbaro ou guerreiro
                dano = rolarTeste(10) + bonus_forca; 
                break;
            case 1: //mago
                dano = rolarTeste(10*focus); 
                break;
            case 2: //ladino
                dano = rolarTeste(3) + 1;
                break;
            //TODO ver outras classes interessantes
        }
        
        return dano;
    }
    
}
