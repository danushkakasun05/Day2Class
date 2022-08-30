package com.area;

public class SquareCalculator {
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double width;
   public double areaCalc(){
       return this.width*this.height;
   }

    public int getSideLength() {
        return sideLength;
    }

    public int getRadius() {
        return radius;
    }

    public int getBase() {
        return base;
    }

    public int getPerdis() {
        return perdis;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setPerdis(int perdis) {
        this.perdis = perdis;
    }

    private int sideLength;
   private int radius;
   private int base;
   private int perdis;

   public int areaSquare () {
       return (this.sideLength * this.sideLength);
   }
   public double areaCircle(){
       return(2*3.14*this.radius);
   }
   public double areaTrangle(){
       return(this.base*this.perdis*0.5);
   }
   public double rectangle(double height, double width) {
       this.height = height;
       this.width = width;
       return(this.areaCalc());
   }
    public double trangle(int base,int perdis){
       this.base = base;
       this.perdis =perdis;
       return (this.areaTrangle());

    }
    public double circle(int radius){
       this.radius = radius;
       return(this.areaCircle());

    }
    public double square(int sidelength){
       this.sideLength =sidelength;
       return(this.areaSquare());
    }
   }

