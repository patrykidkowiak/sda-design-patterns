package pl.sda.poznan.decorator;

import pl.sda.poznan.decorator.shapedecorator.Circle;
import pl.sda.poznan.decorator.shapedecorator.ColoredCircle;
import pl.sda.poznan.decorator.shapedecorator.TransparentCircle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Playground {
    public static void main(String[] args) throws FileNotFoundException {

  //    FileReader fileReader=new FileReader("plik.txt");
        //     BufferedReader bufferedReader = new BufferedReader(fileReader);

        Circle circle = new Circle(4);
        System.out.println(circle.info());

        ColoredCircle coloredCircle = new ColoredCircle(circle,"red");
        System.out.println(coloredCircle.info());

        TransparentCircle transparentCircle = new TransparentCircle(circle,70);
        System.out.println(transparentCircle.info());

        TransparentCircle transparentColoredCircle = new TransparentCircle(coloredCircle,70);
        System.out.println(transparentColoredCircle.info());




    }
}
