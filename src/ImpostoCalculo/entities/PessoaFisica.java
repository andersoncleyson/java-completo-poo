package ImpostoCalculo.entities;

public class PessoaFisica extends Receita{
    private Double gastoSaude;

    public PessoaFisica(){}

    public PessoaFisica(String nome, Double renda, Double gastoSaude){
        super(nome, renda);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude(){
        return this.gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude){
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double calculoImposto() {
        if(this.getRenda() < 20000){
            return this.getRenda() * 0.25;
        } else {
            return (this.getRenda() * 0.25) - (this.getGastoSaude() * 0.5);
        }
    }
}
