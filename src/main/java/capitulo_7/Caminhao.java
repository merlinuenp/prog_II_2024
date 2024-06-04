
package capitulo_7;


public class Caminhao extends Veiculo {
    private Integer capacidadeCarga;
    
    public Caminhao(){
        super();
        capacidadeCarga = 0;
    }
    
    public Caminhao(String marca, Integer ano, Double valor, Integer capacidadeCarga){
        super(marca, ano, valor);
        this.capacidadeCarga = capacidadeCarga; 
    }
    
    public Double calcularIpva(){
        
        
        if ( 2024 - getAno() > 20){
           return 0.0; 
        }  
        Double imposto = getValor() * 0.04; 
        return imposto; 
    }

    public Integer getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(Integer capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    
    
    
    
}
