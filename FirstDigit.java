import java.util.Scanner;
public class FirstDigit{
public void first(int n) {
while(n>=10){
n = n / 10;
}
System.out.println(n);
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter n value:");
int n = sc.nextInt();
FirstDigit f = new FirstDigit();
f.first(n);
}
}