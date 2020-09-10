package edu.cvtc.shapes;

import javax.swing.JOptionPane;

public class Cuboid extends Shapes  {

      private float width, height, depth;

    // constructor
    public Cuboid(float width, float height, float depth)  {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

   
	//getters & setters
    public float getWidth() {
        return width;
    }

    public void setWidth(float width)  {
        this.width = width;
    }

    public float getHeight()  {
        return height;
    }

    public void setHeight(float height)  {
        this.height = height;
    }

    public float getDepth()  {
        return depth;
    }

    public void setDepth(float depth)  {
        this.depth = depth;
    }

  
    @Override
    public float surfaceArea()  { 
        return 2 * (depth * width + width * height + height * depth);
    }

    @Override
    public float volume()  { 
        return depth * width * height;
    }

    @Override
    public void render()  { 

        JOptionPane.showMessageDialog(null, "The cuboid has a:" + System.lineSeparator() +
                "Width = " + width + System.lineSeparator() +
                "Height = " + height + System.lineSeparator() +
                "Depth = " + depth + System.lineSeparator() +
                "Surface Area = " + surfaceArea() + System.lineSeparator() +
                "Volume = " + volume());


    }
}

