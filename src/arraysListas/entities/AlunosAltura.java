package arraysListas.entities;

public class AlunosAltura {

    private String nome;
    private int idade;
    private double altura;

    public AlunosAltura(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void setNome(String npme){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setAltura(){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }


}
