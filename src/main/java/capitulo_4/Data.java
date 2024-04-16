package capitulo_4;

public class Data {

    int dia;
    int mes;
    int ano;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1;
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    Data(int ano) {
        this.ano = ano;
        dia = 1;
        mes = 1;
    }

    String formatarData(char opcao) {
        return "" + dia + opcao + mes + opcao + ano;
    }
    
    
    
    public static void main(String[] args) {
        Data d = new Data(16, 4, 2024);
        System.out.println(d.formatarData('/'));
    }
}
