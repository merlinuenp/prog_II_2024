package capitulo_7;


public class RoboSolar extends Robo {
    private Boolean emitirRaios; 
        
    public RoboSolar(Boolean emitirRaios){
        super();
        this.emitirRaios = emitirRaios; 
    }
    
    public Boolean getEmitirRaios() {
        return emitirRaios;
    }

    public void setEmitirRaios(Boolean emitirRaios) {
        this.emitirRaios = emitirRaios;
    }
    
    public void resetar(){}
    
    @Override
    public String toString(){
        return "Sou um robô solar"; 
    }
    
}
