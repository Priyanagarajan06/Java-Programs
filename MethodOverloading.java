import java.util.Scanner;
public class MethodOverloading{
public int add(int num1, int num2) {
return num1 + num2;
}
public int add(int num1, int num2, int num3) {
return num1 + num2 + num3;
}
public static void main(String args[]) {
MethodOverloading mo = new MethodOverloading();
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
int num3 = sc.nextInt();
int sumOfTwoNumbers = mo.add(num1,num2);
int sumOfThreeNumbers = mo.add(num1,num2,num3);
System.out.println(sumOfTwoNumbers);
System.out.println(sumOfThreeNumbers);
}		
}