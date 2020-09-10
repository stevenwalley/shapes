package edu.cvtc.shapes;

import javax.swing.JOptionPane;

public class Sphere extends Shapes  {
	
    
    private float radius, height;


    //constructor
    public Sphere(float radius)  {
        this.radius = radius;

    }

    //getters & setters
    public float getRadius()  {
        return radius;
    }

    public void setRadius(float radius)  {
        this.radius = radius;
    }

    //methods
    @Override
    public float surfaceArea()  { 
        return (float) (4 * Math.PI * radius * radius);
    }

    @Override
    public float volume()  { 
        return (float) ((4.0 / 3) * Math.PI * radius * radius * radius);
    }

    @Override
    public void render() { 

       JOptionPane.showMessageDialog(null, "The sphere has a:" + System.lineSeparator() +
                "Radius = " + radius + System.lineSeparator() +
                "Surface Area = " + surfaceArea() + System.lineSeparator() +
                "Volume = " + volume());


    }
}