package ClassesMetodosAbstrados.entities;

import ClassesMetodosAbstrados.entities.enums.Color;

public class Rectangule extends Shape{
    private Double width;
    private Double height;

    public Rectangule() {}

    public Rectangule(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area(){
        return this.width * this.height;
    }
}
