package capitulo_4;

public class CaixaDeSom {
    boolean ligada;
    int volume;
    
    CaixaDeSom(){
        ligada = false;
        volume = 0;
    }
    
    void ligar(){
        ligada = true;
    }
    
    void desligar(){
        volume = 0;
        ligada = false; 
    }
    
    void aumentarVolume(){
        if(ligada){
            volume++;
        }
    }
    
    void diminuirVolume(){
        if ( !ligada){
            return;
        }
        if ( volume > 0 ){
            volume--; 
        }
    }
    
    
}
