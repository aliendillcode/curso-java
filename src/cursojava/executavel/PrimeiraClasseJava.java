package cursojava.executavel;

import cursojava.auxiliares.FuncaoAutenticacao;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.interfaces.PermitirAcesso;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

public class PrimeiraClasseJava {
    public static void main(String[] args) {
        String login = JOptionPane.showInputDialog("Informe seu login");
        String senha = JOptionPane.showInputDialog("Informa sua Senha");

        System.out.println(
                new FuncaoAutenticacao(new Secretario(login, senha))
                        .autenticar()?"Bem vindo ao sistema":"Usuário ou senha inválido");


        Aluno aluno = new Aluno("João da Silva", 45);

        int qtt = Integer.parseInt(JOptionPane.showInputDialog("Qtd Disciplinas: "));
        for(int i = 0; i < qtt; i++){
        String discip = JOptionPane.showInputDialog("Informe a Disciplina");
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota"));
            Disciplina disciplina = new Disciplina(discip, nota);
            aluno.getDisciplinas().add(disciplina);

        }
        aluno.CalcMedia();

        System.out.printf("Aluno %s teve média %s e está %s", aluno.getNome(), aluno.getMedia(), aluno.getStatus());



    }
}