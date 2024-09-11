package Marco1.Atividade10;

public class FilaLista implements IFila {
    private Noh inicio;
    private Noh fim;

    public FilaLista() {
        this.inicio = null;
        this.fim = null;
    }
    @Override
    public boolean add(Object info){
        Noh novo = new Noh(info);
        if (this.isEmpty())
            inicio = novo;
        else
            fim.setProx(novo);
        fim = novo;
        return true;
    }
    @Override
    public boolean remove(){
        if (!isEmpty()){
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else
                inicio = inicio.getProx();
            return true;
        }
        return false;
    }
    @Override
    public boolean isEmpty() {
        return this;
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
