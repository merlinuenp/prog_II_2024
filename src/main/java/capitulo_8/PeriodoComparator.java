package capitulo_8;

import java.util.Comparator; 


public class PeriodoComparator implements Comparator<Aluno> {
    
    @Override
    public int compare(Aluno aluno1, Aluno aluno2){
        return Integer.compare(aluno1.getPeriodo(), aluno2.getPeriodo());
    }
    
}
