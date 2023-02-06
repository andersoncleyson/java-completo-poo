package ImpostoCalculo.entities;

public class PessoaJuridica extends Receita{
    private Integer nFuncionarios;

    public PessoaJuridica(){}

    public PessoaJuridica(String nome, Double renda, Integer nFuncionarios){
        super(nome, renda);
        this.nFuncionarios = nFuncionarios;
    }

    public Integer getnFuncionarios(){
        return this.nFuncionarios;
    }

    public void setnFuncionarios(Integer nFuncionarios){
        this.nFuncionarios = nFuncionarios;
    }

    @Override
    public double calculoImposto(){
        if(this.nFuncionarios > 10){
            return this.getRenda() * 0.14;
        } else {
            return this.getRenda() * 0.16;
        }
    }
}
