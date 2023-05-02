Import all the methods: java.awt.*; javax.swing.*, javax.swing.event.*, etc.


URPaint is the main class. Inside the URPaint constructor, I set the frame, add the control panel and the painted panel.


The control panel extends JPanel where the constructor stores the button and the slider. ActionPerformed determined whether the user clicked the square button or the red button. The RGB slider gets the color value.


The paint panel allows the user to pick a shape (either square or circle) and place it on the panel while clicking. PaintComponent is the overall method of painting through for loops of shapes.
Use paintSqaure or paintCircle method to paint the shape.


MouseClicked helped determine the button and the coordinates.


Implements ClickListener and DragListener for drag and drop.