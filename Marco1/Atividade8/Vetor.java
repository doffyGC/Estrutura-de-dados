package Marco1.Atividade8;
import java.util.Arrays;

public class Vetor implements IVetor {
    private int[] numerosAleatorios = new int[10];
    private int totalNumeros = 0;

    @Override
    public void adiciona(int numero) {
        this.garanteEspaco();
        numerosAleatorios[totalNumeros] = numero;
        totalNumeros++;
    }

    @Override
    public int tamanho() {

        return totalNumeros;
    }

    @Override
    public boolean contem(int numero) {
        for (int i = 0; i < totalNumeros; i++) {
            if (numerosAleatorios[i] == numero) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean cheio() {

        return totalNumeros == this.numerosAleatorios.length;
    }

    public void ordenarVetor() {
        Arrays.sort(numerosAleatorios);
    }

    public int valorRetornado(int indice) {
        return numerosAleatorios[indice];
    }

    @Override
    public boolean remove(int numero) {

        int indice = -1;
        for (int i = 0; i < totalNumeros; i++)
            if (numero == this.numerosAleatorios[i]) {
                indice = i;
                break;
            }
        if (indice != -1) {
            for (int i = indice; i < (totalNumeros - 1); i++)
                numerosAleatorios[i] = numerosAleatorios[i + 1];
            totalNumeros--;
            return true;
        }
        return false;
    }

    private void garanteEspaco() {
        if (this.cheio()) {
            int[] novosNumerosAleatorios = new int[numerosAleatorios.length * 2];
            for (int i = 0; i < this.numerosAleatorios.length; i++)
                novosNumerosAleatorios[i] = this.numerosAleatorios[i];
            this.numerosAleatorios = novosNumerosAleatorios;
        }
    }

    public int maiorElementoRec(Marco1.Atividade7.Vetor vetor, int inicio, int fim) {
        int meio, max1, max2;

        if (inicio == fim)
            return vetor.valorRetornado(inicio);
        else {
            meio = (inicio + fim) / 2;
            max1 = maiorElementoRec(vetor, inicio, meio);
            max2 = maiorElementoRec(vetor, meio + 1, fim);

            if (max1 > max2)
                return max1;
            else
                return max2;
        }
    }

    public int maiorElementoIterativo(int slotFinal) {
        int maiorValor = 0;

        for (int i = 0; i <= slotFinal; i++) {
            if (i == 0)
                maiorValor = this.numerosAleatorios[i];
            else {
                if (this.numerosAleatorios[i] > maiorValor)
                    maiorValor = this.numerosAleatorios[i];
            }
        }
        return maiorValor;
    }

    public int pesquisaBinariaIterativo(int valorProcurado, int slotFinal) {
        int slotInicial = 0;

        while (slotInicial <= slotFinal) {
            int slotDoMeio = (slotInicial + slotFinal) / 2;
            if (numerosAleatorios[slotDoMeio] == valorProcurado) {
                return slotDoMeio;
            } else if (numerosAleatorios[slotDoMeio] > valorProcurado) {
                slotFinal = slotDoMeio - 1;
            } else
                slotInicial = slotDoMeio + 1;
        }
        //Retorna 0 caso não encontre o valor.
        return 0;
    }

    public int pesquisaBinariaRec(int valorProcurado, int slotInicial, int slotFinal) {
        int slotDoMeio = (slotInicial + slotFinal) / 2;

        if (numerosAleatorios[slotDoMeio] == valorProcurado)
            return slotDoMeio;
        else if (numerosAleatorios[slotDoMeio] > valorProcurado) {
            return pesquisaBinariaRec(valorProcurado, slotInicial, slotDoMeio - 1);
        } else {
            return pesquisaBinariaRec(valorProcurado, slotDoMeio + 1, slotFinal);
        }
    }
    public void ordenacaoBolha() {

        for (int i = 0; i < totalNumeros; i++) {
            for (int j = 0; j < totalNumeros - i - 1; j++) {
                // Troca os elementos se estiverem na ordem errada
                if (numerosAleatorios[j] > numerosAleatorios[j + 1]) {
                    // Troca arr[j] e arr[j+1]
                    int valorTemporario = numerosAleatorios[j];
                    numerosAleatorios[j] = numerosAleatorios[j + 1];
                }
            }
        }
    }
    public void ordenacaoSelecao() {
        int indiceMinimo, valorTemporario;
        // Move o limite do subarray não ordenado um por um
        for (int i = 0; i < totalNumeros - 1; i++) {
            // Encontra o menor elemento no subarray não ordenado
            indiceMinimo = i;
            for (int j = i + 1; j < totalNumeros; j++) {
                if (numerosAleatorios[j] < numerosAleatorios[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            // Troca o menor elemento encontrado com o primeiro elemento não ordenado
            valorTemporario = numerosAleatorios[indiceMinimo];
            numerosAleatorios[indiceMinimo] = numerosAleatorios[i];
            numerosAleatorios[i] = valorTemporario;
        }
    }
    public void ordenacaoInsercao() {
        for (int i = 1; i < totalNumeros; i++) {
            int chave = numerosAleatorios[i];
            int j = i - 1;
            while (j >= 0 && chave < numerosAleatorios[j]) {
                numerosAleatorios[j + 1] = numerosAleatorios[j];
                j--;
            }
            numerosAleatorios[j + 1] = chave;
        }
    }
}