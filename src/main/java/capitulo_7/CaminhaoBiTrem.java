package capitulo_7;


public class CaminhaoBiTrem extends Caminhao {
    private Integer capacidadeAdicional;
    
    public CaminhaoBiTrem(){
        super();
        capacidadeAdicional = 0; 
    }
    
    public CaminhaoBiTrem(String marca, 
            Integer ano, Double valor, Integer capacidadeCarga, 
            Integer capacidadeAdicional){
        super(marca, ano, valor, capacidadeCarga);
        capacidadeAdicional = 0; 
    }
    
    
    @Override
    public Double calcularIpva(){
        if ( 2024 - getAno() > 20 ){
            return 0.0;
        }
        return getValor() * 0.045;
    }
    

    public Integer getCapacidadeAdicional() {
        return capacidadeAdicional;
    }

    public void setCapacidadeAdicional(Integer capacidadeAdicional) {
        this.capacidadeAdicional = capacidadeAdicional;
    }
    
    
    
    
}
