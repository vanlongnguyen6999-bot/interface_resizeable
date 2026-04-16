public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[3];
        rectangle[1] = new Rectangle(2.3, 5.8);
        rectangle[2] = new Rectangle(2.5, 3.8, "orange", true);
        double percent = Math.random() * 100;
        for(Rectangle r: rectangle){
            if(r instanceof Resizeable){
                System.out.println("Before: " + r);
                ((Resizeable) r).resize(percent);
                System.out.println("After: " + r);
            }
        }
    }
}
