package Marco1.Atividade2;

public class Vetor {

    private Aluno[] alunos = new Aluno[10];
    private int totalAlunos = 0;
    public void adiciona(Aluno aluninho){

        alunos[totalAlunos] = aluninho;
        totalAlunos++;
    }
    public int tamanho(){

        return totalAlunos;
    }
    public boolean contem(Aluno aluninho){

        for(int i = 0; i < totalAlunos; i++){

            if (alunos[i] == aluninho) {

                return true;
            }
        }

        return false;
    }
}
