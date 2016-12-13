
package personagens;


public class Ladino extends Personagem {
    public Ladino(String nome, int classe){ //TODO chamar método na classe principal de acordo com a classe selecionada
        Personagem personagem = new Personagem();
        personagem.setNome(nome);
        personagem.setClasse(2);
        personagem.setConstituicao(5);
        personagem.setForca(5);
        personagem.setDestreza(19); 
        personagem.setAgilidade(20);
        personagem.setPontos_magia(2);
        personagem.setIndice_protecao(1);
        personagem.setBonus_forca(-1);
        personagem.setPeso_suportado(50);
        personagem.setFocus(0);
        personagem.setEsquiva(60);
        personagem.setArma(40);
        //TODO acrescentar itens
        //TODO acrescentar magias
        //TODO acrescentar habilidades
        
        
}

public void pocaoCuraTotal() {
    setPontos_vida((getForca() + getConstituicao())/2 + (getForca() + getConstituicao())%2);
}


    
}
