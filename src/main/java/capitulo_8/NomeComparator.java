package capitulo_8;

import java.util.Comparator;


public class NomeComparator implements Comparator<Aluno> {

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return aluno1.getNome().compareTo(aluno2.getNome()); 
    }
    
}
