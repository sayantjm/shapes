package drawingtool;

import shapes.Shape;

/**
 * Created by sayantjm on 21/11/20
 */
public class RedBorderDrawing extends DrawingTool {
    private Shape shape;

    public RedBorderDrawing(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String getDescription() {
        return shape.getDescription();
    }

    @Override
    public String draw() {
        return shape.draw().concat("...with red border.");
    }
}
