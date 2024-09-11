package Marco1.Atividade14;

public class ABB {

    private Noh raiz;

    public boolean isEmpty(){
        return raiz == null;
    }

    //Método recursivo
    public void add(int elemento) {
        if (isEmpty())
            this.raiz = new Noh(elemento);
        else {
            Noh nohAtual = this.raiz;
            while (nohAtual != null) {
                if (elemento < nohAtual.valor) {
                    if (nohAtual.esq == null) {
                        Noh novoNoh = new Noh(elemento);
                        nohAtual.esq = novoNoh;
                        novoNoh.pai = nohAtual;
                        return;
                    }
                    nohAtual = nohAtual.esq;
                } else {
                    if (nohAtual.dir == null) {
                        Noh novoNoh = new Noh(elemento);
                        nohAtual.dir = novoNoh;
                        novoNoh.pai = nohAtual;
                        return
                                ;
                    }
                    nohAtual = nohAtual.dir;
                }
            }
        }
    }

    public void recursiveAdd(int element) {

        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            recursiveAdd(this.raiz, element);
        }
    }

    //método privado para controle da recursão
    private void recursiveAdd(Noh noh, int elemento) {

        if (elemento < noh.valor) {
            if (noh.esq == null) {
                Noh novoNoh = new Noh(elemento);
                noh.esq = novoNoh;
                novoNoh.pai = noh;
                return;
            }
            recursiveAdd(noh.esq, elemento);
        } else {
            if (noh.dir == null) {
                Noh novoNoh = new Noh(elemento);
                noh.dir = novoNoh;
                novoNoh.pai = noh;
                return;
            }
            recursiveAdd(noh.dir, elemento);
        }
    }
    public Noh buscaIter(int element) {
        Noh aux = this.raiz;
        while (aux != null) {
            if (aux.valor == element) return aux;
            if (element < aux.valor) aux = aux.esq;
            if (element > aux.valor) aux = aux.dir;
        }
        return null;
    }
    public Noh buscaRec(int element) {
        return buscaRec(this.raiz, element);
    }
    private Noh buscaRec(Noh node, int element) {
        if (node == null) return null;
        if (element == node.valor) return node;
        if (element < node.valor)
            return buscaRec(node.esq, element);
        else
            return buscaRec(node.dir, element);
    }
    public void preOrdem() {
        preOrdem(this.raiz);
    }
    private void preOrdem(Noh nohzinho) {
        if (nohzinho != null) {
            System.out.println(nohzinho.valor);
            preOrdem(nohzinho.esq);
            preOrdem(nohzinho.dir);
        }
    }
    public void emOrdem() {
        emOrdem(this.raiz);
    }
    private void emOrdem(Noh nohzinho) {
        if (nohzinho != null) {
            emOrdem(nohzinho.esq);
            System.out.println(nohzinho.valor);
            emOrdem(nohzinho.dir);
        }
    }
    public void posOrdem() {
        posOrdem(this.raiz);
    }
    private void posOrdem(Noh nohzinho) {
        if (nohzinho != null) {
            posOrdem(nohzinho.esq);
            posOrdem(nohzinho.dir);
            System.out.println(nohzinho.valor);
        }
    }
    public void imprimeLargura() { //algoritmo BFS
        Fila f = new Fila();
        if (f.isEmpty()) {
            f.add(this.raiz);
            while (!f.isEmpty()) {
                Noh atual = f.remove();
                System.out.println(atual);
                if(atual.esq != null)
                    f.add(atual.esq);
                if(atual.dir != null)
                    f.add(atual.dir);
            }
        }
    }
}