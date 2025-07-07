import java.util.Scanner;
public class Palindrom{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int temp = n;
int r=0;
void num(){
while(n>0){
r = r*10+(n%10);
n/=10;
}
if(r==temp){
System.out.println("Palindrom");
}
else{
System.out.println("Not Palindrom");
}
}
public static void main(String [] args){
Palindrom p = new Palindrom();
p.num();
}
}