/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solid;

import java.util.ArrayList;
import java.util.List;
import solid.SRP.AreaCalculator;
import solid.SRP.Circle;
import solid.SRP.Shape;
import solid.SRP.Square;

public class SOLID {

    public static void main(String[] args) {
        Shape sq1 = new Square(10);
        Shape sq2 = new Square(15);
        Shape cir1 = new Circle(10);
        Shape cir2 = new Circle(10);
        List<Shape> shapes = new ArrayList();
        shapes.add(sq1);
        shapes.add(sq2);
        shapes.add(cir1);
        shapes.add(cir2);
        AreaCalculator ac = new AreaCalculator(shapes);
        ac.Sum();
        ac.Output();
    }

}
