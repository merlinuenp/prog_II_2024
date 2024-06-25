package capitulo_7; 

public class RoboMarciano extends Robo {
    
    public void teletransportar(int x, int y){
        getPonto().setX(x);
        getPonto().setY(y);
    }
    
    public void teletransportar(Ponto novaPosicao){
        setPonto(novaPosicao); 
    }
    
    
    public void resetar(){
        
    }
    
    @Override
    public String toString(){
        return "Sou um robô marciano"; 
    }
}
