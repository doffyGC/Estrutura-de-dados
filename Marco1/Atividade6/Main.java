package Marco1.Atividade6;
import java.util.Random;
public class Main {
    public static void main(String[] args){

        Vetor vetorNumeros = new Vetor();
        Random numeroRandomico = new Random();
        int numerosTotaisRegistrados = 0;
        int maiorNumero;
        long tempoIniciado, tempoFinalizado, tempoDeExecucao;

        //preenchimento de 1000 slots no vetor com diversos valores
        for(int i = 0; i < 1000; i++){

            vetorNumeros.adiciona(numeroRandomico.nextInt(2000)); //limitado até o valor 2000 para não entrar valores exorbitantes
            numerosTotaisRegistrados++;
        }

        //colocação do maior valor no método recursivo e contagem de tempo
        tempoIniciado = System.nanoTime();
        maiorNumero = vetorNumeros.maiorElementoRec(vetorNumeros, 0, numerosTotaisRegistrados - 1);
        System.out.println("Maior valor encontrado pelo método recursivo: " + maiorNumero);
        tempoFinalizado = System.nanoTime();
        tempoDeExecucao = tempoFinalizado - tempoIniciado;
        System.out.println("Tempo de Execução do método recursivo:" + tempoDeExecucao);

        //colocação do maior valor no método iterativo e contagem de tempo
        tempoIniciado = System.nanoTime();
        maiorNumero = vetorNumeros.maiorElementoIterativo(numerosTotaisRegistrados - 1);
        System.out.println("Maior valor encontrado pelo método iterativo: " + maiorNumero);
        tempoFinalizado = System.nanoTime();
        tempoDeExecucao = tempoFinalizado - tempoIniciado;
        System.out.println("Tempo de Execução do método iterativo:" + tempoDeExecucao);
    }
}
