package Example1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of subjects: ");
        int subjects = input.nextInt();
        System.out.println();
        int total=0;
        int marks =0;
        for(int i=0;i<subjects;i++){
            System.out.print("Enter subject "+(i+1)+" Marks");
            marks = input.nextInt();
            if (marks>100) {
                System.out.println("Invalid marks");
                i = i - 1;
                continue;
            }else if(marks<0){
                System.out.println("Invalid marks");
                i = i - 1;
                continue;
                }else{ total=total+marks;

            }

            }
        System.out.println("total marks: "+total);
        }
    }

