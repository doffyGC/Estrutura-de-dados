package Marco1.Atividade3;

public class Main {
    public static void main(String[] args) {

        //testes para os métodos
        Aluno aluno1 = new Aluno("Carllos", 20, 10.45);
        Aluno aluno2 = new Aluno("Daniel", 19, 10.45);
        Aluno aluno3 = new Aluno("Guilherme", 18, 10.45);
        Aluno aluno4 = new Aluno("Matheus", 18, 10.45);
        Aluno aluno5 = new Aluno("Erik", 19, 10.45);
        Aluno aluno6 = new Aluno("Case", 22, 10.45);
        Aluno aluno7 = new Aluno("Reinaldo", 18, 10.45);
        Aluno aluno8 = new Aluno("Camila", 20, 10.45);
        Aluno aluno9 = new Aluno("Arieta", 22, 10.45);
        Aluno aluno10 = new Aluno("Pedro", 19, 10.45);

        Vetor alunos = new Vetor();

        //maior numero de alunos adicionados para testar o método de adiquirir mais espaço
        alunos.adiciona(aluno1);
        alunos.adiciona(aluno2);
        alunos.adiciona(aluno3);
        alunos.adiciona(aluno4);
        alunos.adiciona(aluno5);
        alunos.adiciona(aluno6);
        alunos.adiciona(aluno7);
        alunos.adiciona(aluno8);
        alunos.adiciona(aluno9);
        alunos.adiciona(aluno10);
        alunos.adiciona(aluno1);

        //verifica o tamanho do vetor
        System.out.println(alunos.tamanho());

        //o resultado é true
        System.out.println(alunos.contem(aluno1));

        //o resultado é false
        System.out.println(alunos.contem(aluno3));

        //remove o aluno2
        System.out.println(alunos.remove(aluno2));

        //verifica se o tamamnho foi diminuido
        System.out.println(alunos.tamanho());
    }
}