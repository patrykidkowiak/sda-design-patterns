package pl.sda.poznan.decorator.shapedecorator;

import sun.security.provider.SHA;

public class TransparentCircle implements Shape {
    private Shape circle;
    private double transparencyLevel;

    public TransparentCircle(Shape circle, double transparencyLevel) {
        this.circle = circle;
        this.transparencyLevel = transparencyLevel;
    }



    @Override
    public String info() {
        return circle.info()+", transparent in "+transparencyLevel+"%";
    }
}
