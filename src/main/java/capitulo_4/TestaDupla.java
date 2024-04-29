
package capitulo_4;


public class TestaDupla {
    public static void main(String[]args) {
        Aluno alunoa = new Aluno("Rigby", 1);
        Aluno alunob = new Aluno("Mordekay", 2);
        
        Dupla dupla1 = new Dupla(alunoa, alunob);
        dupla1.mostrarAlunos();
    }
    
    
}
