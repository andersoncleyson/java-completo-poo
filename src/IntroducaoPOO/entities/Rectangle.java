package IntroducaoPOO.entities;

public class Rectangle {

    public double width;

    public double height;

    public double areaCalculo (){
        return this.width * this.height;
    }

    public double perimeterCalculo(){
        return 2 * (this.width + this.height);
    }

    public double diagonalCalculo(){
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
    }

    public String toString(){
        return "AREA = " + String.format("%.2f", areaCalculo()) + "\n"
                + "PERIMETER = " + String.format("%.2f", perimeterCalculo()) + "\n"
                + "DIAGONAL = " + String.format("%.2f", diagonalCalculo());
    }

}
