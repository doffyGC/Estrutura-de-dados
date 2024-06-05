package Marco1.Atividade8;

import java.util.Random;
public class Main {
    public static void main(String[] args){

        Vetor vetorNumeros = new Vetor();
        Vetor vetorNumeros2 = new Vetor();
        Vetor vetorNumeros3 = new Vetor();
        Random numeroRandomico = new Random();
        long tempoIniciado, tempoFinalizado, tempoDeExecucao;

        //preenchimento de 1000 slots no vetor com diversos valores
        for(int i = 0; i < 1000; i++){
            vetorNumeros.adiciona(numeroRandomico.nextInt(2000)); //limitado até o valor 200 para não entrar valores exorbitantes
            vetorNumeros2.adiciona(numeroRandomico.nextInt(2000));
            vetorNumeros3.adiciona(numeroRandomico.nextInt(2000));
        }

        //colocação de método de ordenação de inserção
        tempoIniciado = System.nanoTime();
        vetorNumeros.ordenacaoInsercao();
        tempoFinalizado = System.nanoTime();
        tempoDeExecucao = tempoFinalizado - tempoIniciado;
        System.out.println("Tempo de Execução do método de ordenação de inserção: " + tempoDeExecucao);

        //colocação de método de ordenação de bolha
        tempoIniciado = System.nanoTime();
        vetorNumeros2.ordenacaoBolha();
        tempoFinalizado = System.nanoTime();
        tempoDeExecucao = tempoFinalizado - tempoIniciado;
        System.out.println("Tempo de Execução do método de ordenação de bolha: " + tempoDeExecucao);

        //colocação de método de ordenação de seleção
        tempoIniciado = System.nanoTime();
        vetorNumeros3.ordenacaoSelecao();
        tempoFinalizado = System.nanoTime();
        tempoDeExecucao = tempoFinalizado - tempoIniciado;
        System.out.println("Tempo de Execução do método de ordenação de seleção: " + tempoDeExecucao);
    }
}
