public class Square extends Shape implements Colorable {
    private double side = 1.0;

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side, double side1) {
        super(color, filled, side);
        this.side = side1;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public double getSide() {
        return side;
    }

    @Override
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four side");
    }
    public double getArea(){
        return side * side;
    }
    public double getPerimeter(){
        return 4 * side;
    }

}
