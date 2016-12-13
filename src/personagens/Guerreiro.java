
package personagens;


public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int classe){ //TODO chamar método na classe principal de acordo com a classe selecionada
        Personagem personagem = new Personagem();
        personagem.setNome(nome);
        personagem.setClasse(0);
        personagem.setConstituicao(14);
        personagem.setForca(9);
        personagem.setDestreza(11); 
        personagem.setAgilidade(0);
        personagem.setPontos_magia(2);
        personagem.setIndice_protecao(6);
        personagem.setBonus_forca(0);
        personagem.setPeso_suportado(70);
        personagem.setFocus(0);
        personagem.setEsquiva(26);
        personagem.setArma(40);
        //TODO acrescentar itens
        //TODO acrescentar magias
        //TODO acrescentar habilidades
        
        
}
    
public int pocaoCuraNormal() {
    int cura = getPontos_vida() + rolarTeste(3);
    return cura;
}

}
