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
Used the Decorator Design Pattern
