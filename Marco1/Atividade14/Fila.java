package Marco1.Atividade14;

import Marco1.Atividade9.IFila;

public class Fila implements IFila {

    private Object[] vetorObjetos = new Object[10];
    private int numeroElementos = 0;
    private int inicio = 0;
    @Override
    public boolean add(Object info) {

        if (numeroElementos == vetorObjetos.length) {
            System.out.println("Capacidade da fila esgotada!");
            return false;
        }
        int fim = (inicio + numeroElementos) % vetorObjetos.length;
        vetorObjetos[fim] = info;
        numeroElementos++;
        return true;
    }
    @Override
    public boolean remove() {
        if (this.isEmpty()){
            System.out.println("Fila esta vazia!");
            return false;
        }
        inicio = (inicio + 1) % vetorObjetos.length;
        numeroElementos--;
        return true;
    }
    @Override
    public boolean isEmpty() {
        return numeroElementos != 0;
    }
    @Override
    public int size() {
        return numeroElementos;
    }
    public void imprimirLista(){

        for(int i = 0; i < vetorObjetos.length; i++){

            if (vetorObjetos[i] == null)
                System.out.println("Slot Vazio!");
            else
                System.out.println(vetorObjetos[i]);
        }
    }
}