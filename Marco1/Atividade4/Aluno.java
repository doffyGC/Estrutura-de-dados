package Marco1.Atividade4;

public class Aluno {
    private String nome;
    private int idade;
    private double nota;
    public Aluno(String nome, int idade, double nota) {

        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    @Override
    public String toString() {
        String resultado;
        return resultado = "Nome: " + nome + ", idade: " + idade + ", nota: " + nota;
    }
}
