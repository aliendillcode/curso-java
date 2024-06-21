package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;
import java.util.List;

public class PrimeiraClasseJava {
    public static void main(String[] args) {

        String nome = "João da Silva";
        Disciplina disciplina = new Disciplina("Banco de Dados", 3.5);
        Disciplina disciplina1 = new Disciplina("Matemática", 8.5);
        Disciplina disciplina2 = new Disciplina("Programação", 5.5);
        Disciplina disciplina3 = new Disciplina("Gerencia de Projetos", 2.5);


        Aluno aluno = new Aluno(nome, 45, "03/10/2001" );
        aluno.getDisciplinas().add(disciplina);
        aluno.getDisciplinas().add(disciplina1);
        aluno.getDisciplinas().add(disciplina2);
        aluno.getDisciplinas().add(disciplina3);



        aluno.CalcMedia();
        System.out.printf("Aluno: %s Média: %.2f Status: %s",
                aluno.getNome(),
                aluno.getMedia(),
                aluno.getStatus(7)? "Aprovado": "Reprovado");


    }
}