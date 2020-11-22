package drawingtool;

import shapes.Shape;

/**
 * Created by sayantjm on 21/11/20
 * New DrawingTool created for RedBorder
 * drawing method updated for drawing the original shape with the RedBorder decoration
 */
public class RedBorderDrawing extends DrawingTool {
    private Shape shape;

    public RedBorderDrawing(Shape shape) {
        if (null == shape) {
            throw new IllegalArgumentException("A valid shape is needed as parameter.");
        }
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
