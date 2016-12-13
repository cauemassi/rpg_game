
package personagens;


public class Mago extends Personagem {
    public Mago(String nome, int classe){ //TODO chamar método na classe principal de acordo com a classe selecionada
        Personagem personagem = new Personagem();
        personagem.setNome(nome);
        personagem.setClasse(1);
        personagem.setConstituicao(5);
        personagem.setForca(5);
        personagem.setDestreza(20); 
        personagem.setAgilidade(20);
        personagem.setPontos_magia(5);
        personagem.setIndice_protecao(0);
        personagem.setBonus_forca(-1);
        personagem.setPeso_suportado(50);
        personagem.setFocus(2);
        personagem.setEsquiva(0);
        personagem.setArma(30); //cajado
        //TODO acrescentar itens
        //TODO acrescentar magias
        //TODO acrescentar habilidades

}
         
public void protecaoMagica() {
     setIndice_protecao(getIndice_protecao() + getFocus());
     setPontos_magia(getPontos_magia()-1);
}    

public void curaMagica() {
    setPontos_vida(getPontos_vida() + 1);
    setPontos_magia(getPontos_magia()-1);
}

}
