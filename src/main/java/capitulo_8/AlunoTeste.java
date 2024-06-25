
package capitulo_8;

import java.util.ArrayList;
import java.util.Collections;



public class AlunoTeste {
    
    public static void main(String[] args) {
        
        
//        ArrayList<Integer> numeros = new ArrayList();
//        numeros.add(12);
//        numeros.add(1);
//        numeros.add(55);
//        numeros.add(27);
//        
//        Collections.sort(numeros);
//        
//        for (Integer i : numeros){
//            System.out.println(i);
//        }
 
        
        ArrayList<Aluno> alunos = new ArrayList();
        alunos.add(new Aluno(1, "Hermione Granger", 4));
        alunos.add(new Aluno(3, "Draco Malfoy", 2));
        alunos.add(new Aluno(8, "Herry Potter", 5));
        alunos.add(new Aluno(5, "Rony Weasley", 5)); 
        
       
        Collections.sort(alunos, new NomeComparator()); 
        
        for(Aluno a : alunos){
            System.out.println(a.getNome() + " "+ a.getPeriodo());
        }
                
      
//        Comparator<Aluno> porMatricula = Comparator.comparing(Aluno::getMatricula);
//        Collections.sort(alunos, porMatricula);
        
    }
    
}
