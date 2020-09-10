package edu.cvtc.shapes;

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(1, 1, 1);
        Cylinder cylinder = new Cylinder(1,1);
        Sphere sphere = new Sphere(1);

        
        cuboid.render();
        cylinder.render();
        sphere.render();

    }
}