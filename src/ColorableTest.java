public class ColorableTest {
    public static void main(String[] args){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.3, "red", true);
        shapes[1] = new Rectangle(3,4,"blue", false);
        shapes[2] = new Square("red", true, 1.3);
        for(Shape s : shapes){
            if(s instanceof Colorable){
                ((Colorable) s).howToColor();
            }
            else{
                System.out.println(s.getArea());
            }
        }
    }
}
