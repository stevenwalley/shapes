package edu.cvtc.shapes;

import javax.swing.JOptionPane;

public class Cylinder extends Shapes  {
	
    private float radius, height;

    //constructor
    public Cylinder(float radius, float height)  {
        this.radius = radius;
        this.height = height;
    }

    //getters & setters
    public float getRadius()  {
        return radius;
    }

    public void setRadius(float radius)  {
        this.radius = radius;
    }

    public float getHeight()  {
        return height;
    }

    public void setHeight(float height)  {
        this.height = height;
    }



    @Override
    public float surfaceArea()  { 
        return (float) (2 * Math.PI * radius * (radius + height));
    }

    @Override
    public float volume()  { 
        return (float) (Math.PI * radius * radius * height);
    }



    @Override
    public void render()  { 
        JOptionPane.showMessageDialog(null, "The cylinder has a:" + System.lineSeparator() +
                "Radius = " + radius + System.lineSeparator() +
                "Height = " + height + System.lineSeparator() +
                "Surface Area = " + surfaceArea() + System.lineSeparator() +
                "Volume = " + volume());


    }
}
