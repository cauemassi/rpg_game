
package personagens;

public class Personagem {    
    private String nome;
    private int classe;

    //Atributos
    private int constituicao;
    final int test_constituicao;
    private int forca;
    final int test_forca;
    private int destreza;
    final int test_destreza;
    private int agilidade;
    final int test_agilidade;
    private int pontos_magia; //Também serão usados para contar as poções no inventário
    private int pontos_vida; 
    private int indice_protecao; //armadura TODO colocar na defesa
    private int bonus_forca;
    private int peso_suportado;
    private int esquiva;
    private int arma;
    private int focus; //determina o dano do ataque do mago
    //Fim dos atributos
    
    int teste = 0;    

    public Personagem() {
        this.test_constituicao = constituicao*4;
        this.test_forca = forca*4;
        this.test_agilidade = agilidade+esquiva;
        this.test_destreza = destreza+arma;
        this.pontos_vida= (forca+constituicao)/2 + (forca+constituicao)%2;
    }
    
    public int atacar(){
        teste = rolarTeste(100);
        if (getTest_destreza()<=teste) {
            /*Se o teste for menor ou igual à destreza, o acerto foi crítico.
            **O dano do acerto crítico é calculado duas vezes e o oponente não 
            **tem chance de ser defender ou esquivar.
            */ 
            if (teste<=getDestreza()) {
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
        
        return teste<=getTest_destreza();
    }
    
    public boolean esquivar() {
        teste = rolarTeste(100);
        
        return teste<=getTest_agilidade(); 
    }
    
    //Os métodos de itens e magias foram movidos para as respectivas classes.

    public int rolarTeste(int faces){ //TODO verificar se a lógica está certa
        int resultado = (int)(Math.random()*faces) + 1;  
        return resultado;
    }
    
    public int calculaDano() {
        int dano = 0;
        switch(getClasse()) {
            case 0: //bárbaro ou guerreiro
                dano = rolarTeste(10) + getBonus_forca() - getIndice_protecao(); //TODO pegar o índice de proteção do oponente. Ver como faz
                break;
            case 1: //mago
                dano = rolarTeste(10) + getFocus() - getIndice_protecao(); 
                break;
            case 2: //ladino
                dano = rolarTeste(3) + 1 + getBonus_forca() - getIndice_protecao();
                break;
            //TODO ver outras classes interessantes
        }
        
        return dano;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the classe
     */
    public int getClasse() {
        return classe;
    }

    /**
     * @param classe the classe to set
     */
    public void setClasse(int classe) {
        this.classe = classe;
    }
    
    /**
     * @return the constituicao
     */
    public int getConstituicao() {
        return constituicao;
    }

    /**
     * @param constituicao the constituicao to set
     */
    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    /**
     * @return the test_constituicao
     */
    public int getTest_constituicao() {
        return test_constituicao;
    }

    /**
     * @return the forca
     */
    public int getForca() {
        return forca;
    }

    /**
     * @param forca the forca to set
     */
    public void setForca(int forca) {
        this.forca = forca;
    }

    /**
     * @return the test_forca
     */
    public int getTest_forca() {
        return test_forca;
    }

    /**
     * @return the destreza
     */
    public int getDestreza() {
        return destreza;
    }

    /**
     * @param destreza the destreza to set
     */
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    /**
     * @return the test_destreza
     */
    public int getTest_destreza() {
        return test_destreza;
    }

    /**
     * @return the agilidade
     */
    public int getAgilidade() {
        return agilidade;
    }

    /**
     * @param agilidade the agilidade to set
     */
    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    /**
     * @return the test_agilidade
     */
    public int getTest_agilidade() {
        return test_agilidade;
    }

    /**
     * @return the pontos_magia
     */
    public int getPontos_magia() {
        return pontos_magia;
    }

    /**
     * @param pontos_magia the pontos_magia to set
     */
    public void setPontos_magia(int pontos_magia) {
        this.pontos_magia = pontos_magia;
    }

    /**
     * @return the pontos_vida
     */
    public int getPontos_vida() {
        return pontos_vida;
    }

    /**
     * @return the indice_protecao
     */
    public int getIndice_protecao() {
        return indice_protecao;
    }

    /**
     * @param indice_protecao the indice_protecao to set
     */
    public void setIndice_protecao(int indice_protecao) {
        this.indice_protecao = indice_protecao;
    }

    /**
     * @return the bonus_forca
     */
    public int getBonus_forca() {
        return bonus_forca;
    }

    /**
     * @param bonus_forca the bonus_forca to set
     */
    public void setBonus_forca(int bonus_forca) {
        this.bonus_forca = bonus_forca;
    }

    /**
     * @return the focus
     */
    public int getFocus() {
        return focus;
    }

    /**
     * @param focus the focus to set
     */
    public void setFocus(int focus) {
        this.focus = focus;
    }

    /**
     * @return the esquiva
     */
    public int getEsquiva() {
        return esquiva;
    }

    /**
     * @param esquiva the esquiva to set
     */
    public void setEsquiva(int esquiva) {
        this.esquiva = esquiva;
    }

    /**
     * @return the arma
     */
    public int getArma() {
        return arma;
    }

    /**
     * @param arma the arma to set
     */
    public void setArma(int arma) {
        this.arma = arma;
    }

    /**
     * @return the peso_suportado
     */
    public int getPeso_suportado() {
        return peso_suportado;
    }

    /**
     * @param peso_suportado the peso_suportado to set
     */
    public void setPeso_suportado(int peso_suportado) {
        this.peso_suportado = peso_suportado;
    }

    /**
     * @param pontos_vida the pontos_vida to set
     */
    public void setPontos_vida(int pontos_vida) {
        this.pontos_vida = pontos_vida;
    }
    
}
