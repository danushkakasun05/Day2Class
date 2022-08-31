package com.area;

public class Main {
    public static void main(String[] args) {
        Square sq =new Square();
        sq.setSideLenght(12);
        System.out.println("Area of Square: "+sq.AreaCal());
        System.out.println();

        Circle crl =new Circle();
        crl.setRadius(7);
        System.out.println("Area of Circle: "+crl.AreaCal());
        System.out.println();

        triangle tri = new triangle();
        tri.setBase(12);
        tri.setPerH(10);
        System.out.println("Area of Triangle: "+tri.areaCalc());
        System.out.println();

        Rectangle rec =new Rectangle();
        rec.setLength(12);
        rec.setWidth(10);
        System.out.println("Area of Triangle: "+rec.areaCal());

        System.out.println("Square: "+sq.squareNew(12));
        System.out.println("circle; "+crl.circleNew(7));
        System.out.println("Triangle; "+tri.triangleNew(12,10));
        System.out.println("Rectangle: "+rec.rectangleNew(12,10));


        }
}
