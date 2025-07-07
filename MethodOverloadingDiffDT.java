import java.util.Scanner;
public class MethodOverloadingDiffDT{
public int add(int num1, int num2) {
return num1 + num2;
}
public double add(int num1, int num2,double num3) {
return num1 + num2 + num3;
}
public static void main(String args[]) {
MethodOverloadingDiffDT modd = new MethodOverloadingDiffDT();
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
double num3 = sc.nextDouble();
int sumOfTwoNumbers = modd.add(num1,num2);
double sumOfThreeNumbers = modd.add(num1,num2,num3);
System.out.println(sumOfTwoNumbers);
System.out.println(sumOfThreeNumbers);
}		
}