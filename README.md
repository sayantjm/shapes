## Background 
We have a shapes.Shape abstract class that represents geometric shapes.
With the draw() method the shape can draw itself, so a shapes.Rectangle can extend shapes.Shape and implement
it's own draw() method.
   
## The problem  
We want to add additional behaviour to the draw method, e.g. draw with a red border
or draw with a thick pen.  And we want to add this behaviour at runtime, not compile time. i.e.
If we package this class structure as a .jar then an external developer should be able to add new
type of behaviour to draw, without changing our existing code.
Design the class structure to support this.

## Solution
Used the Decorator Design Pattern.

In order to allow other developers to create new drawing tools, we have used the Decorator Design Pattern. 

The principal class is Shape, who defines the method draw for each shape.  

* For creating concret shapes, like Rectangle, we should extend Shape, and overwrite the method draw for the concrec class.
* For adding new drawing tools, like BluePenTool, we should create it in the drawingtool package extending the class DrawingTool, and overwriting the draw method which will be added to the concret shape.

## How to use them
We only need to create the shape and add to it all the decoration that we want to use, RedBorder, ThickPen, etc...

Example:

        `Shape rectangleWithRedBorder = new Rectangle();
         rectangleWithRedBorder = new RedBorderDrawing(rectangleWithRedBorder);
         rectangleWithRedBorder = new ThickPenTool(rectangleWithRedBorder);`

 
