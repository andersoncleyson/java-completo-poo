package ExercicioPolimorfismo.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct(){}

    public UsedProduct(String name, Double price, Date manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        String data = sdf.format(this.manufactureDate);
        return data;
    }

    @Override
    public String toString(){
        return this.getName() + " (used) $" + this.getPrice() +
                " (Manafacture date: " + priceTag() + ")";
    }
}
