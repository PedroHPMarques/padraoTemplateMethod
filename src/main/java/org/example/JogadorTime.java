package org.example;

public class JogadorTime extends Jogador {

        @Override
        public String avaliarDesempenho(){
            double desempenho = calcularDesempenho();
            if(desempenho >= 7){
                return "Excelente Jogo";
            }
            else if (desempenho >= 5){
                return "Bom Jogo";
            }
            else {
                return "Jogo Ruim";
            }
        }

        @Override
        public String getTipo(){
            return "JogadorTime";
        }

    }


