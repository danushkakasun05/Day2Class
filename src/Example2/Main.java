package Example2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers =new int [5];
        for (int i=0;i<5;i++){
            System.out.print("enter your "+(i+1)+" Number: ");
            numbers[i]= input.nextInt();

        }
        System.out.print("[ ");
        for (int j=0;j<5;j++){
            System.out.print(numbers[j]+" ");
        }
        System.out.print("]");
    }

}
