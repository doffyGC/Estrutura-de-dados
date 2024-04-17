package Marco1.Atividade5;

public class LDE implements Lista{
    private Noh inicio;
    private Noh fim;
    private int totalNohs;
    public LDE (){
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void insereInicio(Object obj) {
        Noh novo = new Noh(obj);
        if (inicio == null){
            inicio = novo;
            fim = novo;
            totalNohs++;
        }else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
            totalNohs++;
        }
    }
    @Override
    public void insereFim(Object obj) {
        Noh novo = new Noh(obj);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
            totalNohs++;
        }else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
            totalNohs++;
        }
    }
    @Override
    public boolean estahVazia() {

        return inicio == null;
    }
    @Override
    public boolean remove(Object obj){

        Noh p = buscaObjetoRemovido(obj);

        if (p == null) { // não achou, então não faz nada e retorna false
            return false;
        }
        if (p == inicio) { //retira obj do início
            inicio = p.getProx();
            totalNohs--;
            if(inicio != null)
                inicio.setAnt(null);
            else
                fim = null;
        }else if (p.getProx() == null){
            p.getAnt().setProx(null);
            fim = p.getAnt();
            totalNohs--;
        }else{
            p.getAnt().setProx(p.getProx());
            p.getProx().setAnt(p.getAnt());
            totalNohs--;
        }
        return true;
    }

    public Noh buscaObjetoRemovido(Object obj){//método construido para a busca do objeto
        Noh objetoBuscado = inicio;
        while (objetoBuscado != null && objetoBuscado.getObjeto() != obj) {
            objetoBuscado = objetoBuscado.getProx();
        }
        return objetoBuscado;
    }
    @Override
    public int tamanho() {
        return totalNohs;
    }

    public void listarLDE(int escolhaSequencia){

        Noh p = inicio;
        Noh q = fim;

        switch (escolhaSequencia) {

            case 1:
                while (p != null) {
                    if (p.getObjeto() instanceof Aluno) {
                        Aluno aluninho = (Aluno) p.getObjeto();
                        System.out.println(aluninho.toString());
                    } else
                        System.out.println(p);
                    p = p.getProx();
                }
                break;
            case 2:
                while (q != null) {
                    if (q.getObjeto() instanceof Aluno) {
                        Aluno aluninho = (Aluno) q.getObjeto();
                        System.out.println(aluninho.toString());
                    } else
                        System.out.println(q);
                    q = q.getAnt();
                }
                break;
        }
        if(inicio == null && fim == null)
            System.out.println("Não há objetos para listar.");
    }
}
