import java.util.Scanner;
public class NumberPositiveNegativeZero{
void num(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter n value: ");
int n = sc.nextInt();
if(n==0){
System.out.println("Zero");
}
else if(n<0){
System.out.println("Negative Number");
}
else if(n>0){
System.out.println("Positive Number");
}
}
public static void main(String [] args){
NumberPositiveNegativeZero np = new NumberPositiveNegativeZero();
np.num();
}
}