public class Square extends Rectangle {

    public Square(Point centerPoint, double side) {
        super(centerPoint, side, side);  // Hình vuông là hình chữ nhật có 2 cạnh bằng nhau
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public String getDetail() {
        return getName() + " - center: " + getCenterPoint() + ", side: " + getSide();
    }

    public double getSide() {
        return superWidth();
    }

    private double superWidth() {
        try {
            java.lang.reflect.Field field = Rectangle.class.getDeclaredField("width");
            field.setAccessible(true);
            return (double) field.get(this);
        } catch (Exception e) {
            return 0;
        }
    }
}
