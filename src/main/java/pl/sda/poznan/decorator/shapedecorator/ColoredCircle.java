package pl.sda.poznan.decorator.shapedecorator;

public class ColoredCircle implements Shape {
    private Circle circleToDecorate;
    private String color;


    public ColoredCircle(Circle circle,String color) {
        this.color = color;
       this.circleToDecorate = circle;
    }

    @Override
    public String info() {
        return circleToDecorate.info() + " has the color "+color;
    }
}
