package capitulo_4;

public class Caixa {

    int altura;
    int largura;
    int comprimento;

    Caixa() {
        altura = 0;
        largura = 0;
        comprimento = 0;
    }

    Caixa(int altura, int largura, int comprimento) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    int calcularVolume() {
        return (altura * largura * comprimento);
    }

    public static void main(String[] args) {
        Caixa caixa = new Caixa(); // inicia com 0, 0, 0
        // ...
        Caixa caixa2 = new Caixa(3, 5, 10); // inicia com os valores 
        int volume = caixa2.calcularVolume();
        System.out.println("Volume: " + volume);
        // ou 
        /*
        System.out.println("Volume: " + caixa2.calcularVolume());
         */
    }

}
