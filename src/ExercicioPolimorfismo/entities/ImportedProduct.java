package ExercicioPolimorfismo.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){}

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(Double customFee){
        return getPrice() + customFee;
    }

    @Override
    public String priceTag(){
        return String.format("%.2f", totalPrice(this.customsFee));
    }

    @Override
    public String toString(){
        return getName() + " $" + priceTag() + " Customs fee: $ "
                + String.format("%.2f", this.customsFee);
    }
}
