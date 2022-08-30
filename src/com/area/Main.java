package com.area;

public class Main {
    public static void main(String[] args) {
        SquareCalculator sqcal = new SquareCalculator();
        sqcal.setHeight(18);
        sqcal.setWidth(14);
        //System.out.println("area calculate: "+sqcal.getHeight()*sqcal.getWidth());
        System.out.println("area of rectangle: "+ sqcal.areaCalc());
        sqcal.setBase(12);
        sqcal.setPerdis(15);
        System.out.println("Trangle area:"+ sqcal.areaTrangle());
        sqcal.setRadius(7);
        System.out.println("area of the circle: "+sqcal.areaCircle());
        sqcal.setSideLength(12);
        System.out.println("area of the square: "+sqcal.areaSquare());

        sqcal.rectangle(12,15);

        sqcal.rectangle(12,13);
        sqcal.circle(12);
        sqcal.trangle(12,13);
        sqcal.square(10);

}
}