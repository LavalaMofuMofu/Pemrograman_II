package Praktikum5.soal1;

public class Rectangle extends Shape{
    private Double length;
    private Double width;

    public Rectangle(String shapeName, Double lenght, Double width) {
        super("Rectangle");
        this.shapeName = shapeName;
        this.length = lenght;
        this.width = width;
    }

    public void setLength(Double length){
        this.length = length;
    }

    public void setWidth(Double width){
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    public Double area() {
        return getLength() * getWidth();
    }

    @Override
    public String toString() {
        return super.toString() + " of Length " + getLength() + " Width " + getWidth();
    }
}
