import java.util.Scanner;
public class OddOrEven{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
void num(){
if(n%2==0){
System.out.println("Even Number");
}
else{
System.out.println("Odd Number");
}
}
public static void main(String [] args){
OddOrEven oe = new OddOrEven();
oe.num();
}
}