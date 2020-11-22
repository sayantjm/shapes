package shapes;

/**
 * Created by sayantjm on 21/11/20
 * New Shape for Rectanble
 * The method draw() is returning the name of the Shape being drown
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
