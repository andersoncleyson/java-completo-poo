package arraysListas.entities;

public class Employes {

    private Integer id;
    private String name;
    private Double salary;

    public Employes(){}

    public Employes(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    public Double getSalary(){return salary;}

    public void increaseSalary(double increase){
        this.salary = (increase / 100) * this.salary + this.salary;
    }

    public String toString(){
        return this.id + ", " + this.name + ", " + String.format("%.2f", this.salary);
    }

    
}
