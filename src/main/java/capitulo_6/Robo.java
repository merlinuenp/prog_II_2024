package capitulo_6;

public class Robo {
    private String nome;
    private Ponto ponto; 
    
    public Robo(){
        nome = "";
        ponto = new Ponto(); 
    }
    
    public Robo(String nome, Ponto ponto){
        this.nome = nome;
        this.ponto = ponto; 
    }
    
    public void andarParaDireita(){
        ponto.setX(ponto.getX() + 1);
    }
    
    public String mostrarPosicao(){
        return ("X= "+ ponto.getX() + " Y= " + ponto.getY()); 
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
    
    
    public static void main(String[] args) {
        Robo r = new Robo("Junior" , new Ponto(10,10));
        r.andarParaDireita();
        System.out.println(r.mostrarPosicao());
    }
    
}
