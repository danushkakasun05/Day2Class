package com.area;

public class Circle {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    public double AreaCal(){
        return(this.radius*2*3.14);
    }
    public Circle(int radi){
        this.radius=radi;
        //return this.AreaCal();
    }
}
