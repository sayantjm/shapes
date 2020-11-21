package shapes;

/**
 * Created by sayantjm on 21/11/20
 */
public class Rectangle extends Shape {

    public Rectangle() {
        description = "Rectangle";
    }

    @Override
    public String draw() {
        return "Drawing a...".concat(this.description);
    }
}
