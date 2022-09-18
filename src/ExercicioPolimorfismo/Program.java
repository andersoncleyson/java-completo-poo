package ExercicioPolimorfismo;

import ExercicioPolimorfismo.entities.ImportedProduct;
import ExercicioPolimorfismo.entities.Product;
import ExercicioPolimorfismo.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char opcao = sc.next().charAt(0);

            if(opcao == 'i'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Customns fee: ");
                Double tax = sc.nextDouble();

                list.add(new ImportedProduct(name, price, tax));

            } else if (opcao == 'u'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                try{
                    Date date = sdf.parse(sc.next());
                    list.add(new UsedProduct(name, price, date));
                } catch (Exception e){
                    System.out.println(e);
                }


            } else if(opcao == 'c'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price = sc.nextDouble();

                list.add(new Product(name, price));
            } else {
                System.out.println("OPÇÃO INVÁLIDA");
                System.out.println();
                i -= 1;
            }


        }
        System.out.println();
        System.out.println("PRICE TAGS");

        for(Product produto : list){
            System.out.println(produto);
        }
    }
}
