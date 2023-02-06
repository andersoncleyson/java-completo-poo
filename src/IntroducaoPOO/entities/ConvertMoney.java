package IntroducaoPOO.entities;

public class ConvertMoney {

    public double dollarValue;
    public double valueToConvert;

    public double valorConvertido(){
        return this.dollarValue * this.valueToConvert;
    }

    public double valueFinal(){
        double valorFinal = (6.0 + 100) / 100 * valorConvertido();
        return valorFinal;
    }

    public String toString(){
        return "Amount to be paid in reais = " + String.format("%.2f", valueFinal());
    }
}
