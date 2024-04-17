package Marco1.Atividade5;

import Marco1.Atividade4.Aluno;
import Marco1.Atividade4.LSE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LDE l = new LDE();
        //testes para os métodos
        Aluno aluno1 = new Aluno("Carllos", 20, 10.45);
        Aluno aluno2 = new Aluno("Daniel", 19, 10.45);
        Aluno aluno3 = new Aluno("Jose", 19, 10.45);
        Scanner entrada = new Scanner(System.in);
        int escolhaDeListagem;
        //valor colocado no inicio
        l.insereInicio(aluno1);
        l.insereInicio(aluno3);
        //resultado deve ser false
        System.out.println(l.estahVazia());

        //valor colocado no fim
        l.insereFim(aluno2);

        //verifica o tamanho da lista
        System.out.println(l.tamanho());

        //retira o aluno 1 da lista
        l.remove(aluno1);

        //lista todos os alunos da lista conforme o desejo do usuário
        System.out.println("Qual a forma de listagem desejas?");
        System.out.println("1 - Listagem do inicio para o fim");
        System.out.println("2 - Listagem do fim para o inicio");
        escolhaDeListagem = entrada.nextInt();
        l.listarLDE(escolhaDeListagem);
    }
}
