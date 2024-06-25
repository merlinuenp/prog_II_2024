
package capitulo_7;

public class TestaHeranca {
    
    public static void main(String[] args) {
        
        CaminhaoBiTrem caminhao = new CaminhaoBiTrem("Volvo", 2020, 1000000.0, 100, 50);
        System.out.println(caminhao.calcularIpva());
               
    }
    
}
