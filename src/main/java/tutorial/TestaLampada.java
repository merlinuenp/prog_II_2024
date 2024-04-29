package tutorial; 

public class TestaLampada {
    
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        System.out.println(lampada.ligada);
        lampada.ligar();
        System.out.println(lampada.ligada);
       
    }
    
}
