package arraysListas;

import arraysListas.entities.Employes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employes> listaEmpregados = new ArrayList<>();

        System.out.printf("How many employees will be registred? ");
        int numeroDeEmpregados = sc.nextInt();

        for(int i = 0; i < numeroDeEmpregados; i++){
            System.out.println("Emplyoee #" + (i + 1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            while(hasId(listaEmpregados, id)){
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            listaEmpregados.add(new Employes(id, name, salary));
        }

        System.out.println();
        System.out.printf("Enter the employee id that will have salary increase: ");
        int searchId = sc.nextInt();

        Employes emp = listaEmpregados.stream().filter(x -> x.getId() == searchId).findFirst().orElse(null);

        if(emp == null){
            System.out.println("This id does not exist!");
        } else{
            System.out.println("Enter the percentage: ");
            double percetage = sc.nextDouble();
            emp.increaseSalary(percetage);
        }

        for(Employes empregados : listaEmpregados ){
            System.out.println(empregados);
        }

        sc.close();
    }

    public static Integer position(List<Employes> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employes> list, int id){
        Employes emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
