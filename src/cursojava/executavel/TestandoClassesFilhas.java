package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Alienderson Santos");
        aluno.setIdade(15);


        Diretor diretor = new Diretor();
        diretor.setNome("Joaquin Dávila");
        diretor.setRegistroGeral("123456");
        diretor.setIdade(55);

        Secretario secretario = new Secretario("Pardal lopes", "332244", "nivel V", "20 anos");
        secretario.setIdade(35);


        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);
        System.out.printf("O aluno: %s %s Maior de Idade \n", aluno.getNome(), (aluno.pessoaMaiorIdade()? "é":"não é"));
        System.out.printf("O Diretor: %s %s Maior de Idade", diretor.getNome(), (diretor.pessoaMaiorIdade()? "é":"não é"));
    }


}
