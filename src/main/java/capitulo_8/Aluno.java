package capitulo_8;

public class Aluno implements Comparable<Aluno> {
    
    private Integer matricula;
    private String nome;
    private Integer periodo; 
    
    public Aluno(){
        this.matricula = 0;
        this.nome = "";
        this.periodo = 99;
    }

    public Aluno(Integer matricula, String nome, Integer periodo) {
        this.matricula = matricula;
        this.nome = nome;
        this.periodo = periodo;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    @Override
    public int compareTo(Aluno outro) {
        if (this.matricula < outro.getMatricula()){
            return -1;
        }
        if (this.matricula == outro.getMatricula()){
            return 0;
        }
        return 1; 
    }
    
    //        return Integer.compare(this.getMatricula(), outro.getMatricula());
    
    
}
