package Marco1.Atividade4;

public class Noh {
    private Object objeto;
    private Noh prox;
    public Noh (Object objeto){
        this.objeto = objeto;
        this.prox = null;
    }

    public Object getObjeto() {
        return objeto;
    }

    public Noh getProx() {
        return prox;
    }
    public void setProx(Noh prox) {
        this.prox = prox;
    }
}
