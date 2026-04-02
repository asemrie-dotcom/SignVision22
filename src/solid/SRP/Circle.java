/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.SRP;


public class Circle implements Shape {
    public double raduis;

    public Circle(double raduis) {
        this.raduis = raduis;
    }
    @Override
    public double area() {
        return Math.PI* Math.pow(this.raduis, 2);
    }
}
