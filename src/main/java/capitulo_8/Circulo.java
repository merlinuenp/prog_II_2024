package capitulo_8;


public class Circulo implements Figura { 
    private double raio; 
    private double area;
    
    
    @Override
    public double calcularArea(){
        return Math.PI * raio * raio; 
    }
    
    public double getRaio(){
        return raio; 
    }
    
}
