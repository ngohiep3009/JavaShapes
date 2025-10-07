import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(new Point(0, 0), 5));
        shapes.add(new Rectangle(new Point(2, 3), 4, 6));
        shapes.add(new Square(new Point(5, 5), 3));
        shapes.add(new Circle(new Point(-2, 4), 2));

        System.out.println("Số lượng hình đã khởi tạo: " + Shape.getCount());
        System.out.println();

        System.out.println("Danh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.println(" - " + s.getDetail());
        }
        System.out.println();

        System.out.println("Danh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(" - " + s.getName() + ": " + s.getCenterPoint());
        }
    }
}
