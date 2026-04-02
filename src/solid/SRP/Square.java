/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.SRP;

public class Square implements Shape {

    public double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return Math.pow(this.length, 2);
    }

}
