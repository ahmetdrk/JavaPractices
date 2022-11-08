package day39_Recap.shapeTask;

public class Rectangle extends Shape {

    private double lenght, width;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        if (lenght <= 0) {
            System.err.println("Invalid Lenght" + lenght);
            System.exit(1);
        }
        this.lenght = lenght;
    }

    public double getWidth() {
        if (width <= 0) {
            System.err.println("Invalid width" + width);
        }
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double lenght, double width) {
        super("Rectangle");
        setLenght(lenght);
        setWidth(width);

    }

    @Override
    public double area() {
        return lenght * width;
    }

    @Override
    public double perimeter() {
        return 2 * (lenght + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                ",area='" + area() + '\'' +
                ",perimeter='" + perimeter() + '\'' +
                '}';
    }
}
