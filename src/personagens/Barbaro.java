
package personagens;


public class Barbaro extends Personagem {
    public Barbaro(String nome, int classe){ //TODO chamar método na classe principal de acordo com a classe selecionada
        Personagem personagem = new Personagem();
        personagem.setNome(nome);
        personagem.setClasse(0);
        personagem.setConstituicao(15);
        personagem.setForca(20);
        personagem.setDestreza(10); 
        personagem.setAgilidade(5);
        personagem.setPontos_magia(2);
        personagem.setIndice_protecao(0);
        personagem.setBonus_forca(3);
        personagem.setPeso_suportado(250);
        personagem.setFocus(0);
        personagem.setEsquiva(0);
        personagem.setArma(40);
        //TODO acrescentar itens
        //TODO acrescentar magias
        //TODO acrescentar habilidades
        
        
}
    
public void pocaoForca() {
    setBonus_forca(getBonus_forca() +1);
}
    
}
