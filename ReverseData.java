import java.util.Scanner;
public class ReverseData{
void revdata(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int digit =0;
while(n>0){
digit = n%10;
System.out.print(digit+" ");
n/=10;
}
}
public static void main(String [] args){
ReverseData rd1 = new ReverseData();
rd1.revdata();
}
}