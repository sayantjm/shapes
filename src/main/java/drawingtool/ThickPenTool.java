package drawingtool;

import shapes.Shape;

/**
 * Created by sayantjm on 21/11/20
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
