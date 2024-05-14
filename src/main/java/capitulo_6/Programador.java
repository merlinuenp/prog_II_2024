package capitulo_6;

public class Programador {
    private String nome;
    private Double salarioMensal;
    private Integer horasExtras; 
    
    public Programador(){
        nome = "";
        salarioMensal = 0.0; 
        horasExtras = 0; 
    }

    public Programador(String nome, Double salarioMensal, Integer horasExtras) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
        this.horasExtras = horasExtras;
    }
    
      
    public Double calcularSalario(Double valorHoraExtra){
        return (salarioMensal + (horasExtras * valorHoraExtra));
    }
    
    public void setNome(String nome){
        this.nome = nome; 
    }
    
    public String getNome(){
        return nome; 
    }
    
    public void setSalarioMensal(Double salarioMensal){
        this.salarioMensal = salarioMensal;
    }
    
    public Double getSalarioMensal(){
        return salarioMensal; 
    }
    
    
    public void setHorasExtras(Integer horasExtras){
        this.horasExtras = horasExtras;  
    }
    
    public Integer getHorasExtras(){
        return horasExtras; 
    }
    
}
