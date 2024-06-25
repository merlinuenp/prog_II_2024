package capitulo_7;

public class Robo {
    private Integer codigo; 
    private String nome;
    private Ponto ponto; 
    
    public Robo(){
        codigo = 0; 
        nome = "";
        ponto = new Ponto(); 
    }
    
    public Robo(Integer codigo, String nome, Ponto ponto){
        this.codigo = codigo; 
        this.nome = nome;
        this.ponto = ponto; 
    }
    
    public void andarParaDireita(){
        ponto.setX(ponto.getX() + 1);
    }
    
    public void andarParaEsquerda(){
        ponto.setX(ponto.getX() - 1);
    }
    
    public void andarParaCima(){
        ponto.setY(ponto.getY() + 1);
    }
    
    public void andarParaBaixo(){
        ponto.setY(ponto.getY() -1);
    }
    
    public String mostrarPosicao(){
        return ("X= "+ ponto.getX() + " Y= " + ponto.getY()); 
    }
    
    
    @Override
    public String toString(){
        return "Sou um robô";
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    
    
}