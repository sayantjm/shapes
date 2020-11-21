import drawingtool.RedBorderDrawing;
import drawingtool.ThickPenTool;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by sayantjm on 21/11/20
 */
public class DrawingToolsTest {
    public static final String RECTANGLE_DROWN = "Drawing a...Rectangle";
    public static final String RECTANGLE_WITH_RED_BORDER = "...with red border.";
    public static final String RECTANGLE_WITH_THICK_PEND = "...with thick Pen.";

    private Shape rectangle;

    @BeforeEach
    public void setup() {
        this.rectangle = new Rectangle();
    }

    @Test
    public void given_a_rectangle_with_redBorderAdded_when_drawIsTriggered_then_rectangleIsDrownWithRedBorder() {
        this.rectangle = new RedBorderDrawing(this.rectangle);
        assertEquals(RECTANGLE_DROWN.concat(RECTANGLE_WITH_RED_BORDER), this.rectangle.draw());
    }

    @Test
    public void given_a_rectangle_with_thickPenAdded_when_drawIsTriggered_then_rectangleIsDrownWithThickPen() {
        this.rectangle = new ThickPenTool(this.rectangle);
        assertEquals(RECTANGLE_DROWN.concat(RECTANGLE_WITH_THICK_PEND), this.rectangle.draw());
    }

    @Test
    public void given_a_rectangle_with_redBorderAndThickPenAdded_when_drawIsTriggered_then_rectangleIsDrownWithRedBorderAndThickPen() {
        this.rectangle = new RedBorderDrawing(this.rectangle);
        this.rectangle = new ThickPenTool(this.rectangle);
        assertEquals(RECTANGLE_DROWN.concat(RECTANGLE_WITH_RED_BORDER).concat(RECTANGLE_WITH_THICK_PEND), this.rectangle.draw());
    }
}
