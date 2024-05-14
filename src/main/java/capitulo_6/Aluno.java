
package capitulo_6;


public class Aluno {
    private static Integer sequencia = 0;  
    private Integer matricula;
    private String nome; 
    
    public Aluno(){
        sequencia++;
        matricula = sequencia; 
    }
    
    public Aluno(Integer matricula, String nome){
        this.matricula = matricula;
        this.nome = nome; 
    }
    
    public Integer getMatricula(){
        return matricula; 
    }
    
    public void setMatricula(Integer matricula){
        this.matricula = matricula; 
    }

    public static Integer getSequencia() {
        return sequencia;
    }

    public static void setSequencia(Integer sequencia) {
        Aluno.sequencia = sequencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
