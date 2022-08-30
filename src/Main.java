public class Main {
    public static void main(String[] args) {
        SquareCalculator sqcal = new SquareCalculator();
        sqcal.setHeight(18);
        sqcal.setWidth(14);
        //System.out.println("area calculate: "+sqcal.getHeight()*sqcal.getWidth());
        System.out.println("area: "+ sqcal.areaCalc());
    }
}
