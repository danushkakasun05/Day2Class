package com.area;

public class Rectangle {
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int length;
    private int width;

    public int areaCal(){
        return this.length*this.width;
    }
    public Rectangle(int lenght, int width){
        this.width=width;
        this.length = lenght;
        //return(this.areaCal());
    }
}
