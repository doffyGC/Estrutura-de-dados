package Marco1.Atividade2;

public class Main {
    public static void main(String[] args) {

        //testes para os métodos
        Aluno aluno1 = new Aluno("Carllos", 20, 10.45);
        Aluno aluno2 = new Aluno("Daniel", 19, 10.45);
        Aluno aluno3 = new Aluno("Guilherme", 18, 10.45);

        Vetor alunos = new Vetor();

        alunos.adiciona(aluno1);
        alunos.adiciona(aluno2);

        //verifica o tamanho do vetor
        System.out.println(alunos.tamanho());

        //o resultado é true
        System.out.println(alunos.contem(aluno1));

        //o resultado é false
        System.out.println(alunos.contem(aluno3));
    }
}
