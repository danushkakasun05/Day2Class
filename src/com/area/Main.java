package com.area;


public class Main {
    public static void main(String[] args) {
        Square sq =new Square(12);
        sq.setSideLenght(12);
        System.out.println("Area of Square: "+sq.AreaCal());
        System.out.println();

        Circle crl =new Circle(7);
        crl.setRadius(14);
        System.out.println("Area of Circle: "+crl.AreaCal());
        System.out.println();

        triangle tri = new triangle(12,12);
        tri.setBase(12);
        tri.setPerH(10);
        System.out.println("Area of Triangle: "+tri.areaCalc());
        System.out.println();

        Rectangle rec =new Rectangle(12,12);
        rec.setLength(12);
        rec.setWidth(10);
        System.out.println("Area of Triangle: "+rec.areaCal());

        //System.out.println("Square: "+sq.squareNew(12));
        //System.out.println("circle; "+crl.circleNew(7));
        //System.out.println("Triangle; "+tri.triangleNew(12,10));
        //System.out.println("Rectangle: "+rec.rectangleNew(12,10));

        Rectangle rectan = new Rectangle(10,10);
        System.out.println(rectan.areaCal());
        }
}
