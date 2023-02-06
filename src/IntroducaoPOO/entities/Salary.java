package IntroducaoPOO.entities;

public class Salary {

    public String name;

    public double grossSalary;

    public double tax;

    public double netSalary(){
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percetage){
        this.grossSalary = (percetage + 100) / 100 * (this.grossSalary - this.tax);
    }

    public String toString(){
        return "Updated data: " + this.name + ", $ " + String.format("%.2f", this.grossSalary);
    }
}
