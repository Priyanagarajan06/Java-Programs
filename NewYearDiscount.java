import java.util.Scanner;
public class NewYearDiscount{
void discount(){
Scanner sc = new Scanner(System.in);
int billAmount = sc.nextInt();
int digit=0;
int sum=0;
while(billAmount>0){
digit = billAmount%10;
if(billAmount%2==1){
sum += digit;
}
billAmount/=10;
}
System.out.print(sum);
}
public static void main(String [] args){
NewYearDiscount nyd = new NewYearDiscount();
nyd.discount();
}
}