import java.util.Scanner;
public class SumOfDigit{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int r=0;
int sum=0;
void digit(){
for(int i=0;n>0; i++){
r=n%10;
sum += r;
n/=10;
}
System.out.println(sum);
}
public static void main(String [] args){
SumOfDigit sd = new SumOfDigit();
sd.digit();
}
}