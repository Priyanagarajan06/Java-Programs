import java.util.Scanner;
public class EmployeeRatingPoint{
void emprating(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if(n>30 &&n<=50){
System.out.println("D");
}
else if(n>50&&n<=60){
System.out.println("C");
}
else if(n>60&&n<=80){
System.out.println("B");
}
else if(n>80&&n<=100){
System.out.println("A");
}
}
public static void main(String [] args){
EmployeeRatingPoint erp = new EmployeeRatingPoint();
erp.emprating();
}
}