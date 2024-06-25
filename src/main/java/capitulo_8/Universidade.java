package capitulo_8;

public interface Universidade {
    
    public static final String NOME = "UENP";
    
    public default String mostrarNomePorExtenso(){
        return "Universidade Estadual do Norte do Paraná"; 
    }
    
}
