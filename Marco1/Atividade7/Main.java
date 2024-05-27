package Marco1.Atividade7;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        Vetor vetorNumeros = new Vetor();
        Random numeroRandomico = new Random();
        int numerosTotaisRegistrados = 0;
        int slotComOValor, valorDoUltimoSlot = 0;
        long tempoIniciado, tempoFinalizado, tempoDeExecucao;

        //preenchimento de 1000 slots no vetor com diversos valores
        for(int i = 0; i < 1000; i++){
            vetorNumeros.adiciona(numeroRandomico.nextInt(2000)); //limitado até o valor 200 para não entrar valores exorbitantes
            numerosTotaisRegistrados++;
        }

        //método utilizado para ordenar os valores do vetor
        vetorNumeros.ordenarVetor();
        valorDoUltimoSlot = vetorNumeros.valorRetornado(999);

        //colocação da pesquisa binária no método recursivo e contagem de tempo
        tempoIniciado = System.nanoTime();
        slotComOValor = vetorNumeros.pesquisaBinariaRec(valorDoUltimoSlot, 0, numerosTotaisRegistrados - 1);
        System.out.println("O slot com este valor encontrado pelo método recursivo: " + slotComOValor);
        tempoFinalizado = System.nanoTime();
        tempoDeExecucao = tempoFinalizado - tempoIniciado;
        System.out.println("Tempo de Execução do método recursivo: " + tempoDeExecucao);

        //colocação do maior valor no método iterativo e contagem de tempo
        tempoIniciado = System.nanoTime();
        slotComOValor = vetorNumeros.pesquisaBinariaIterativo(valorDoUltimoSlot, numerosTotaisRegistrados - 1);
        System.out.println("O slot com este valor encontrado pelo método iterativo: " + slotComOValor);
        tempoFinalizado = System.nanoTime();
        tempoDeExecucao = tempoFinalizado - tempoIniciado;
        System.out.println("Tempo de Execução do método iterativo: " + tempoDeExecucao);
    }
}

