import java.util.Scanner;
public class FactorialValues{
int ans =1;
public int fact(int n){
for(int i=1; i<=n; i++){
ans *= i;
}
System.out.println(ans);
return ans;
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter n value:");
int n = sc.nextInt();
FactorialValues f = new FactorialValues();
f.fact(n);
}
}