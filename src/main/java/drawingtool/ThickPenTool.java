package drawingtool;

import shapes.Shape;

/**
 * Created by sayantjm on 21/11/20
 * New DrawingTool created for ThickPen
 * drawing method updated for drawing the original shape with the ThickPen decoration
 */
public class ThickPenTool extends DrawingTool {
    private Shape shape;

    public ThickPenTool(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String draw() {
        return shape.draw().concat("...with thick Pen.");
    }

    @Override
    public String getDescription() {
        return shape.getDescription();
    }
}
