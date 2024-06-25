
package capitulo_7;


public class TestaAbstract {
    
    public static void main(String[] args) {
        Robo r = new RoboSolar(true);
        RoboSolar rs = (RoboSolar) r;
        
        Robolandia.metodo(new RoboSolar(true), 
                new RoboPlutoniano(), new RoboMarciano());
        
//        Robo vetor[] = new Robo[3];
//        vetor[0] = new RoboSolar(true);
//        vetor[1] = new RoboMarciano();
//        vetor[2] = new RoboPlutoniano();
//        
//        for(Robo r : vetor){
//            System.out.println(r.toString());
//        }
        
         
               
        
        
    }
    
}
