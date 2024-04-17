package Marco1.Atividade4;

public class Main {
    public static void main(String[] args) {

        LSE l = new LSE();
        //testes para os métodos
        Aluno aluno1 = new Aluno("Carllos", 20, 10.45);
        Aluno aluno2 = new Aluno("Daniel", 19, 10.45);

        //valor colocado no inicio
        l.insereInicio(aluno1);

        //resultado deve ser false
        System.out.println(l.estahVazia());

        //valor colocado no fim
        l.insereFim(aluno2);

        //verifica o tamanho da lista
        System.out.println(l.tamanho());

        //retira o aluno 2 da lista
        l.remove(aluno2);

        l.insereInicio(aluno2);

        //lista todos os alunos da lista
        l.listarLSE();
    }
}
