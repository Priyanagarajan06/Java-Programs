import java.util.Scanner;
public class TotalBill{
void totalbill(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int digit =0;
int sumOdd = 0;
int sumEven =0;
int res =0;
while(n>0){
digit = n%10;
if(digit%2==1){
sumOdd += digit;
}
else{
sumEven += digit;
}
n/=10;
}
res = sumOdd*sumEven;
System.out.println(res);
}
public static void main(String [] args){
TotalBill tb = new TotalBill();
tb.totalbill();
}
}