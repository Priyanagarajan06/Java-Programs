import java.util.Scanner;
public class Factorial{
void onlinegame(){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int count = 0;
for(int i =5; n/i>=1; i*=5){
count +=n/i;
}
System.out.println(count);
}
public static void main(String [] args){
Factorial f = new Factorial();
f.onlinegame();
}
}