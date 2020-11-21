package shapes;

/**
 * Created by sayantjm on 21/11/20
 */
public class Circle extends Shape {
    public Circle() { description = "Circle";}

    public String draw() {
        return "Drawing a...".concat(this.description);
    }
}
