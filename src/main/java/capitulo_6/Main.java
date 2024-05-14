
package capitulo_6;


public class Main {
    
    public static void main(String[] args) {
//        Aluno vetor[] = new Aluno[3]; 
//        Aluno aluno = new Aluno();
//        aluno.setNome("Monica");
//        vetor[0] = aluno;
//        aluno.setNome("Cebolinha");
//        vetor[1] = aluno;
//        aluno.setNome("Cascão");
//        vetor[2] = aluno; 
//        
//        System.out.println(vetor[0].getNome());
//        System.out.println(vetor[1].getNome());
//        System.out.println(vetor[2].getNome());
        
      
        StringBuilder sb = new StringBuilder();
        for (int i=0; i< 1_000; i++){
            sb.append(i); 
        }
        
        System.out.println(sb.toString());
    }
    
}
