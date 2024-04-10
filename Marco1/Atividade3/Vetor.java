package Marco1.Atividade3;

public class Vetor implements IVetorAluno {
    private Aluno[] alunos = new Aluno[10];
    private int totalAlunos = 0;

    @Override
    public int tamanho() {

        return totalAlunos;
    }

    @Override
    public boolean contem(Aluno aluninho) {

        for (int i = 0; i < totalAlunos; i++) {
            if (alunos[i] == aluninho) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean cheio() {

        return totalAlunos == this.alunos.length;
    }

    public void adiciona(Aluno aluninho) {

        this.garanteEspaco();
        alunos[totalAlunos] = aluninho;
        totalAlunos++;
    }

    private void garanteEspaco() {
        if (this.cheio()) {
            Aluno[] novosAlunos = new Aluno[alunos.length * 2];
            for(int i = 0; i < this.alunos.length; i++)
                novosAlunos[i] = this.alunos[i];
            this.alunos = novosAlunos;
        }
    }

    @Override
    public boolean remove(Aluno aluno){
        int indice = -1;
        for(int i=0; i < totalAlunos; i++)
            if (aluno == this.alunos[i]) {
                indice = i;
                break;
            }
        if (indice != -1){
            for(int i=indice; i<(totalAlunos-1); i++)
                alunos[i] = alunos[i+1];
            totalAlunos--;
            return true;
        }
        return false;
    }
}