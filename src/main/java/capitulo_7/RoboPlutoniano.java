package capitulo_7;


public class RoboPlutoniano extends RoboMarciano {
    private Integer balas;
    
    public RoboPlutoniano(){
        super();
        balas = 0; 
    }
    
    public void atirar(){
        if(balas > 0){
            balas--; 
        }
    }
    
    public void recarregar(Integer balas){
        this.balas = balas; 
    }

    public Integer getBalas() {
        return balas;
    }

    public void setBalas(Integer balas) {
        this.balas = balas;
    }
    
    @Override
    public String toString(){
        return "Sou um robô plutoniano"; 
    }
}
