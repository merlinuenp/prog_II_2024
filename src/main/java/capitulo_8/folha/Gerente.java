package capitulo_8.folha;


public class Gerente implements Funcionario {
    private double salarioMes; 

    public Gerente(double salarioMes) {
        this.salarioMes = salarioMes;
    }
        

    @Override
    public double calcularSalario() {
        return salarioMes * 1.1; 
    
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }
    
    
    
}
