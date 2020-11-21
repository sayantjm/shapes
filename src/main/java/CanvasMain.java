import drawingtool.RedBorderDrawing;
import drawingtool.ThickPenTool;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

/**
 * Created by sayantjm on 21/11/20
 */
public class CanvasMain {
    public static void main(String... args) {
        Shape simpleRectangle = new Rectangle();
        System.out.println(simpleRectangle.getDescription().concat("->").concat(simpleRectangle.draw()));

        Shape rectangleWithRedBorder = new Rectangle();
        rectangleWithRedBorder = new RedBorderDrawing(rectangleWithRedBorder);
        rectangleWithRedBorder = new ThickPenTool(rectangleWithRedBorder);
        System.out.println(rectangleWithRedBorder.getDescription().concat("->".concat(rectangleWithRedBorder.draw())));

        Shape circle = new Circle();
        circle = new ThickPenTool(circle);
        System.out.println(circle.getDescription().concat("->").concat(circle.draw()));
    }
}
