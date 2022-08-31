package com.area;

public class Square {
    public int getSideLenght() {
        return sideLenght;
    }



    public void setSideLenght(int sideLenght) {
        this.sideLenght = sideLenght;
    }

    private int sideLenght;

    public int AreaCal(){
        return (this.sideLenght*this.sideLenght);

    }



}
