package Marco1.Atividade5;

public class Noh {
    private Object objeto;
    private Noh ant;
    private Noh prox;
    public Noh (Object objeto){
        this.objeto = objeto;
        this.ant = null;
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

    public Noh getAnt() {
        return ant;
    }

    public void setAnt(Noh ant) {
        this.ant = ant;
    }
}
