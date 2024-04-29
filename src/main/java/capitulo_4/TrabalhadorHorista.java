/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo_4;

/**
 *
 * @author Usuário
 */
public class TrabalhadorHorista {
    
    int horasTrabalhadas;
    double valorHora;
    
    TrabalhadorHorista(){
        horasTrabalhadas = 0;
        valorHora = 0;
    }
    
    TrabalhadorHorista(int horasTrabalhadas, double valorHora){
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    
    double calcularSalaraio(){
        return horasTrabalhadas*valorHora;
    }
}
