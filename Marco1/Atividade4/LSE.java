package Marco1.Atividade4;

public class LSE implements Lista {//TAD Lista simplesmente encadeada
    private Noh inicio;
    private int totalNohs;
    public LSE (){
        this.inicio = null;
    }

    @Override
    public void insereInicio(Object obj) {
        Noh novo = new Noh(obj);
        if (inicio == null){
            inicio = novo;
            totalNohs++;
        }else {
            novo.setProx(inicio);
            inicio = novo;
            totalNohs++;
        }
    }
    @Override
    public void insereFim(Object obj) {
        Noh novo = new Noh(obj);
        if (inicio == null) {
            inicio = novo;
            totalNohs++;
        }else {
            Noh ultimo = null;
            for (Noh i = inicio; i != null; i = i.getProx())
                ultimo = i;
            ultimo.setProx(novo);
            totalNohs++;
        }
    }
    @Override
    public boolean estahVazia() {

        return inicio == null;
    }
    @Override
    public boolean remove(Object obj){
            Noh ant, p;
            ant = null;
            p = inicio;
            while (p != null && p.getObjeto() != obj) { //busca
                ant = p;
                p = p.getProx();
            }

            if (p == null) { // não achou, então não faz nada e retorna false
                return false;
            }
            if (ant == null) { //retira obj do início
                inicio = p.getProx();
                totalNohs--;
            }else {
                ant.setProx(p.getProx());
                totalNohs--;
            }
            return true;
    }
    @Override
    public int tamanho() {
        return totalNohs;
    }

    public void listarLSE(){

        Noh p = inicio;
        while (p != null) {
            if(p.getObjeto() instanceof Aluno){
                Aluno aluninho = (Aluno) p.getObjeto();
                System.out.println(aluninho.toString());
            }else
                System.out.println(p);
            p = p.getProx();
        }

        if(inicio == null)
            System.out.println("Não há objetos para listar.");
    }
}