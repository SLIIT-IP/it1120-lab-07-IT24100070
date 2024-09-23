import java.util.Scanner;
public class IT24100070Lab7Q3{
  public static void main(String[] arg)
  {
  Scanner input = new Scanner(System.in);
 
  int num[] = new int[5];
  int i;

  for (i=1; i<=5; i++)
  {
  System.out.println("Customer "+(i));
  
  System.out.print("Enter total bill amount : ");
  double totalamount = input.nextDouble();
  
  System.out.print("Enter mode of payment(C for cash,O for other) : ");
  char modeofpayment = input.next().charAt(0);
  

  if(modeofpayment == 'C' || modeofpayment == 'c')
  {
  double discountamount = totalamount*5/100;
  System.out.println("Discount is : " +discountamount);
  double amount = totalamount - discountamount;
  System.out.println("Amount to be paid : "+amount);
  }
 
  else if(modeofpayment == 'O' || modeofpayment == 'o')
  {
  System.out.println("No discount applicable");
  double discountamount = 0;
  double amount = totalamount - discountamount;
  System.out.println("Amount to be paid : "+amount);
  }

  else
  {
  System.out.println("Payment Mode is Not Valid");
  }
  }
  }
}