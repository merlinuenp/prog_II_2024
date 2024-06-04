
package capitulo_7;


public class Veiculo {
    private String marca;
    private Integer ano;
    private Double valor; 

    public Veiculo() {
        marca = "";
        ano = 0;
        valor = 0.0; 
    }

    public Veiculo(String marca, Integer ano, Double valor) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }
 
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
}
