package Marco1.Atividade9;

public class Main {
    public static void main(String[] args){

        Fila fila = new Fila(10);
        int numeroAleatorio = 0;

        //for utilizado para preencher a fila
        for(int i = 0; i < 10; i++){

            numeroAleatorio = numeroAleatorio + 1;
            fila.add(numeroAleatorio);
        }

        //retira o primeiro valor para testar a mensagem de slot
        fila.remove();

        fila.imprimirLista();
    }
}
