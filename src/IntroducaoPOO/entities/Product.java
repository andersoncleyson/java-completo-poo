package IntroducaoPOO.entities;

public class Product {
<<<<<<< HEAD
    public String name;
    public double price;
    public int quantity;

    //Construtor

=======
    private String name;
    private double price;
    private int quantity;

    //Construtor

    // É possível também incluir um construtor padrão

    public Product(){}

>>>>>>> 92599ebf4f1179367d62b15cc4633ff7fe0cc946
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

<<<<<<< HEAD
=======
    // Vamos criar um construtor opcional, o qual recebe apenas nome e preço
    // do produto. A quantidade em estoque deste novo produto, por padrão,
    // deverá então ser iniciada com o valor zero.

    public Product(String name, double price){
        this.name = name;
        this.price = price;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

>>>>>>> 92599ebf4f1179367d62b15cc4633ff7fe0cc946
    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return this.name
                + ", $ "
                + String.format("%.2f", this.price)
                + ", "
                + this.quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
