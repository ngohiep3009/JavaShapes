public class Circle extends Shape {
    private double radius;

    public Circle(Point centerPoint, double radius) {
        super(centerPoint);
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public String getDetail() {
        return getName() + " - center: " + centerPoint + ", radius: " + radius;
    }
}
