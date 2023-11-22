package org.example;

public class JogadorSelecao extends Jogador{

    @Override
    public String avaliarDesempenho(){
        double desempenho = calcularDesempenho();
        if(desempenho >= 8){
            return "Excelente Jogo";
        }
        else if (desempenho >= 6){
            return "Bom Jogo";
        }
        else {
            return "Jogo Ruim";
        }
    }

    @Override
    public String getTipo(){
        return "JogadorSelecao";
    }

}
