package com.area;

public class triangle {
    private int base;
    private int perH;

    public void setBase(int base){
        this.base = base;
    }
    public void setPerH(int perh){
        this.perH =perh;
    }
    public int getBase(){
        return this.base;
    }
    public int getPerH(){
        return this.perH;
    }
   public double areaCalc(){
        return (this.base*this.perH*0.5);
   }
   public triangle(int base, int per){
        this.base =base;
        this.perH =per;
       // return this.areaCalc();
   }
}
