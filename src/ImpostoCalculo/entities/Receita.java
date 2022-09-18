package ImpostoCalculo.entities;

public abstract class Receita {
    private String nome;
    private Double renda;

    Receita(){}

    Receita(String nome, Double renda){
        this.nome = nome;
        this.renda = renda;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getRenda(){
        return this.renda;
    }

    public void setRenda(Double renda){
        this.renda = renda;
    }

    public abstract double calculoImposto();
}
