import java.util.* ;
import java.io.*; 
public class EvenSumTillN{
public static int evenSumTillN(int n){
int sum=0;
for(int i=2;i<=n;i+=2){
sum += i;
}
System.out.println(sum);
return sum;
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Input:");
int n =sc.nextInt();
EvenSumTillN es = new EvenSumTillN();
es.evenSumTillN(n);
}
}