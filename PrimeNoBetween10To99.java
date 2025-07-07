import java.util.Scanner;
public class PrimeNoBetween10To99{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
boolean isPrime = false;
int i=0;
void prime(){
for(i=n;i<100;i++){
isPrime = true;
if(i<=1){
isPrime = false;
}
else{
for(int j=2; j<=i/2; j++){
if(i%j==0){
isPrime = false;
break;
}
}
}
if(isPrime==true){
System.out.print(i+" ");
}
}
}
public static void main(String [] args){
PrimeNoBetween10To99 pn = new PrimeNoBetween10To99();
pn.prime();
}
}