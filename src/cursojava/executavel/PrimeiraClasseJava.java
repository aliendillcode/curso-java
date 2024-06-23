package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;
import java.util.List;

public class PrimeiraClasseJava {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno: ");
        Aluno aluno = new Aluno(nome, 45, "03/10/2001" );

        for(int pos = 1; pos <=4; pos++){
            String nomeDisciplina = JOptionPane.showInputDialog("Disciplina "+pos+" ?");
            String notaDisciplina = JOptionPane.showInputDialog("Nota: ");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.valueOf(notaDisciplina));
            aluno.getDisciplinas().add(disciplina);
        }



        aluno.CalcMedia();
        System.out.printf("Aluno: %s Média: %.2f Status: %s",
                aluno.getNome(),
                aluno.getMedia(),
                aluno.getStatus(7)? "Aprovado": "Reprovado");


    }
}