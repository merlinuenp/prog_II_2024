package capitulo_8.folha;

public class Operario implements Funcionario {

    private int diasTrabalhados;
    private double salarioDia;

    public Operario(int diasTrabalhados, double salarioDia) {
        this.diasTrabalhados = diasTrabalhados;
        this.salarioDia = salarioDia;
    }

    @Override
    public double calcularSalario() {
        return diasTrabalhados * salarioDia;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public double getSalarioDia() {
        return salarioDia;
    }

    public void setSalarioDia(double salarioDia) {
        this.salarioDia = salarioDia;
    }

}
