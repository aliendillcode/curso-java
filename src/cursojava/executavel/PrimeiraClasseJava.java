package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.interfaces.PermitirAcesso;

import javax.swing.*;
import java.util.List;

public class PrimeiraClasseJava {
    public static void main(String[] args) {
        String login = JOptionPane.showInputDialog("Informe seu login");
        String senha = JOptionPane.showInputDialog("Informa sua Senha");

        PermitirAcesso permitirAcesso = new Secretario(login, senha);


        System.out.println(permitirAcesso.autenticar()?"Bem vindo ao sistema":"Usuário ou senha inválido");;
    }
}