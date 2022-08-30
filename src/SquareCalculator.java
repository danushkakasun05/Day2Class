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
}
