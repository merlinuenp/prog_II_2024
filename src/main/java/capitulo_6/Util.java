
package capitulo_6;


public class Util {
    
    
    public static int calcular(String operacao, int ... v){
        int retorno = 0;         
        if (operacao.equalsIgnoreCase("SOM")){
            int soma = 0;
            for(int i : v){
                soma += i; 
            }
            retorno = soma; 
        }
        
        return retorno; 
    }
    
    
    public static void main(String[] args) {
       int soma = calcular("SOM", 1, 3, 60, 20,34);
        System.out.println(soma);
        
    }
    
    
    
    
}
