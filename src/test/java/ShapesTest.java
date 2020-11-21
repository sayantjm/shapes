import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by sayantjm on 21/11/20
 */
public class ShapesTest {
    private Shape rectangle;
    private Shape circle;

    @BeforeEach
    public void setup() {
        this.rectangle = new Rectangle();
        this.circle = new Circle();
    }

    @Test
    public void given_a_rectangle_when_descriptionIsRequested_then_descriptionIsShown() {
        assertEquals("Rectangle", this.rectangle.getDescription());
    }

    @Test
    public void given_a_rectangle_when_drawIsTriggered_then_drawingResultsAreShown() {
        assertEquals("Drawing a...Rectangle", this.rectangle.draw());
    }

    @Test
    public void given_a_circle_when_descriptionIsRequested_then_descriptionIsShown() {
        assertEquals("Circle", this.circle.getDescription());
    }

    @Test
    public void given_a_circle_when_drawIsTriggered_then_drawingResultsAreShown() {
        assertEquals("Drawing a...Circle", this.circle.draw());
    }
}
