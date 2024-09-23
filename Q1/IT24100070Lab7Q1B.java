import java.util.Scanner;
public class IT24100070Lab7Q1B{
  public static void main(String[] arg)
  {
  Scanner input = new Scanner(System.in);
  int mark[] = new int[4];
  int i;  

   for(i=1; i<4; i++)
   {
      System.out.println("Student "+i);

      System.out.print("Enter marks : ");
      int mark1 = input.nextInt();
      int mark2 = input.nextInt();
      int mark3 = input.nextInt();
      int mark4 = input.nextInt();
 
      double avg = (mark1+mark2+mark3+mark4)/4.0;
      System.out.println("Average is : "+avg);
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
    
     System.out.println();
   }
  }
}

