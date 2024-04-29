package capitulo_4;

public class Ponto {
    int x;
    int y; 
    
    Ponto(){
        x = 0;
        y = 0;
        System.out.println("Executou o primeiro construtor");
    }
    
    Ponto(int x, int y){
        this.x = x; 
        this.y = y;
        System.out.println("Executou o segundo");
    }
    
    void plotar(){
        System.out.println("x = " + x + ",y = " + y);
    }
    
    void setarXY(int x, int y){
        this.x = x;
        this.y = y; 
    }
    
}
