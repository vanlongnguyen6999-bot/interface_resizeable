public class CircleTest {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[1] = new Circle(3.5);
        circle[2] = new Circle(3.5, "indigo", false);
        double percent = Math.random()*100;
        for(Circle c: circle){
            System.out.println("Before:" + c);
            if(c instanceof Resizeable){
                ((Resizeable) c).resize(percent);
                System.out.println("After:" + c);
            }
        }
    }
}