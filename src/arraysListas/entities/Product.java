package arraysListas.entities;

public class Product {
    private String name;
    private double precoProduto;

    public Product(String name, double precoProduto){
        this.name = name;
        this.precoProduto = precoProduto;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrecoProduto(double precoProduto){
        this.precoProduto = precoProduto;
    }

    public double getPrecoProduto(){
        return precoProduto;
    }

    public String toString(){
        return this.name + " " + this.precoProduto;
    }
}
