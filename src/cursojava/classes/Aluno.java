package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*esta é nossa classe/objeto que representa o Aluno*/
public class Aluno {
    private String nome;
    private int idade;
    private String dataNascimento;
    private double media;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Aluno(){}
    public Aluno(String nome, int idade, String dataNascimento ){
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;

    }

    public void CalcMedia() {
        double somaNotas = 0.0;

        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getNota();
        }
        this.media = somaNotas / disciplinas.size();
    }

    public boolean getStatus(double media){

        return this.getMedia() > media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade && Double.compare(media, aluno.media) == 0 && Objects.equals(nome, aluno.nome) && Objects.equals(dataNascimento, aluno.dataNascimento) && Objects.equals(disciplinas, aluno.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, dataNascimento, media, disciplinas);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", media=" + media +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
