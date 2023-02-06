package IntroducaoPOO;

import IntroducaoPOO.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.printf("Name: ");
        String nome = sc.next();

        System.out.printf("Price: ");
        double preco = sc.nextDouble();

        System.out.printf("Quantity in stock: ");
        int quantidade = sc.nextInt();

        Product product = new Product(nome, preco, quantidade);

        System.out.println("Product data: " + product);

        //System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f\n\n", product.name, product.price, product.quantity, product.totalValueInStock());
        System.out.println();
        int quantity;
        System.out.printf("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated data: " + product);
        //System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f\n\n", product.name, product.price, product.quantity, product.totalValueInStock());

        System.out.println();
        System.out.printf("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Product data:" + product);

        //System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f\n", product.name, product.price, product.quantity, product.totalValueInStock());

        sc.close();
    }
}
