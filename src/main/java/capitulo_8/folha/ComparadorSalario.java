
package capitulo_8.folha;

import java.util.Comparator;


public class ComparadorSalario implements Comparator<Funcionario> { 

    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        if (f1.calcularSalario() < f2.calcularSalario()){
            return -1;
        }
        if (f1.calcularSalario() == f2.calcularSalario()){
            return 0;
        }
        return 1;
    }
    
    
    
}
