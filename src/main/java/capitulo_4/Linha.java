
package capitulo_4;

/**
 *
 * @author Usuário
 */
public class Linha {
    
    int comprimento;
    
    public Linha(){
        comprimento = 0;
    }
    
    Linha(int comprimento){
        this.comprimento = comprimento;
    }
    
    void desenhar(){
        System.out.println("\n\n");
        for(int i = 0; i < comprimento; i++){
            System.out.print("_");
        }
        System.out.println("\n\n");
    }
    
}
