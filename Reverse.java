import java.util.Scanner;
public class Reverse{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int r=0;
void num(){
while(n>0){
r = r*10+(n%10);
n/=10;

}
System.out.print(r);
}
public static void main(String [] args){
Reverse rs = new Reverse();
rs.num();
}
}