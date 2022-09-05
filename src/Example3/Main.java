package Example3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        while(true) {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to add New Student ? (Y/N)");
        String opt = input.next();
        System.out.println();
        int max=0;
        int total =0;


            switch (opt) {
                case "Y":
                    System.out.print("Enter student name: ");
                    String name = input.next();
                    System.out.print("Enter student adress: ");
                    String address = input.next();
                    System.out.print("No of subjects: ");
                    int subjects = input.nextInt();
                    int[] marks = new int[subjects];
                    for (int i = 0; i < subjects; i++) {
                        System.out.print("enter subject " + (i + 1) + " Marks: ");
                        marks[i] = input.nextInt();

                    }
                    System.out.println("A. Student Details:");
                    System.out.println("B. All marks:");
                    System.out.println("C. maximum Marks:");
                    System.out.println("D. Show total, average & result:");
                    System.out.println("X. exist:");
                    System.out.println();

                    while (true) {
                        System.out.println("Please select one option: ");
                        String opt2 = input.next();

                        switch (opt2) {
                            case "A":
                                System.out.println("Student name: " + name);
                                System.out.println("Student address: " + address);
                                break;
                            case "B":
                                for (int j = 0; j < marks.length; j++) {
                                    System.out.println("subject " + (j + 1) +" marks " +marks[j]);
                                    total = total + marks[j];

                                }
                                break;
                            case "C":
                                for (int k = 0; k < marks.length; k++) {
                                    if (marks[k] > max) {
                                        max = marks[k];
                                    }


                                }
                                System.out.println("Maximum marks: " + max);
                                break;
                            case "D":
                                System.out.println("total: " + total);
                                System.out.println("average: " + (double) (total / subjects));
                                if ((total / subjects) > 50) {
                                    System.out.println("result: pass ");
                                } else {
                                    System.out.println("result: fail ");
                                }
                                break;
                            case "X":
                                System.out.println("have a nice day");
                                return;
                            default:
                                System.out.println("enter valid input retry ");
                                break;
                        }
                    }
                case "N":
                    System.out.println("good bye");
                    return;
                default:
                    System.out.println("please enter valid latter:");
                    break;


            }
        }
    }
}
