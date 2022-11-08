package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);
        System.out.println(square);

        square.setSide(15);  // bu sekilde de kenar uzunlugu verilebilir
        System.out.println(square);

        System.out.println("----------------------------------");

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle);

        rectangle.setLenght(10);
        System.out.println(rectangle.getLenght());

        System.out.println(rectangle.getName());

        System.out.println("-------------------------");

        Circle circle = new Circle(7.5);

        circle.setRadius(15.5);

        System.out.println(circle.getRadius());  // yeniden yazdigimiz radius degerini yazdirmak icin

        System.out.println(circle);


    }
}
