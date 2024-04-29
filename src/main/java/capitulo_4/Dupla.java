
package capitulo_4;


public class Dupla {
    Aluno alunoa;
    Aluno alunob;
    
    
    Dupla(){
        alunoa = new Aluno();
        alunob = new Aluno();
    }
    
    Dupla(Aluno a, Aluno b){
        alunoa = a;
        alunob = b; 
    }
    
    void mostrarAlunos(){   
        // Não é recomendado exibir dados dentro do método
        System.out.println(alunoa.nome);
        System.out.println(alunob.nome);
                        
    }            
}
