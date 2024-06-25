package capitulo_7;

public class Circulo {
    private Ponto ponto;
    private Integer raio;
    
    
    public Circulo(){
        this.ponto = new Ponto(0, 0);
        this.raio = 1;
    }
    
    public Circulo(Ponto ponto, Integer raio){
        this.ponto = ponto;
        this.raio = raio; 
    }
   
    
    
    public Circulo(Integer x, Integer y, Integer raio){
        this.ponto = new Ponto(x, y);
        this.raio = raio; 
    }
    
    
    

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public Integer getRaio() {
        return raio;
    }

    public void setRaio(Integer raio) {
        this.raio = raio;
    }
       
    
    
    
}
