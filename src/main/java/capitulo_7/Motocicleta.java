package capitulo_7;

public class Motocicleta extends Veiculo {
    private Integer cilindradas;
    
    public Motocicleta(){
        super();
        cilindradas = 0;       
    }

    @Override
    public Double calcularIpva(){
      return 1.0;   
    }
    
    
    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    
    
    
    
}
