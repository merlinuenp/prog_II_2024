
package capitulo_8.folha;

import java.util.ArrayList;
import java.util.Collections;

public class Folha {
    
    public static void main(String[] args) {
        ArrayList<Funcionario> lista = new ArrayList(); // lista dinâmica
        lista.add(new Operario(10, 100.0));
        lista.add(new Gerente(2000.0));
        lista.add(new Operario(1, 50.0));
        
        
        // Polimorfismo 
        for (Funcionario f : lista){
            System.out.println(f.calcularSalario());
        }

        Collections.sort(lista, new ComparadorSalario()); 
        System.out.println("\nLista ordenada por salários");
  
        for (Funcionario f : lista){
            System.out.println(f.calcularSalario());
        }
    }
    
}
