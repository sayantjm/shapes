package shapes;

/**
 * Created by sayantjm on 21/11/20
 * New Shape for Circle
 * The method draw() is returning the name of the Shape being drown
 */
public class Circle extends Shape {
    public Circle() { description = "Circle";}

    public String draw() {
        return "Drawing a...".concat(this.description);
    }
}
