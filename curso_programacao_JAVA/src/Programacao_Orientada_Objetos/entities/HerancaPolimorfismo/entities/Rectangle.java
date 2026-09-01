package Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities;

import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.enums.Color;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height) {
        super();
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

}
