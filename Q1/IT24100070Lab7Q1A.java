import java.util.Scanner;
public class IT24100070Lab7Q1A{
 public static void main(String[] args)
 {
 Scanner input = new Scanner(System.in);

 System.out.println("Enter marks for four subjects: ");

 System.out.print("Enter Subject Mark 1 : ");
 int mark1 = input.nextInt();
 
 System.out.print("Enter Subject Mark 2 : ");
 int mark2 = input.nextInt();

 System.out.print("Enter Subject Mark 3 : ");
 int mark3 = input.nextInt();

 System.out.print("Enter Subject Mark 4 : ");
 int mark4 = input.nextInt();

 System.out.println();

    double avg = (mark1+mark2+mark3+mark4)/4.0;  
    System.out.println("Average is : " + avg);
    System.out.print("Overall Grade is : ");

     if(avg >= 75 && avg <= 100)
     {
     System.out.println("Distinction");
     }
     else if(avg >= 50 && avg <= 74)
     {
     System.out.println("Credit");  
     }
     else
     {
     System.out.println("Fail");
     }

  }
}